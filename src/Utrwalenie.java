import java.util.Scanner;

public class Utrwalenie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile zarabiasz na godzine: ");
        double stawka = scanner.nextDouble();

        System.out.println("Zarabiasz rocznie: " + (stawka * 2080) + " złotych");
        System.out.println("Zarabiasz miesięcznie: " + (stawka * 160) + " złotych");
        System.out.println("Zarabiasz tygodniowo: " + (stawka * 40) + " złotych");

    }
}
