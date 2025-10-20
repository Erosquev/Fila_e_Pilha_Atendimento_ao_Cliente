package org.example;

public class Node {
    private Elemento elemento;
    private Node proximo;
    private Node anterior;

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
