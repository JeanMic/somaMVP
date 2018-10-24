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
    // @Override
    // public void getSoma(String valorUm, String valorDois) {
    //     model.somarValores(Integer.valueOf(valorUm), Integer.valueOf(valorDois) )  ;
    // }
    //nessa função o presenter manda para o model os valores para verificar se tem algo vazio.
    @Override
    public void verificaValor(String valorUm, String valorDois) {
        model.verificaValor(valorUm,valorDois);
    }
    //aqui é onde retorna o mensagem de verificação pra view
    @Override
    public void callbackVerifica(String resutVerifica){
        view.showToast(resutVerifica);
    }

    @Override
    public void callbackSoma(String resultado) {
        view.showToast(resultado);
    }
}
