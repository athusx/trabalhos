import javac.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        String palavra;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma palavra de quatro digitos: ");
        palavra = leitura.nextLine();

        palavra = palavra.replace("A", "E");
        palavra = palavra.replace("E", "I");
        palavra = palavra.replace("I", "O");
        palavra = palavra.replace("O", "U");
        palavra = palavra.replace("U", "U");
        palavra = palavra.replace("a", "e");
        palavra = palavra.replace("e", "i");
        palavra = palavra.replace("i", "o");
        palavra = palavra.replace("o", "u");
        palavra = palavra.replace("u", "u");

        System.out.println("A palavra altera ficou : " + palavra);

    }

}