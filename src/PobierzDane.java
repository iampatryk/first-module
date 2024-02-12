import java.util.Scanner;

public class PobierzDane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String imie = scanner.nextLine();

        System.out.println("Jak masz na nazwisko?");
        String nazwisko = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();

        System.out.println("Imię: " + imie + "\n" + "Nazwisko: " + nazwisko + "\n" + "Wiek: " + wiek);
    }
}
//