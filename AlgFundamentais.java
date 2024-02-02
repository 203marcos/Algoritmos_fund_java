import java.util.Scanner;

public class AlgFundamentais {
    Scanner prompt = new Scanner(System.in);

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
        System.out.println("Contagem de a até b equivale: " + contagemVariavelAux(a,b));

    }
    
    public static int contagemVariavelAux(int a, int b){
        if(b == a)
            return 0;
        else
            return 1 + contagemVariavelAux(a, b-1);

    }


    public void somaVariavel() {
        System.out.println("Digite quantos elementos tem: ");
        int n = prompt.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = prompt.nextInt();
        }

        System.out.println("A soma dos numeros são: " + somaVariavelAux(n-1,array));
    }
    
    public static int somaVariavelAux(int n, int[] array){
        if(n == 0 )
            return array[0];
        else
            return array[n] + somaVariavelAux(n-1,array);

    }


    public void fatorialVariavel() {
        System.out.println("Digite o valor de n para fatorar");
        int n = prompt.nextInt();

        System.out.println("O fatorial é: "+fatorialAux(n));

    }
    
    public int fatorialAux(int i) {
       if(i == 1 || i == 0)
           return 1;
       else
           return i * fatorialAux(i-1);

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
        
            termo = (int) (Math.pow(x,i) / fatorialAux(i));
            s = s + sinal * termo;
            i = i + 2;
            sinal = -sinal;
        }

        System.out.println("o numero é esse: "+ s);



    }
    
    public void fibonaciVariavel() {

        int num;

        System.out.print("Informe o número de termos da sequência: ");
        num = prompt.nextInt();

        for (int i = 1; i <= num; i++)
            System.out.print(fib(i) + " ");

    }

    public static int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);

    }



}
