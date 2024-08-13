public class Fila {
    private int capacidade;
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private String[] dadosString; 

    // Construtor
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = -1;
        this.dados = new int[capacidade];
        this.dadosString = new String[capacidade]; 
    }

    //se a fila estiver cheia
    public boolean cheia() {
        return (ultimo - primeiro + 1) == capacidade;
    }

    // se tiver vazio
    public boolean vazia() {
        return primeiro > ultimo;
    }

    // novo elemento(int)
    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Fila cheia");
        }
        dados[++ultimo] = elemento;
    }

    //novo elemento (String)
    public void insere(String elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Fila cheia");
        }
        dadosString[++ultimo] = elemento;
    }

    // tira elemento(int)
    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Fila vazia");
        }
        return dados[primeiro++];
    }

    // tira elemento (String)
    public String removeString() throws Exception {
        if (vazia()) {
            throw new Exception("Fila vazia");
        }
        return dadosString[primeiro++];
    }

    // print fila toda (int)
    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = primeiro; i <= ultimo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }

    // print tudo (String)
    public void imprimeString() {
        if (vazia()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = primeiro; i <= ultimo; i++) {
                System.out.print(dadosString[i] + " ");
            }
            System.out.println();
        }
    }
}
