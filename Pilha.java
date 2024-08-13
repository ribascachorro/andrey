public class Pilha {
    private int capacidadeMaxima;
    private int indiceTopo;
    private int[] pilhaInteiros;
    private String[] pilhaStrings; 

    // Construtor
    public Pilha(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.indiceTopo = -1;
        this.pilhaInteiros = new int[capacidadeMaxima];
        this.pilhaStrings = new String[capacidadeMaxima]; 
    }

    // Verifica se a pilha está cheia
    public boolean estaCheia() {
        return indiceTopo == capacidadeMaxima - 1;
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return indiceTopo == -1;
    }

    // Insere novo elemento inteiro na pilha
    public void inserir(int elemento) throws Exception {
        if (estaCheia()) {
            throw new Exception("Pilha cheia");
        }
        pilhaInteiros[++indiceTopo] = elemento;
    }

    // Insere novo elemento string na pilha
    public void inserir(String elemento) throws Exception {
        if (estaCheia()) {
            throw new Exception("Pilha cheia");
        }
        pilhaStrings[++indiceTopo] = elemento;
    }

    // Remove e retorna o elemento inteiro do topo da pilha
    public int remover() throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha vazia");
        }
        return pilhaInteiros[indiceTopo--];
    }

    // Remove e retorna o elemento string do topo da pilha
    public String removerString() throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha vazia");
        }
        return pilhaStrings[indiceTopo--];
    }

    // Imprime todos os elementos inteiros da pilha
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= indiceTopo; i++) {
                System.out.print(pilhaInteiros[i] + " ");
            }
            System.out.println();
        }
    }

    // Imprime todos os elementos string da pilha
    public void imprimirStrings() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= indiceTopo; i++) {
                System.out.print(pilhaStrings[i] + " ");
            }
            System.out.println();
        }
    }
}
