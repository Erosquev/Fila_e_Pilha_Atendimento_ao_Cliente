package org.example;

public class Fila {
    private Node frente;
    private Node tras;


    // Métodos para adicionar e atender clientes na fila


    public Fila() {
        this.tras = null;
        this.frente = null;
    }

    public Node getFrente() {
        return frente;
    }

    public void setFrente(Node frente) {
        this.frente = frente;
    }

    public Node getTras() {
        return tras;
    }

    public void setTras(Node tras) {
        this.tras = tras;
    }



    public void adicionarCliente(Elemento cliente){
        Node novo = new Node();
        novo.setElemento(cliente);

        if (conferirVazia()){
            this.frente = novo;
            this.tras = novo;
        } else{
            Node aux = this.frente;

            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }

            aux.setProximo(novo);
            novo.setProximo(null);
            novo.setAnterior(aux);
            this.tras = novo;
        }

    }

    public void atenderProximoCliente(){
        if (!conferirVazia()){
            this.frente = this.frente.getProximo();
        } else {
            System.out.println("A fila já está vazia!");
        }
    }

    public void printarFila(){

        if (conferirVazia()){
            System.out.println("A fila está vazia!");
        } else {
            Node aux = this.frente;
            while (aux != null){
                System.out.println("ID: "+ aux.getElemento().getId() + " Nome: " + aux.getElemento().getNome() + " Motivo: " + aux.getElemento().getDescricao());
                aux = aux.getProximo();
            }
        }

    }

    public boolean conferirVazia(){
        if (this.frente == null){
            return true;

        } else { return false;}
    }


//    Inclua métodos para adicionar clientes à fila e atender o próximo cliente.
//Inclua métodos para verificar se a fila está vazia

}
