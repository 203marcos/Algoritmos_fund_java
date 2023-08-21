import java.util.Scanner;

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

    public void somaVariavel() {
        //Dado um conjunto de n números, calcular a soma
        //desses números. Assumir que n é maior ou igual a
        //zero.
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        short n = prompt.nextShort();

        short i = 0;
        short soma =0;
        short aux;
        Scanner numero = new Scanner(System.in);

        while(i < n){
            i++;
            System.out.println("Digite o valor do numero");
            aux = prompt.nextShort();
            soma+=aux;
        }

        System.out.println("A soma dos numeros são: " + soma);

    }

    public void fatorialVariavel() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        int n = prompt.nextInt();
        int aux = 1;

        for(int i=1;i<=n;i++){
            aux = i * aux;

        }

        System.out.println("O fatorial é: "+aux);

    }
    public int fatorialAux(int i) {
        int aux = 1;

        for(int j=1;j<=i;j++) {
            aux = j * aux;

        }
        return aux;
    }

    public void serieInfinita() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero de termos (n): ");
        int n = prompt.nextInt();
        System.out.println("Digite o valor de x");
        int x = prompt.nextInt();

        int termo;
        int s = 0;
        int i = 1;
        int sinal = 1;

        for(int j=0;j<n;j++){
        
            termo = (int) (sinal * Math.pow(x,i) / fatorialAux(i));
            s = s + sinal * termo;
            i = i + 2;
            sinal = -sinal;
        }

        System.out.println("o numero é esse: "+ s);



    }
    public void fibonaciVariavel() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero de termos (n): ");
        int n = prompt.nextInt();

        int a = 0;
        int b = 1;
        int i = 2;
        int c;

        if (n == 1) {
            System.out.println(a);
        } else {
            System.out.print(a + ", " + b);
        }

        while (i < n) {
            i = i + 1;
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }



    }


}
