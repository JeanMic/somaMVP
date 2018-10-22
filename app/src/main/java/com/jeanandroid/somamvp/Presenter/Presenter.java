package com.jeanandroid.somamvp.Presenter;

import android.os.Bundle;

import com.jeanandroid.somamvp.MVP;

public class Presenter implements MVP.PresenterInterface{

    private MVP.ViewInterface view;

    @Override
    public void retrieveMotos(Bundle savedInstanceState) {

    }

    @Override
    public void setView(MVP.ViewInterface view) {

    }

    @Override
    public void showToast(String mensagem) {
        view.showToast( mensagem );
    }
}
