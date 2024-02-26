package devandroid.pauloa.applistavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.pauloa.applistavip.R;
import devandroid.pauloa.applistavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;//declarando as variaveis
    Pessoa outraPessoa;

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

        pessoa = new Pessoa();//declarando o objeto

        //pessoa.setPrimeiroNome("Paulo Augusto");
        //pessoa.setSobreNome("Silva Borges");
        //pessoa.setCursoDesejado("Android");
       //pessoa.setTelefoneContato("6299967687");

        //outraPessoa = new Pessoa();

        //outraPessoa.setPrimeiroNome("Isabella");
        //outraPessoa.setSobreNome("de carvalho");
        //outraPessoa.setCursoDesejado("farmacia");
        //outraPessoa.setTelefoneContato("62999676874");

        txt_curso = findViewById(R.id.Txt_curso);//declarando a variavel a setar a funçao na tela
        txt_nome = findViewById(R.id.txt_nome);
        txt_Sobrenome = findViewById(R.id.Txt_Sobrenome);
        txt_telefone = findViewById(R.id.Txt_telefone);
        button_finalizar = findViewById(R.id.button_finalizar);
        button_limpar = findViewById(R.id.button_limpar);
        button_salvar = findViewById(R.id.button_salvar);

        //txt_nome.setText(pessoa.getPrimeiroNome());
        //txt_Sobrenome.setText(pessoa.getSobreNome());
        //txt_curso.setText(pessoa.getCursoDesejado());
        //txt_telefone.setText(pessoa.getTelefoneContato());

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
                Toast.makeText(MainActivity.this,"volte sempre",Toast.LENGTH_LONG).show();
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

                Toast.makeText(MainActivity.this,"Salvo"+pessoa.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}