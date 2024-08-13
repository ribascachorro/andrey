public class Main {
    public static void main(String[] args) {
        try {
            //pilha de inteiros

            System.out.println(" Pilha de Inteiros");
            Pilha pilhaInt = new Pilha(5);

            pilhaInt.insere(10);
            pilhaInt.insere(20);
            pilhaInt.insere(30);

            System.out.println("Pilha de Inteiros:");
            pilhaInt.imprime();

            System.out.println("Removendo elemento: " + pilhaInt.remove());
            pilhaInt.imprime();

            System.out.println("Adicionando elemento: 25");
            pilhaInt.insere(25);
            pilhaInt.imprime();

            // pilha de strings
            System.out.println("\n Pilha de Strings");
            Pilha pilhaString = new Pilha(5);

            pilhaString.insere("A");
            pilhaString.insere("B");
            pilhaString.insere("C");

            System.out.println("Pilha de Strings:");
            pilhaString.imprimeString();

            System.out.println("Removendo elemento: " + pilhaString.removeString());
            pilhaString.imprimeString();

            System.out.println("Adicionando elemento: B");
            pilhaString.insere("B");
            pilhaString.imprimeString();

            //fila de inteiros
            System.out.println("\n Testando Fila de Inteiros");
            Fila filaInt = new Fila(5);

            filaInt.insere(10);
            filaInt.insere(20);
            filaInt.insere(30);
            filaInt.insere(40);
            filaInt.insere(50);

            System.out.println("Fila de Inteiros:");
            filaInt.imprime();

            System.out.println("Tentando inserir na fila cheia:");
            try {
                filaInt.insere(90);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Removendo elemento: " + filaInt.remove());
            filaInt.imprime();

            System.out.println("Adicionando elemento: 90");
            filaInt.insere(90);
            filaInt.imprime();

            // fila de strings
            System.out.println("\n Fila de Strings");
            Fila filaString = new Fila(5);

            filaString.insere("C");
            filaString.insere("F");
            filaString.insere("C");

            System.out.println("Fila de Strings:");
            filaString.imprimeString();

            System.out.println("Removendo elemento: " + filaString.removeString());
            filaString.imprimeString();

            System.out.println("Adicionando elemento: A");
            filaString.insere("A");
            filaString.imprimeString();

            System.out.println("Removendo todos os elementos da fila de strings:");
            filaString.removeString();
            filaString.removeString();
            filaString.removeString();
            filaString.imprimeString();

            System.out.println("Tentando remover da fila vazia:");
            try {
                filaString.removeString();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
