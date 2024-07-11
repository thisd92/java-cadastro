package model;

public enum Combustivel {

    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel");

    private String comb;

    Combustivel(String combustivel) {
        this.comb = combustivel;
    }

    public String getCombustivel() {
        return comb;
    }

}
