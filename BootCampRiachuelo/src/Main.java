import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome");
        var name = scanner.next();
        System.out.println("Olá, informe sua idade");
        var age = scanner.nextInt();
        System.out.printf("Olá s% e sua idade é %s \n", name, age);
    }
}