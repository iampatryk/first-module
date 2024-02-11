import java.util.Scanner;

// int = liczby calkowite
// double = liczby zmienno przecinkowe
// boolean = prawda/falsz

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię ? ");
        String imie = scanner.nextLine();

        System.out.println("Ile masz lat?");
        String wiek = scanner.nextLine();

        System.out.println("Gdzie mieszkasz?");
        String miasto = scanner.nextLine();

        System.out.println("Cześć " + imie + "! " + "Masz " + wiek + " lat!" + "Mieszkasz w " + miasto + " jest tam pieknie!");

    }
}