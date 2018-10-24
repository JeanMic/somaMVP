package com.jeanandroid.somamvp.Model;

import com.jeanandroid.somamvp.MVP;
import com.jeanandroid.somamvp.Presenter.Presenter;

public class SomaModel implements MVP.ModelInterface{

    private MVP.PresenterInterface presenter ;

    public SomaModel(Presenter presenter) {
        this.presenter = presenter;
    }

    //depois que o valor e calculado o metodo de callback do presenter e chamado
    @Override
    public void somarValores(int valorUm, int valorDois) {
        presenter.callbackSoma(String.valueOf(valorUm + valorDois));
    }

    @Override
    public void verificaValor(String valorUm, String valorDois) {
        if ( valorUm.isEmpty() || valorDois.isEmpty() ){
            presenter.callbackVerifica("Preencha todos os campos");
        }else{
            somarValores(Integer.valueOf(valorUm), Integer.valueOf(valorDois));
        }
        
    }
}
