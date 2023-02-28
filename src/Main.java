import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int eror = 3;
        int selected ;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {

            System.out.println("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz");
                if(isWrong){
                    eror --;
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hak :" + eror);
                }else {
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
            }

            if (selected == number){
                System.out.println("Tebrikler doğru tahmin !Tahmin ettiğiniz sayı : " + number );
                break;

            }else{
                System.out.println("Yanlış tahmin!");
                if (selected < number){
                    System.out.println(selected + " gizli sayıdan küçüktür.");
                }else {
                    System.out.println(selected + " gizli sayıdan büyüktür.");
                }
                wrong[right++] =selected;
                System.out.println("Kalan tahmin hakkı : " + (5-right ));
            }

        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli sayı :" + number);
            if (!isWrong){
                System.out.println("Tahminleriniz :" + Arrays.toString(wrong) );
            }
        }

    }
}