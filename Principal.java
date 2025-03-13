import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bom dia");
        System.out.println("Digite seu nome : ");
        String nome, telefone;
        int idade;
        nome = leitor.nextLine();
        System.out.println("Bom dia " + nome + "!");
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
    }
}
