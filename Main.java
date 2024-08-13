public class Main {
    public static void main(String[] args) {
        try {
            // Testando pilha de inteiros
            System.out.println("Pilha de Inteiros");
            Pilha pilhaInteiros = new Pilha(5);

            pilhaInteiros.inserir(10);
            pilhaInteiros.inserir(20);
            pilhaInteiros.inserir(30);

            System.out.println("Conteúdo da Pilha de Inteiros:");
            pilhaInteiros.imprimir();

            System.out.println("Removendo elemento: " + pilhaInteiros.remover());
            pilhaInteiros.imprimir();

            System.out.println("Adicionando elemento: 25");
            pilhaInteiros.inserir(25);
            pilhaInteiros.imprimir();

            // Testando pilha de strings
            System.out.println("\nPilha de Strings");
            Pilha pilhaStrings = new Pilha(5);

            pilhaStrings.inserir("A");
            pilhaStrings.inserir("B");
            pilhaStrings.inserir("C");

            System.out.println("Conteúdo da Pilha de Strings:");
            pilhaStrings.imprimirStrings();

            System.out.println("Removendo elemento: " + pilhaStrings.removerString());
            pilhaStrings.imprimirStrings();

            System.out.println("Adicionando elemento: B");
            pilhaStrings.inserir("B");
            pilhaStrings.imprimirStrings();

            // Testando fila de inteiros
            System.out.println("\nFila de Inteiros");
            Fila filaInteiros = new Fila(5);

            filaInteiros.inserir(10);
            filaInteiros.inserir(20);
            filaInteiros.inserir(30);
            filaInteiros.inserir(40);
            filaInteiros.inserir(50);

            System.out.println("Conteúdo da Fila de Inteiros:");
            filaInteiros.imprimirFilaInteiros();

            System.out.println("Tentando inserir na fila cheia:");
            try {
                filaInteiros.inserir(90);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Removendo elemento: " + filaInteiros.remover());
            filaInteiros.imprimirFilaInteiros();

            System.out.println("Adicionando elemento: 90");
            filaInteiros.inserir(90);
            filaInteiros.imprimirFilaInteiros();

            // Testando fila de strings
            System.out.println("\nFila de Strings");
            Fila filaStrings = new Fila(5);

            filaStrings.inserir("C");
            filaStrings.inserir("F");
            filaStrings.inserir("C");

            System.out.println("Conteúdo da Fila de Strings:");
            filaStrings.imprimirFilaStrings();

            System.out.println("Removendo elemento: " + filaStrings.removerString());
            filaStrings.imprimirFilaStrings();

            System.out.println("Adicionando elemento: A");
            filaStrings.inserir("A");
            filaStrings.imprimirFilaStrings();

            System.out.println("Removendo todos os elementos da fila de strings:");
            filaStrings.removerString();
            filaStrings.removerString();
            filaStrings.removerString();
            filaStrings.imprimirFilaStrings();

            System.out.println("Tentando remover da fila vazia:");
            try {
                filaStrings.removerString();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
