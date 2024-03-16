package com.example.demo.service.enumeradores;

public enum FatorSanguineo {
    A_POSITIVO("A+", "A positivo"),
    A_NEGATIVO("A-", "A negativo"),
    B_POSITIVO("B+", "B positivo"),
    B_NEGATIVO("B-", "B negativo"),
    AB_POSITIVO("AB+", "AB positivo"),
    AB_NEGATIVO("AB-", "AB negativo"),
    O_POSITIVO("O+", "O positivo"),
    O_NEGATIVO("O-", "O negativo");

    private final String codigo;
    private final String descricao;

    FatorSanguineo(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }

    public static FatorSanguineo fromCodigo(String codigo) {
        for (FatorSanguineo tipo : FatorSanguineo.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de tipo sanguíneo inválido: " + codigo);
    }
}
