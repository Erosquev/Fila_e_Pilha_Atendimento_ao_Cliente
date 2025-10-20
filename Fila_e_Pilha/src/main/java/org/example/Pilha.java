package org.example;

public class Pilha {
    private Node topo;

    public Node getTopo() {
        return topo;
    }

    public void setTopo(Node topo) {
        this.topo = topo;
    }

    // Métodos para adicionar e remover elementos da pilha

    public void adicionarSolicitacao(Elemento solicitacao){
        Node novo = new Node();
        novo.setElemento(solicitacao);

        if (conferirVazia()){
            this.topo = novo;
        } else {
            novo.setAnterior(this.topo);
            this.topo.setProximo(novo);
            this.topo = novo;
            this.topo.setProximo(null);
        }

    }

    public void removerSolicitacao(){
        if (conferirVazia()){
            System.out.println("O histórico já está vazio!");
        } else {
            Node aux = this.topo;
            this.topo = aux.getAnterior();
            this.topo.setProximo(null);
        }
    }

    public void printarHistorico(){

        if (conferirVazia()){
            System.out.println("O histórico está vazio!");
        } else {
            Node aux = this.topo;
            while (aux != null){
                System.out.println("ID: "+ aux.getElemento().getId() + " Descricao: " + aux.getElemento().getNome() + " Data: " + aux.getElemento().getDescricao());
                aux = aux.getAnterior();
            }
        }
    }

    public boolean conferirVazia(){
        if (this.topo == null){
            return true;

        } else { return false;}
    }
}
