import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Prime = (isPrime(n, 2))? "ASALDIR":"DEĞİLDİR";
        System.out.println(n + " Sayısı " + Prime);
        sc.close();
    }
    static boolean isPrime(int n, int i){
        if (n <= 2){
            return (n == 2) ? true : false;
        }

        if (n % i == 0){
            return false;
        }

        if (i * i > n){
            return true;
        }
        return isPrime(n, i + 1);
    }
}