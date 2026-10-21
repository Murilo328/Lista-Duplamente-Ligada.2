package lista;

import java.util.Objects;

public class Lista<T> {
    private No<T> inicio, fim;
    private int tamanho;

    public boolean vazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public void inserir(T dado) {
        No<T> novo = new No<>(dado);
        if (vazia()) {
            inicio = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
        }
        fim = novo;
        tamanho++;
    }

    public boolean inserir(T dado, int posicao) {
        if (posicao < 1 || posicao > tamanho - 1) {
            return false;
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProx();
        }

        No<T> novo = new No<>(dado);
        No<T> anterior = atual.getAnt();

        novo.setAnt(anterior);
        novo.setProx(atual);
        anterior.setProx(novo);
        atual.setAnt(novo);

        tamanho++;
        return true;
    }

    public void exibir() {
        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProx();
        }
    }

    public void exibirInverso() {
        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No<T> atual = fim;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getAnt();
        }
    }

    public T pesquisar(T dado) {
        No<T> no = buscarNo(dado);
        return no == null ? null : no.getDado();
    }

    public boolean remover(T dado) {
        No<T> alvo = buscarNo(dado);
        if (alvo == null) {
            return false;
        }

        if (alvo.getAnt() == null) {
            inicio = alvo.getProx();
        } else {
            alvo.getAnt().setProx(alvo.getProx());
        }

        if (alvo.getProx() == null) {
            fim = alvo.getAnt();
        } else {
            alvo.getProx().setAnt(alvo.getAnt());
        }

        alvo.setProx(null);
        alvo.setAnt(null);
        tamanho--;
        return true;
    }

    public boolean atualizar(double preco, int id) {
        No<T> atual = inicio;
        while (atual != null) {
            T dado = atual.getDado();
            if (dado instanceof Produto) {
                Produto p = (Produto) dado;
                if (p.getId() == id) {
                    p.setPreco(preco);
                    return true;
                }
            }
            atual = atual.getProx();
        }
        return false;
    }

    private No<T> buscarNo(T dado) {
        No<T> atual = inicio;
        while (atual != null) {
            if (Objects.equals(atual.getDado(), dado)) {
                return atual;
            }
            atual = atual.getProx();
        }
        return null;
    }
}
