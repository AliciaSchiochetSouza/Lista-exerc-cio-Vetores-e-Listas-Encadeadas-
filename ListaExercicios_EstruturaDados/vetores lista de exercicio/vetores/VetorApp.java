import estruturas.Vetor;
//import estruturas.Lista;
//import estruturas.No;

public class VetorApp {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);

        vetor.mostrarElementos();

        //Vetor inicial
        System.out.println("Vetor inicial:");
        vetor.mostrarElementos();

        //Colocar valor no início
        vetor.inserirNoInicio(99);
        System.out.println("Após inserir 99 no início:");
        vetor.mostrarElementos();

        //Busca binária por um valor que já existe 
        int valorBuscado = 27;
        int posicao = vetor.buscaBinaria(valorBuscado);
        if (posicao != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado na posição " + posicao);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado no vetor.");
        }

        //Busca de um valor que não existe
        int valorNaoExistente = 100;
        int posicaoNaoEncontrada = vetor.buscaBinaria(valorNaoExistente);
        if (posicaoNaoEncontrada != -1) {
            System.out.println("Valor " + valorNaoExistente + " encontrado na posição " + posicaoNaoEncontrada);
        } else {
            System.out.println("Valor " + valorNaoExistente + " não encontrado no vetor.");
        }
    }
    }
