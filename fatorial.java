import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        double x; // declarando as variaveis
        Scanner dd = new Scanner(System.in);
        System.out.print("Digite um número: ");
        x = dd.nextInt(); // entrada do teclado
        double z = x, i;
        System.out.print("O número fatorado: ");
        while (x > 1) {
            z = z * (x - 1); // fatorando
           
            System.out.print(x);// imprimir os numeros da fatoração
            x--;
            System.out.print("*");
            
        }
            i = z;
        System.out.println();
        System.out.println("resultado da fatoração: " + i); // resultado da fatoração
    }
}