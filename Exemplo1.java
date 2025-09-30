import java.util.Scanner;

public class Exemplo1 {
    public static class NO{
        int dado;
        NO prox;
    }
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        NO lista = new NO();

        //Primeiro NÓ
        System.out.print("Informe dado: ");
        lista.dado = le.nextInt();
        lista.prox = null;

        //Segundo NÓ
        NO novo = new NO();
        System.out.print("Informe dado: ");
        novo.dado = le.nextInt();
        novo.prox = null;

        //Conectando ps 2 NÓS
        lista.prox = novo;

        le.close();

    }
}


