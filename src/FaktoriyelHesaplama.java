import java.util.Scanner;

class FaktoriyelHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayınızı giriniz:");

        int sayi = scan.nextInt();
        long faktoriyel = 1;
        for(int i = 1 ; i <= sayi ; i++)
        {
            faktoriyel *= i;
        }
        System.out.println("Sayısınızın  Faktöriyeli: " + faktoriyel);
    }
}
