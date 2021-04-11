import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        divisorsOfNumber(n);
        System.out.println(n + " has "+ countNumberOfDigits(n) + " digits");
        if(isSymmetricNumber(n)) 
            System.out.println(n + " is a symmetric number");
        else 
            System.out.println (n + " is not a symmetric number");
        isSquareNumber(n);
    }

    // Liệt kê các ước số của n
    public static void divisorsOfNumber(int n) {
        String result = "";
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                result += (i +" ");
            }
        }
        System.out.println("Divisors of "+ n +": " +result);
    }

    // Cho biết n có bao nhiêu chữ số
    public static int countNumberOfDigits(int n) {
        int length = 0;
        while (n>0) {
            n/=10;
            length++;
        }
        return length;
    }

    // Kiểm tra n có phải là số đối xứng không
    public static boolean isSymmetricNumber(int n){
        int reverse = 0;
        int original = n;
        int digit;
        int length = countNumberOfDigits(n);
        while (length > 0){
            digit = n%10;
            reverse = reverse*10 + digit;
            n/=10;
            length--;
        }
        if (reverse == original)
            return true;
        else return false;
    }

    // Kiểm tra n có phải là số chính phương không
    public static void isSquareNumber(int n){
        for (int i = 1; i <=n; i++) {
            if (Math.pow(i,2) == n){
                System.out.println(n + " is square Number");
                return;
            }
        }
        System.out.println(n + " is not square Number");
    }
}
