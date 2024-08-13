public class Fila {
    private int capacidadeMaxima;
    private int indicePrimeiro;
    private int indiceUltimo;
    private int[] filaInteiros;
    private String[] filaStrings; 

    // Construtor
    public Fila(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.indicePrimeiro = 0;
        this.indiceUltimo = -1;
        this.filaInteiros = new int[capacidadeMaxima];
        this.filaStrings = new String[capacidadeMaxima]; 
    }

    // Verifica se a fila está cheia
    public boolean estaCheia() {
        return (indiceUltimo - indicePrimeiro + 1) == capacidadeMaxima;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return indicePrimeiro > indiceUltimo;
    }

    // Insere novo elemento inteiro na fila
    public void inserir(int elemento) throws Exception {
        if (estaCheia()) {
            throw new Exception("Fila cheia");
        }
        filaInteiros[++indiceUltimo] = elemento;
    }

    // Insere novo elemento string na fila
    public void inserir(String elemento) throws Exception {
        if (estaCheia()) {
            throw new Exception("Fila cheia");
        }
        filaStrings[++indiceUltimo] = elemento;
    }

    // Remove e retorna o próximo elemento inteiro da fila
    public int remover() throws Exception {
        if (estaVazia()) {
            throw new Exception("Fila vazia");
        }
        return filaInteiros[indicePrimeiro++];
    }

    // Remove e retorna o próximo elemento string da fila
    public String removerString() throws Exception {
        if (estaVazia()) {
            throw new Exception("Fila vazia");
        }
        return filaStrings[indicePrimeiro++];
    }

    // Imprime todos os elementos inteiros da fila
    public void imprimirFilaInteiros() {
        if (estaVazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = indicePrimeiro; i <= indiceUltimo; i++) {
                System.out.print(filaInteiros[i] + " ");
            }
            System.out.println();
        }
    }

    // Imprime todos os elementos string da fila
    public void imprimirFilaStrings() {
        if (estaVazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = indicePrimeiro; i <= indiceUltimo; i++) {
                System.out.print(filaStrings[i] + " ");
            }
            System.out.println();
        }
    }
}
