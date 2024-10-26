import java.util.Scanner;
public class kitapISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 9 haneli ISBN numarasını giriniz : ");
        String isbnNO = input.next();
        int kalan;
       // .valueOf stringdeki değeri integer a çevirir

        int isbn = Integer.valueOf(isbnNO);
        int toplam = 0;


        for (int i = 1; i < 10; i++) {

            kalan = isbn % 10;
            toplam = toplam + (10 - i) * kalan;
            isbn -= kalan;
            isbn = isbn / 10;
        }
            int d10 = (toplam % 11);
        if (d10 == 10) {
            System.out.println(isbnNO + "X");
        } else {
            System.out.println(isbnNO+d10);
        }
    }
}
//013601267  1   013031997  X