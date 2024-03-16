package com.example.demo.service.enumeradores;

public enum DoadorMedula {

    DOADOR_MEDULA("SIM"),
    NÃO_DOADOR_MEDULA("NÃO");


    private final String codigo;

    DoadorMedula(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo;
    }
}
