import java.util.Scanner;

public class EnUzunKelime {
    public static void main(String[] args) {

        enUzunKelimeyiBul();
    }
    public static String enUzunKelimeyiBul() {
        Scanner scanner = new Scanner(System.in);
        String girilenKelime = "";
        String enUzunKelime = "";

        while (!girilenKelime.equalsIgnoreCase("q")) { // loop until user enters "q"
            System.out.println("Lutfen bir kelime giriniz...\nBitirmek icin Q'ya basiniz");
            girilenKelime = scanner.next();

            if (girilenKelime.length() > enUzunKelime.length()) {
                enUzunKelime = girilenKelime;
            }
        }

        scanner.close();
        return enUzunKelime;
    }

}
