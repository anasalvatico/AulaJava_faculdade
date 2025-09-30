import java.util.Scanner;

public class Elemento {
    static int idade;
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Elemento p1 = new Elemento();
        Elemento p2 = new Elemento();
        Elemento p3 = new Elemento();
        System.out.println("Infome a idade de 3 pessoas");
        System.out.println("Pessoa 1: ");
        p1.idade = le.nextInt();
        System.out.println("Pessoa 2: ");
        p2.idade = le.nextInt();
        System.out.println("Pessoa 3: ");
        p3.idade = le.nextInt();
        le.close();
        System.out.println(Elemento.idade);
    }

}
