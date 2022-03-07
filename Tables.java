import java.util.Scanner;
public class Tables{
    public static void main (String [] args){
        int valor;

        Scanner escrita = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valor=escrita.nextInt();

        switch (valor){
            case 1:
                System.out.println("Valor = 1");
                break;
            case 2:
                System.out.println("Valor = 2");
                break;
            case 3: 
                System.out.println("Valor = 3");
                break;
            default:
            System.out.println("Nenhum dos 3 valores");
        }
    }
}