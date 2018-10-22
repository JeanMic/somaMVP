package com.jeanandroid.somamvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jeanandroid.somamvp.MVP;
import com.jeanandroid.somamvp.Presenter.Presenter;
import com.jeanandroid.somamvp.R;

public class MainActivity extends AppCompatActivity implements MVP.ViewInterface {

    private static MVP.PresenterInterface presenter;

    private EditText viewValorUm;
    private EditText viewValorDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if( presenter == null ){
            presenter = new Presenter();
        }
        resgataIDViews();
        presenter.setView( this );
    }

    //esse metodo vai ser acionado pelo presenter, ele basicamente exibe um toast na tela
    @Override
    public void showToast(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    //chama o metodo no presenter, esse metodo foi declarado na interface do presenter
    public void somar(View view){
        presenter.getSoma(viewValorUm.getText().toString(), viewValorDois.getText().toString());
    }

    //resgate dos IDs da view, nada de MVP aqui
    private void resgataIDViews() {
        viewValorUm = findViewById(R.id.editText);
        viewValorDois = findViewById(R.id.editText2);
    }
}
