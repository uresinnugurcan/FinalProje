public class Proje5 {
  import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {


            System.out.println("Bir Sayı Giriniz");
            int onbinler, binler,yuzler,onlar,birler;
            'Scanner klavye=new Scanner(System.in);
            int sayi='klavye.nextInt();
            onbinler=sayi/1000;
            binler=sayi/1000;
            sayi=sayi-(1000*binler);

            yuzler=sayi/100;
            sayi=sayi-(100*yuzler);

            onlar=sayi/10;
            sayi=sayi-(10*onlar);

            birler=sayi;


            System.out.println("onBinler Basamağı : " +onbinler );
            System.out.println("Binler Basamağı : " + binler);
            System.out.println("Yüzler Basamağı : " + yuzler);
            System.out.println("Onlar Basamağı  : " + onlar);
            System.out.println("Birler Basamağı : " + birler);

        }

    }

}
