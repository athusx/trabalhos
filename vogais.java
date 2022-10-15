import java.util.Scanner;

public class Prog1 {
    public static char vogais(char p[]){
        int contv=0;
        for(char x:p ){
            if(x == 'a' || x == 'e' || x== 'i' || x == 'o' || x == 'u')
                contv++;
        }
        System.out.println("Vogais: "+contv);
        return 0;
    }
    public static char consoante(char p[]){
        int contc=0;
        for(char x:p ){
            if(x != 'a' && x != 'e' && x!= 'i' && x != 'o' && x != 'u')
                contc++;
        }
        System.out.println("consoantes: "+contc);
        return 0;
    }
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        char p[] = dd.next().toLowerCase().toCharArray();
        Prog1 z = new Prog1();
        z.vogais(p);
        z.consoante(p);

        
         
    }
}
