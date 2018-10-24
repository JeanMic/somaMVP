package com.jeanandroid.somamvp;

public interface MVP {

    interface ModelInterface{
        void somarValores( int valorUm, int valorDois );
        void verificaValor(String valorUm, String valorDois);
    }

    interface PresenterInterface{
        void setView( MVP.ViewInterface view );
        void getSoma( String valorUm, String valorDois );
        void verificaValor(String valorUm, String valorDois); 
        void callbackSoma(String resultado);
        void callbackVerifica(String resutVerifica);
    }

    interface ViewInterface{
        void showToast( String mensagem );
    }
}
