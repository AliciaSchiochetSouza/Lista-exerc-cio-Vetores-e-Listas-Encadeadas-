package estruturas;

public class Iterador {
    
    Lista lista;
    No atual;

    public Iterador(Lista lista, No atual) {
        this.lista = lista;
        this.atual = atual;
    }

    public Boolean haProximo() {
        return this.atual != null && this.atual.proximo != null;
    }

    public Boolean haAnterior() {
        return this.atual != null && this.atual.anterior != null;
    }

    public void proximo() {
        if (this.haProximo()) {
            this.atual = this.atual.proximo;
        }
    }

    public void anterior() {
        if (this.haAnterior()) {
            this.atual = this.atual.anterior;
        }
    }

    public int getDadoAnterior() {
        return this.atual.anterior != null ? this.atual.anterior.dado : -1;
    }

    public int getDadoProximo() {
        return this.atual.proximo != null ? this.atual.proximo.dado : -1;
    }

    public int getDado() {
        return this.atual.dado;
    }

    public No getAtual() {
        return this.atual;
    }

    public void resetar() {
        this.atual = this.lista.inicio;
    }

    public void display() {
        if (this.haAnterior()) {
            System.out.print("Anterior -> " + this.getDadoAnterior() + " | ");
        }

        System.out.print("No " + this.getDado());
        
        if (this.haProximo()) {
            System.out.println(" | Proximo -> " + this.getDadoProximo());
        }
        System.out.println("");
        this.proximo();
    }

    // Inserir após o atual
    // Esse método insere um novo nó logo após um nó com um valor específico.
    public void inserirApos(int valor) {
        if (this.atual == null) return;

        No novoNo = new No(valor);
        novoNo.proximo = this.atual.proximo;
        novoNo.anterior = this.atual;

        if (this.atual.proximo != null) {
            this.atual.proximo.anterior = novoNo;
        }

        this.atual.proximo = novoNo;
    }

    // Remover após o atual
    // Esse método remove o nó que está logo após o nó atual, se existir.
    public void removerApos() {
        if (this.atual == null || this.atual.proximo == null) return;

        No removido = this.atual.proximo;
        this.atual.proximo = removido.proximo;

        if (removido.proximo != null) {
            removido.proximo.anterior = this.atual;
        }
    }

    // Inserir antes do atual
    // Esse método insere um novo nó logo antes do nó atual.
    public void inserirAntes(int valor) {
        if (this.atual == null) return;

        No novoNo = new No(valor);
        novoNo.proximo = this.atual;
        novoNo.anterior = this.atual.anterior;

        if (this.atual.anterior != null) {
            this.atual.anterior.proximo = novoNo;
        } else {
            this.lista.inicio = novoNo; // Caso o atual seja o primeiro nó
        }

        this.atual.anterior = novoNo;
    }

    // Remover antes do atual
    // Esse método remove o nó que está logo antes do nó atual.
    public void removerAntes() {
        if (this.atual == null || this.atual.anterior == null) return;

        No removido = this.atual.anterior;
        this.atual.anterior = removido.anterior;

        if (removido.anterior != null) {
            removido.anterior.proximo = this.atual;
        } else {
            this.lista.inicio = this.atual; // Caso o removido seja o primeiro nó
        }
    }
}
