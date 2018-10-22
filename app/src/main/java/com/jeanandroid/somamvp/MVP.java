package com.jeanandroid.somamvp;

public interface MVP {

    interface ModelInterface{
        void somarValores( int valorUm, int valorDois );
    }

    interface PresenterInterface{
        void setView( MVP.ViewInterface view );
        void getSoma( String valorUm, String valorDois );
        void callbackSoma(String resultado);
    }

    interface ViewInterface{
        void showToast( String mensagem );
    }
}
