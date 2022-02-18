import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {
        
         int num1 = 0, num2 = 0;

         Calculadora cal = new Calculadora();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para somar 2 números e 2 para subtrair 2 números");
        int escolher = scan.nextInt();

        System.out.println("Digite o primero número ");
        num1 = scan.nextInt();

        System.out.println("Digite o segindo número");
        num2 = scan.nextInt();
        
        if(escolher == 1){
            System.out.println("A soma dos números "+num1+ " + " + num2 + " = " + cal.soma(num1, num2) );
        }



    }
    
}
