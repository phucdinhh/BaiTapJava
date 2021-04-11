import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter edge a: ");
        int a = sc.nextInt();
        System.out.print("Enter edge b: ");
        int b = sc.nextInt();
        System.out.print("Enter edge c: ");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Perimeter of triangle: "+ perimeterOfTrangle(a,b,c));
        System.out.println("Area of triangle: "+ areaOfTrangle(a,b,c));
    }

    // Tính chu vi
    public static double perimeterOfTrangle(double a, double b, double c){
        return a+b+c;
    }

    // Tính diện tích
    public static double areaOfTrangle(double a, double b, double c){
        double halfPerimeter = perimeterOfTrangle(a,b,c)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));
        return area;
    }
}
