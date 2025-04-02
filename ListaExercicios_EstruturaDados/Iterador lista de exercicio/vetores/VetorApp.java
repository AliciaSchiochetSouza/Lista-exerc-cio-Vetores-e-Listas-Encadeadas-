import estruturas.Vetor;

public class VetorApp {
    public static void main(String[] args) {
    
        Vetor vetor = new Vetor(10);

        //Elementos ao vetor
        int[] valores = {2, 7, 9, 12, 16, 21, 27, 33, 42, 54};
        for (int valor : valores) {
            vetor.adicionar(valor);
        }

        // Mostrar vetor inicial
        System.out.println("Vetor inicial:");
        vetor.mostrarElementos();
        System.out.println(); 

        // Inserir após o 3 (valor 12)
        vetor.inserirApos(3, 99);
        System.out.println("Inseriu 99 após 12");
        vetor.mostrarElementos();
        System.out.println();

        // Remover após o 3 (remover 99)
        vetor.removerApos(3);
        System.out.println("Removeu 99 após 12");
        vetor.mostrarElementos();
        System.out.println();

        // Inserir antes do 3 (antes do 12)
        vetor.inserirAntes(3, 88);
        System.out.println("Inseriu 88 antes de 12");
        vetor.mostrarElementos();
        System.out.println();

        // Remover antes do  3 (remover 88)
        vetor.removerAntes(3);
        System.out.println("Removeu 88 antes de 12");
        vetor.mostrarElementos();
    }
}
