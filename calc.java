import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) { // try-with-resources
            Num n1 = new Num();
            Num n2 = new Num();
            Num res = new Num();

            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());
            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nA soma de %d com %d é igual a %d%n", n1.getValor(), n2.getValor(), res.getValor());
        } // O Scanner será fechado automaticamente aqui
    }
}