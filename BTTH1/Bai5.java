import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String string2 = scanner.nextLine();
        scanner.close();
        System.out.println("Total length of 2 string: " + totalLength(string1, string2));
        System.out.println("First three characters of \"" + string1 + "\" is \"" + threeChars(string1, 0, 3) + "\"");
        System.out.println("Last three characters of \"" + string2 + "\" is \"" + threeChars(string2, string2.length()-3, string2.length())+"\"");
        theSixthCharacter(string1);
        stringEquals(string1, string2);
        stringContains(string1, string2);
    }

    // Tính tổng chiều dài 2 chuỗi s1 và s2
    public static int totalLength(String string1, String string2){
        return string1.length() + string2.length();
    }

    // Lấy 3 ký tự
    public static String threeChars(String indexString, int firstPosition, int lastPosition){
        return indexString.substring(firstPosition, lastPosition);
    }

    // Lấy ký tự thứ 6 của chuỗi
    public static void theSixthCharacter(String indexString){
        System.out.println("The sixth character of \"" + indexString + "\" is \"" +indexString.charAt(5)+ "\"");
    }

    // Kiểm tra 2 chuỗi s1 và s2 có bằng nhau không
    public static void stringEquals(String string1, String string2){
        if (string1.equals(string2)) System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\"");
        else System.out.println("\"" + string1 + "\" is not equal to \"" + string2 + "\"");
    }

    // Cho biết s2 có xuất hiện trong s1 hay không? Nếu có thì đó là vị trí nào
    public static void stringContains(String string1, String string2){
        if (string1.contains(string2)) System.out.println("\"" + string1 + "\" is contains \"" + string2 + "\" at " +string1.indexOf(string2));
        else System.out.println("\"" + string1 + "\" is not contains \"" + string2 + "\"");
    }
}
