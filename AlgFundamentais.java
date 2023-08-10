public class AlgFundamentais {
    public void trocaVariavel(int a, int b) {
    //faz a troca de variavel entre a e b
        int aux;
        aux = a;
        a = b;
        b = aux;
        System.out.println("Esse é o valor de a: "+ a);
        System.out.println("Esse é o valor de b: "+ b);

    }

    public void contagemVariavel(int a, int b) {
    //faz contagem de a até b
                int i = 0;
                while (a < b) {
                    i = i + 1;
                    a++;
                }

                System.out.println("Contagem de a até b equivale: " + i);
            }

}
