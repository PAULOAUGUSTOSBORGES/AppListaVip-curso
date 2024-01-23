package devandroid.pauloa.applistavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.pauloa.applistavip.R;
import devandroid.pauloa.applistavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Paulo Augusto");
        pessoa.setSobreNome("Silva Borges");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("6299967687");

    }
}