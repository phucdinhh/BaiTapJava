import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        scanner.close();
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int[] arrA = new int[n];
        int[] arrB = new int[m];

        // Tạo mảng A (kích thước n) và mảng B (kích thước m) với các giá trị ngẫu nhiên
        for (int i = 0; i < n; i++){
            arrA[i] = (int)(Math.random() * range) + min;
        }
        for (int i= 0; i<m;i++){
            arrB[i] = (int)(Math.random() * range) + min;
        }

        // Xuất toàn bộ phần tử của mảng A và B ra màn hình
        System.out.println("Array A: " + Arrays.toString(arrA));
        System.out.println("Array B: " + Arrays.toString(arrB));

        // Tạo mảng C từ mảng A
        int[] arrC = Arrays.copyOf(arrA, arrA.length);

        // Thay thế phần tử thứ 1 đến 3 của mảng C bằng 3 phần tử cuối của mảng B
        System.arraycopy(arrB, arrB.length-3, arrC, 0, 3);
        System.out.println("Array C: " + Arrays.toString(arrC));

        // Sắp xếp mảng C tăng dần và xuất ra màn hình
        Arrays.sort(arrC);
        System.out.println("Array C after sort: " + Arrays.toString(arrC));
    }
}
