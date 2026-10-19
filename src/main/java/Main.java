import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner skaner = new Scanner(System.in);
    int n;

    System.out.print("Podaj liczbe, ktora chcesz sprawdzic : ");
    n = skaner.nextInt();

    if(n <= 1) {
        System.out.print("Liczba " + n + " nie jest liczba pierwsza");
        return;
    }
    boolean czyPierwsza = true;
        for(int i = 2; i < n; i++) {

            if(n % i == 0) {

                czyPierwsza = false;
                System.out.print("Liczba " + n + " nie jest liczba pierwsza");
                break;
            }
            }
        if(czyPierwsza == true) {
            System.out.print("Liczba " + n + " jest liczba pierwsza");
        }
  }
}