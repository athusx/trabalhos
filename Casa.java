import java.util.Scanner;

/*Crie uma aplicação java que peça para o usuário digite uma palavra de 4 caracteres.
Se for digitado mais ou menos de 4 caracteres uma mensagem deverá ser apresentado na tela do computador informando o problema e o programa 
deverá ser encerrado.Se a palavra tiver 4 caracteres o programa deverá mostrar o seguinte relatório:

1 - Quantidade de vogais
2 - Quantidade de consoantes
3 - Quantidade de caracteres numéricos

 Exemplo: usuário digitou a palavra dado:
- vogais: 2
- consoante: 2
- caracteres numéricos: 0 */

public class Casa {
    public static void main(String [] args){

        String palavra;
        Scanner ler = new Scanner(System.in);
        int contar;
        char vogais;

        System.out.println("Digite uma palavra de 4 caracteres:");
        palavra = ler .nextLine();
        if(args.length != 4) {
            System.out.println("E 4 ANTA");
            System.exit(0); //fechando o programa.
        }
        if(args);
    }
}