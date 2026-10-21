package lista;

public class No<T> {
    private T dado;
    private No<T> prox, ant;

    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    public No<T> getAnt() {
        return ant;
    }

    public void setAnt(No<T> ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return String.valueOf(dado);
    }
}
