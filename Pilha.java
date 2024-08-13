public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;
    private String[] dadosString; 

    // Construtor
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
        this.dadosString = new String[capacidade]; 
    }

    // ve se ta cheio
    public boolean cheia() {
        return topo == capacidade - 1;
    }

    //ve se ta vazio
    public boolean vazia() {
        return topo == -1;
    }

    // novo elemento (int)
    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia");
        }
        dados[++topo] = elemento;
    }

    //  novo elemento (String)
    public void insere(String elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia");
        }
        dadosString[++topo] = elemento;
    }

    //tira elemento (int)
    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }
        return dados[topo--];
    }

    //tira elemento (String)
    public String removeString() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }
        return dadosString[topo--];
    }

    // print tudo
    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }

    // print tudo (para String)
    public void imprimeString() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(dadosString[i] + " ");
            }
            System.out.println();
        }
    }
}
