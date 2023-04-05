import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.print("Insira a primeira nota: ");
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = teclado.nextDouble();
        System.out.print("Insira a quarta nota: ");
        nota4 = teclado.nextDouble();
        teclado.close();

        System.out.println(" ");

        System.out.println("A média das notas inseridas é de: " + ((nota1+nota2+nota3+nota4)/4));
    }
}
