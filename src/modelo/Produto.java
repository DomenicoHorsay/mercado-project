package modelo;

import utils.Utils;

public class Produto {
    private static int count = 1;

    private int id;
    private String nome;
    private Double preco;


    public Produto(Double preco, String nome) {
        this.id = count;
        this.preco = preco;
        this.nome = nome;
        Produto.count += 1;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Id: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nPreço" + Utils.doubleToString(this.getPreco());
    }
}
