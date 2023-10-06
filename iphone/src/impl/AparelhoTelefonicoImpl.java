package impl;

import service.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public String ligar() {
        return "ligar";
    }

    @Override
    public String atender() {
        return "atender";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "iniciarCorreioVoz";
    }
}