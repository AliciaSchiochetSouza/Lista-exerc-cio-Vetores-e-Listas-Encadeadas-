package estruturas;

public class Vetor {
    private Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    // Adiciona um item no final do vetor
    public void adicionar(Integer valor) {
        if (this.tamanho == this.capacidade) {
            this.aumentarCapacidade();
        }
        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    // Aumenta capacidade do vetor quando precisa
    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade / 2);
        Integer[] novosElementos = new Integer[novaCapacidade];

        for (int i = 0; i < this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    public void mostrarElementos() {
        System.out.print("Vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(this.elementos[i] + " ");
        }
        System.out.println();
    }

    // Coloca um valor após de um elemento especifico
    public void inserirApos(int indice, Integer valor) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido");
            return;
        }
        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        for (int i = tamanho; i > indice + 1; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[indice + 1] = valor;
        tamanho++;
    }

    // Remove o item após de um elemento especifico
    public void removerApos(int indice) {
        if (indice < 0 || indice >= tamanho - 1) {
            System.out.println("Índice inválido");
            return;
        }
        for (int i = indice + 1; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    // Coloca um valor antes de um elemento especifico
    public void inserirAntes(int indice, Integer valor) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido");
            return;
        }
        if (tamanho == capacidade) {
            aumentarCapacidade();
        }
        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[indice] = valor;
        tamanho++;
    }

    // Remove o item antes de um elemento especifico
    public void removerAntes(int indice) {
        if (indice <= 0 || indice >= tamanho) {
            System.out.println("Índice inválido");
            return;
        }
        for (int i = indice - 1; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }
}
