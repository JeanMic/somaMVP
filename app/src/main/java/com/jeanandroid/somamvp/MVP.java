package com.jeanandroid.somamvp;

public interface MVP {

    interface ModelInterface{
        public void retrieveMotos();
//        public void updateEhFavoritoMoto( Moto moto );
    }

    interface PresenterInterface{
        public void showToast( String mensagem );
        public void setView( MVP.ViewInterface view );
    }

    interface ViewInterface{
        public void showToast( String mensagem );

    }
}
