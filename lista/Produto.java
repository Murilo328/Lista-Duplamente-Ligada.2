package lista;

import java.util.Objects;

public class Produto {
    private String nome;
    private int id;
    private double preco;
    private String marca;

    public Produto(String nome, int id, double preco, String marca) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        return id == ((Produto) o).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("Produto[id=%d, nome=%s, marca=%s, preco=%.2f]", id, nome, marca, preco);
    }
}
