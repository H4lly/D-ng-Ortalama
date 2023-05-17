import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                count++;
            }
        }

        double average = (double) toplam / count;

        System.out.println("0'dan " + n + " kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: " + average);

    }
}