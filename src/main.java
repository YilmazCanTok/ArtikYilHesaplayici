
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("Artık Yıl Bulan Program");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.print("Lütfen Yıl Giriniz : ");
        int yıl = scanner.nextInt();
        if (yıl%4 == 0) {
            System.out.println("Girmiş Olduğunuz Yıl Bir Artık Yıldır..."+yıl);
        }
        else{
            System.out.println("Girmiş Olduğunuz Yıl Bir Artık Yıl Değildir..."+yıl);
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("****************************************************");
    }
}
