import java.util.Scanner;

public class Main {

    static int desen(int n, boolean control, int sayac) {
        if (control) {
            if (n > 0) {
                System.out.print(n + " ");
                sayac++;
                return desen(n - 5, true, sayac);
            } else {
                return desen(n, false, sayac);
            }
        } else {
            System.out.print(n + " ");
            if (sayac > 1) {
                sayac--;

                return desen(n + 5, false, sayac);
            } else {
                return n+5;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.println(desen(n, true, 0));
    }

}