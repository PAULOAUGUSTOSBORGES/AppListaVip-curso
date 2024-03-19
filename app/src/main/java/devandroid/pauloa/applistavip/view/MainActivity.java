package devandroid.pauloa.applistavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.pauloa.applistavip.R;
import devandroid.pauloa.applistavip.controller.PessoaController;
import devandroid.pauloa.applistavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    public static final String NOME_PREFERENCES = "pref_listavip";
    Pessoa pessoa;//declarando as variaveis
    PessoaController controller;
    EditText txt_nome;
    EditText txt_Sobrenome;
    EditText txt_curso;
    EditText txt_telefone;
    Button button_limpar;
    Button button_salvar;
    Button button_finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        SharedPreferences.Editor listaVip = preferences.edit();

        pessoa = new Pessoa();//declarando o objeto

        txt_curso = findViewById(R.id.Txt_curso);//declarando a variavel a setar a funçao na tela
        txt_nome = findViewById(R.id.txt_nome);
        txt_Sobrenome = findViewById(R.id.Txt_Sobrenome);
        txt_telefone = findViewById(R.id.Txt_telefone);
        button_finalizar = findViewById(R.id.button_finalizar);
        button_limpar = findViewById(R.id.button_limpar);
        button_salvar = findViewById(R.id.button_salvar);

        button_limpar.setOnClickListener(new View.OnClickListener() {// declarando que quando clicar no boton limpar, ele vai limpar a tela
            @Override
            public void onClick(View v) {
                txt_curso.setText("");
                txt_nome.setText("");
                txt_telefone.setText("");
                txt_Sobrenome.setText("");
            }
        });

        button_finalizar.setOnClickListener(new View.OnClickListener() {// finalizando o progrando e exibindo uma mensagem na tela apos clicar no boton finalizar
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        button_salvar.setOnClickListener(new View.OnClickListener() {// declarando o boton salvar para ele salvar os dados no objeto pessoa
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(txt_nome.getText().toString());
                pessoa.setSobreNome(txt_Sobrenome.getText().toString());
                pessoa.setCursoDesejado(txt_curso.getText().toString());
                pessoa.setTelefoneContato(txt_telefone.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();

                listaVip.putString("primeiro nome", pessoa.getPrimeiroNome());
                listaVip.putString("sobrenome", pessoa.getSobreNome());
                listaVip.putString("cursoDesejado", pessoa.getCursoDesejado());
                listaVip.putString("telefone", pessoa.getTelefoneContato());
                listaVip.apply();

                controller.salvar(pessoa);
            }
        });
    }
}