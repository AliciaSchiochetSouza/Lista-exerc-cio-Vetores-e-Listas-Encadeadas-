package estruturas;

public class Lista {
    private No inicio;
    private No fim;
    // Adicionar tamanho á lista- Conta a quantidade de nós
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Inserir no final da lista 
    //Se a lista estiver vazia (fim == null), define o nó como inicio e fim.
    //Caso contrário, liga o novo nó ao fim atual e atualiza fim para apontar para o novo nó.
    //Incrementa o tamanho da lista (tamanho++).
    public void adicionarAoInicio(int valor) {
        No no = new No(valor);
        if (this.inicio == null) {
            this.inicio = this.fim = no;
        } else {
            no.proximo = this.inicio;
            this.inicio.anterior = no;
            this.inicio = no;
        }
        this.tamanho++;
    }

    public void adicionarAoFinal(int valor) {
        No no = new No(valor);
        if (this.fim == null) {
            this.inicio = this.fim = no;
        } else {
            no.anterior = this.fim;
            this.fim.proximo = no;
            this.fim = no;
        }
        this.tamanho++;
    }

    // Inserir após uma valor informado
    // Percorre a lista até encontrar o valor de referência.
    //Insere o novo nó logo após o nó encontrado.
    //Se o nó de referência for o último, o novo nó se torna o fim.
    //Incrementa o tamanho da lista (tamanho++).
    public void inserirApos(int valorReferencia, int novoValor) {
        No noAux = this.inicio;
        while (noAux != null && noAux.dado != valorReferencia) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor de referência não encontrado.");
            return;
        }

        No novoNo = new No(novoValor);
        novoNo.proximo = noAux.proximo;
        novoNo.anterior = noAux;

        if (noAux.proximo != null) {
            noAux.proximo.anterior = novoNo;
        } else {
            this.fim = novoNo;
        }

        noAux.proximo = novoNo;
        this.tamanho++;
    }

    // Metodo que retorna o número de nós da lista- ele retorna a quantidade de intens da lista
    public int obterTamanho() {
        return this.tamanho;
    }

    public void mostrarNos() {
        No noAux = this.inicio;
        while (noAux != null) {
            System.out.print("No " + noAux.dado);
            if (noAux.proximo != null) {
                System.out.println(" | Próximo -> " + noAux.proximo.dado);
            }
            noAux = noAux.proximo;
        }
        System.out.println("\nTamanho da lista: " + this.tamanho);
    }

    public void remover(int valor) {
        No noAux = this.inicio;

        while (noAux != null && noAux.dado != valor) {
            noAux = noAux.proximo;
        }

        if (noAux == null) {
            System.out.println("Valor não encontrado");
            return;
        }

        if (noAux.anterior != null) {
            noAux.anterior.proximo = noAux.proximo;
        } else {
            this.inicio = noAux.proximo;
        }

        if (noAux.proximo != null) {
            noAux.proximo.anterior = noAux.anterior;
        } else {
            this.fim = noAux.anterior;
        }

        this.tamanho--;
    }
}
