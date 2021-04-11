import java.util.Scanner;

public class Citizen {
    int id;
    int contactee;

    public Citizen(){

    }

    public void setData(int id, int contactee){
        this.id = id;
        this.contactee = contactee;
    }

    public int getId(){
        return id;
    }

    public int getContactee(){
        return contactee;
    }

    // Đảo các giá trị trong chuỗi
    public static void mixArrays(int[] arr, int n){
        for (int i = 0; i< n; i++){
            int j = (int)(Math.random()*n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Thực hiện tìm kiếm Id của những người từng tiếp xúc
    public static void findContacts(int idFinding, Citizen[] c, int n){
        for (int i = 0; i < n; i++){
            if (i == idFinding){
                System.out.print("People who contact to ID " + i + " is: " + i + " - ");
                int id = c[i].getContactee();
                int loop = 1;
                while (loop<=n){
                    if (id == c[i].id){
                        break;
                    }
                    else{
                        if (loop == 1){
                            System.out.print(c[id].getId());
                        }
                        else{
                            System.out.print(" - "+c[id].getId());
                        }
                    }
                    id = c[id].getContactee();
                    loop++;
                }System.out.println("");
            }
            else continue;
        }   
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of citizens: "); // Nhập số lượng công dân
        int n = scanner.nextInt();
        
        Citizen[] arr = new Citizen[n]; // Khởi tạo chuỗi đối tượng công dân
        int[] arrId = new int[n]; // Tạo Id công dân
        for (int i = 0; i <n;i++) {
            arrId[i] = i;
        }
        mixArrays(arrId, n); 
        for (int i = 0; i < n; i++) { // Tạo Id người tiếp xúc
            arr[i] = new Citizen();
            arr[i].setData(i, arrId[i]);
        }

        // In ra màn hình Id và Contactee tương ứng
        System.out.print("ID        | ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].getId() + " ");
        }
        System.out.print("\nContactee | ");
        System.out.print("");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].getContactee()+ " ");
        }

        System.out.print("\nEnter ID of person has COVID-19: "); // Tìm kiếm những người đã tiếp xúc
        int idFinding = scanner.nextInt();
        findContacts(idFinding, arr , n);
        scanner.close();
    }
}
