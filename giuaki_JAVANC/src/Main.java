import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        funtion funtion = new funtion();
        while (true) {
            System.out.println("---------------------------");
            System.out.println("các chức năng: ");
            System.out.println("1 - thêm nhân viên: ");
            System.out.println("2 - cập nhật nhân viên: ");
            System.out.println("3 - xóa nhân viên");
            System.out.println("4 - lưu vào file");
            System.out.println("5 - đọc dữ liệu từ file");
            System.out.print("Nhập lựa chọn của bạn: ");
            int chon =sc.nextInt();
            switch (chon) {
                case 1:
                    funtion.add();
                    break;
                case 2:
                    funtion.updateEmployee();
                    break;
                case 3:
                    funtion.delete();
                    break;
                case 4:
                    funtion.saveToFile("dataa.txt");
                    break;
                case 5:
                    funtion.loadFromFile("dataa.txt");
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}