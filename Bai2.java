import java.util.Scanner;

public class Bai2 {
    // Tính S(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        sc.close();
        int count = 0;
        float total = 0;
        for (int i = 1; i<=n; i++) {
            count+=i;
            total += Math.pow(x,i)/count;
        }
        System.out.println("Total: "+ total);
        
    }
}
