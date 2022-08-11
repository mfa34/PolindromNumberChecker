import java.util.Scanner;

public class Main {
    static boolean isPalindrom (int number ){

        int temp = number , reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber = temp %10 ;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /=10;
        }
        if (number==reverseNumber){
            System.out.println("Polindrom Sayidir");
            return true;
        }else{
            System.out.println("Polindrom sayi degildir");
            return false ;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kontrol Etmek Istediginiz Sayiyi Giriniz :");
       int  number=input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
