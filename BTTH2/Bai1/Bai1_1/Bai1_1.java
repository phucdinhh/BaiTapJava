package Bai1.Bai1_1;
import java.util.Scanner;

public class Bai1_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Point p1 = new Point();
        Point p2 = new Point();  

        double temp;
        
        // Nhập dữ liệu
        System.out.print("Nhap hoanh do cua diem A: ");
        temp = scanner.nextDouble();
        p1.setX(temp);
        
        System.out.print("Nhap tung do cua diem A: ");
        temp = scanner.nextDouble();
        p1.setY(temp);

        System.out.print("Nhap hoanh do cua diem B: ");
        temp = scanner.nextDouble();
        p2.setX(temp);
        
        System.out.print("Nhap tung do cua diem B: ");
        temp = scanner.nextDouble();
        p2.setY(temp); 

        scanner.close();

        // Thực hiện tính chiều dài AB
        double length1 = Math.sqrt(Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY() - p2.getY()),2));
        System.out.print("chieu dai cua doan AB bang " + length1);
    }
}