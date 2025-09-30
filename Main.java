import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PilhaInt pilha = new PilhaInt();
        pilha.init();

        Scanner le = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = le.nextInt();
        pilha.push(valor);

        valor = pilha.pop();
        System.out.println("Retirado valor: " + valor);

    }
}