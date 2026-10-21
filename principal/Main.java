package principal;

import lista.Lista;
import lista.Produto;

public class Main {
    public static void main(String[] args) {
        Lista<Produto> lista = new Lista<>();

        Produto p1 = new Produto("Teclado", 1, 120.00, "Logitech");
        Produto p2 = new Produto("Mouse", 2, 80.50, "Microsoft");
        Produto p3 = new Produto("Monitor", 3, 900.00, "Dell");
        Produto p4 = new Produto("Headset", 4, 250.00, "HyperX");
        Produto p5 = new Produto("Webcam", 5, 199.90, "Logitech");

        System.out.println("=== Lista vazia ===");
        lista.exibir();
        System.out.println("pesquisar(p1): " + lista.pesquisar(p1));
        System.out.println("remover(p1): " + lista.remover(p1));
        System.out.println("atualizar(10.0, id 1): " + lista.atualizar(10.0, 1));

        System.out.println("\n=== inserir (fim) ===");
        lista.inserir(p1);
        lista.inserir(p2);
        lista.inserir(p3);
        lista.exibir();
        System.out.println("-- inverso --");
        lista.exibirInverso();

        System.out.println("\n=== inserir(dado, posicao) ===");
        System.out.println("posicao 1 (meio): " + lista.inserir(p4, 1));
        lista.exibir();
        System.out.println("posicao 0 (inicio, invalido): " + lista.inserir(p5, 0));
        System.out.println("posicao " + lista.tamanho() + " (fim, invalido): " + lista.inserir(p5, lista.tamanho()));
        System.out.println("posicao -1 (invalido): " + lista.inserir(p5, -1));
        System.out.println("posicao 99 (invalido): " + lista.inserir(p5, 99));
        System.out.println("tamanho continua " + lista.tamanho());
        System.out.println("posicao 3 (meio, ultima valida): " + lista.inserir(p5, 3));
        lista.exibir();
        System.out.println("-- inverso --");
        lista.exibirInverso();

        System.out.println("\n=== pesquisar (por id) ===");
        System.out.println("pesquisar(id 3): " + lista.pesquisar(new Produto(null, 3, 0, null)));
        System.out.println("pesquisar(id 99): " + lista.pesquisar(new Produto(null, 99, 0, null)));

        System.out.println("\n=== atualizar(preco, id) ===");
        System.out.println("atualizar(850.00, id 3): " + lista.atualizar(850.00, 3));
        System.out.println(lista.pesquisar(p3));
        System.out.println("atualizar(1.00, id 99): " + lista.atualizar(1.00, 99));

        System.out.println("\n=== remover ===");
        System.out.println("remover(id 1) [inicio]: " + lista.remover(p1));
        System.out.println("remover(id 3) [fim]: " + lista.remover(p3));
        System.out.println("remover(id 5) [meio]: " + lista.remover(p5));
        System.out.println("remover(id 99) [inexistente]: " + lista.remover(new Produto(null, 99, 0, null)));
        lista.exibir();
        System.out.println("-- inverso --");
        lista.exibirInverso();
        System.out.println("tamanho: " + lista.tamanho());

        System.out.println("\n=== inserir(posicao) com lista de 1 e 2 elementos ===");
        lista.remover(p4);
        System.out.println("tamanho: " + lista.tamanho() + " | posicao 1: " + lista.inserir(p1, 1));
        lista.inserir(p4);
        System.out.println("tamanho: " + lista.tamanho() + " | posicao 1: " + lista.inserir(p5, 1));
        lista.exibir();

        System.out.println("\n=== remover ate esvaziar e reutilizar ===");
        lista.remover(p2);
        lista.remover(p5);
        lista.remover(p4);
        lista.exibir();
        lista.inserir(p1);
        lista.exibir();

        System.out.println("\n=== Lista<Integer> ===");
        Lista<Integer> numeros = new Lista<>();
        numeros.inserir(10);
        numeros.inserir(30);
        numeros.inserir(20, 1);
        numeros.exibir();
        System.out.println("pesquisar(20): " + numeros.pesquisar(20));
        System.out.println("remover(10): " + numeros.remover(10));
        System.out.println("atualizar(5.0, id 1) em Lista<Integer>: " + numeros.atualizar(5.0, 1));
        numeros.exibir();

        System.out.println("\n=== Lista<String> ===");
        Lista<String> nomes = new Lista<>();
        nomes.inserir("Ana");
        nomes.inserir("Carla");
        nomes.inserir("Bruno", 1);
        nomes.exibir();
    }
}
