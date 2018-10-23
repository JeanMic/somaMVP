package com.jeanandroid.somamvp.Presenter;

import com.jeanandroid.somamvp.MVP;
import com.jeanandroid.somamvp.Model.SomaModel;

public class Presenter implements MVP.PresenterInterface{

    private MVP.ViewInterface view;
    private MVP.ModelInterface model;

    //construtor do presenter cria a instancia do model
    public Presenter(){
        model = new SomaModel( this );
    }

    //nesse momento possuo a referencia da view que estou manipulando (tela inteira)
    @Override
    public void setView(MVP.ViewInterface view) {
        this.view = view;
    }

    //esse metodo chama o model pedindo o resultado da soma, depois pego o resultado e atualizo a view
    @Override
    public void getSoma(String valorUm, String valorDois) {
        model.somarValores(Integer.valueOf(valorUm), Integer.valueOf(valorDois) )  ;
    }

    //esse metodo e chamado pelo modelo, ele so e chamado depois que a soma e feita, esse metodo atualiza a view
    @Override
    public void callbackSoma(String resultado) {
        view.showToast(resultado);
    }
}
