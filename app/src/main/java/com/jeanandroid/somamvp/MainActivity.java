package com.jeanandroid.somamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jeanandroid.somamvp.Presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MVP.ViewInterface{

    private static MVP.PresenterInterface presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if( presenter == null ){
            presenter = new Presenter();
        }

        presenter.setView( this );

    }

    @Override
    public void showToast(String mensagem) {
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }



}
