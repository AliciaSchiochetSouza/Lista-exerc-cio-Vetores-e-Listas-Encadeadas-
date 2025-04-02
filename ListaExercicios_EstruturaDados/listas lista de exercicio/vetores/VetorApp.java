import estruturas.Lista;

public class VetorApp {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Adicionando os valores especificados no vetor [2, 7, 9, 12, 16, 21, 27, 33, 42, 54]
        lista.adicionarAoFinal(2);
        lista.adicionarAoFinal(7);
        lista.adicionarAoFinal(9);
        lista.adicionarAoFinal(12);
        lista.adicionarAoFinal(16);
        lista.adicionarAoFinal(21);
        lista.adicionarAoFinal(27);
        lista.adicionarAoFinal(33);
        lista.adicionarAoFinal(42);
        lista.adicionarAoFinal(54);

        // Mostrando a lista completa
        System.out.println("Lista inicial:");
        lista.mostrarNos();

        // Inserindo um valor após um elemento específico
        lista.inserirApos(12, 99);
        System.out.println("Após inserir 99 após 12:");
        lista.mostrarNos();

        // Removendo um elemento
        lista.remover(16);
        System.out.println("Após remover 16:");
        lista.mostrarNos();

        // Obtendo o tamanho da lista
        System.out.println("Tamanho final da lista: " + lista.obterTamanho());
    }
}
