import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        AlgFundamentais algFund1 = new AlgFundamentais();
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o valor de a");
        int a = prompt.nextInt();
        System.out.println("Digite o valor de b");
        int b = prompt.nextInt();
        algFund1.trocaVariavel(a,b);
        algFund1.contagemVariavel(a,b);







    }







}
