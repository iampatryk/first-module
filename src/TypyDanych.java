import java.util.Scanner;

public class TypyDanych {
    public static void main(String[] args) {

        double a = 10.0;
        double b = 5.0;

        double c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(" ");
        System.out.println("DRUGI PRZYKLAD" + "\n");

        int d = 5;
        int e = 4;

        int f = d % e;
        // % - operator modulo czyli reszta z dzielenia np.5 \ 4 = 1
        System.out.println(f + "\n");

        System.out.println("Rozwiazanie zadania" + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaLiczba = scanner.nextInt();

        System.out.println("Podaj druga liczbe: ");
        int drugaLiczba = scanner.nextInt();

//        int pierwszaLiczba = 10;
//        int drugaLiczba = 5;

        int dodawanie = pierwszaLiczba + drugaLiczba;
        int odejmowanie = pierwszaLiczba - drugaLiczba;
        int mnozenie = pierwszaLiczba * drugaLiczba;
        int dzielenie = pierwszaLiczba / drugaLiczba;

        System.out.println("Wynik dodawania to " + dodawanie);
        System.out.println("Wynik odejmowania to " + odejmowanie);
        System.out.println("Wynik odejmowania to " + mnozenie);
        System.out.println("Wynik odejmowania to " + dzielenie + "\n");

        System.out.println("Rozwiazanie zadania druga opcja podana przez kurs" + "\n");

        System.out.println("Wynik dodawania " + (pierwszaLiczba + drugaLiczba));

        // dzialania na jednej wartosci

        int x = 5;

        // to samo co x = x + 10
        // mozna uzyc kazdego znaku -= lub *= lub \=

        x += 10;

        System.out.println("WYNIK");
        System.out.println(x);


    }
}
