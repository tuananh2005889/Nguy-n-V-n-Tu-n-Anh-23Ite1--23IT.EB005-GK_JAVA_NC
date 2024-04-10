import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class funtion implements Employee{
    public ArrayList<Experience> DS_NV_KN = new ArrayList<>();
    public ArrayList<Fresher> DS_NV_newout_school = new ArrayList<>();
    public ArrayList<Intern> DS_inter = new ArrayList<>();
    int Employee_count = 0;

    public void add() {
        boolean continueAdding = true; // Biến để kiểm tra xem có tiếp tục thêm nhân viên không
        Scanner sc = new Scanner(System.in);

        while (continueAdding) {
            System.out.println("Nhập ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập tên: ");
            String Name = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String date = sc.nextLine();
            System.out.println("Nhập SĐT: ");
            int sdt = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới
            System.out.println("Nhập email: ");
            String email = sc.nextLine();
            System.out.println("Chọn kiểu nhân viên: ");
            System.out.println("1 - Nhân viên kinh nghiệm lâu năm");
            System.out.println("2 - nhân viên mới ra trường");
            System.out.println("3 - Nhân viên thực tập");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    String Employee_type = "Nhân viên kinh nghiệm lâu năm";
                    System.out.println("Nhập số năm kinh nghiệm: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập kỹ năng chuyên môn: ");
                    String skills = sc.nextLine();
                    Employee_count++;
                    Experience Em = new Experience(ID,Name,date,sdt,email, Employee_type, Employee_count,year,skills);
                    DS_NV_KN.add(Em);
                    System.out.println("Thêm Nhân viên kinh nghiệm thành công");
                    break;
                case 2:
                    String Employee_type_1 = "nhân viên mới ra trường";
                    System.out.println("Nhập thời gian tốt nghiệp: ");
                    int year_TN = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập loại tốt nghiệp: ");
                    String rank = sc.nextLine();
                    System.out.println("trường tốt nghiệp: ");
                    String school = sc.nextLine();
                    Employee_count++;
                    Fresher fre = new Fresher(ID,Name,date,sdt,email, Employee_type_1, Employee_count,year_TN,rank,school);
                    DS_NV_newout_school.add(fre);
                    System.out.println("Thêm nhân viên mới ra trường thành công");
                    break;
                case 3:
                    String Employee_type_2 = "Nhân viên thực tập";
                    System.out.println("Nhập chuyên ngành đang học: ");
                    String chuyennganh = sc.nextLine();
                    System.out.println("Nhập học kì đang học");
                    int hocki = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập trường đang học: ");
                    String name_school = sc.nextLine();
                    Employee_count++;
                    Intern in = new Intern(ID,Name,date,sdt,email, Employee_type_2,Employee_count,chuyennganh,hocki,name_school);
                    DS_inter.add(in);
                    System.out.println("Thêm nhân viên thực tập thành công");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

            // Kiểm tra xem người dùng có muốn tiếp tục thêm nhân viên không
            System.out.println("Bạn có muốn thêm nhân viên khác không? (1: Có, 0: Không)");
            int choice = sc.nextInt();
            if (choice != 1) {
                continueAdding = false; // Đặt biến continueAdding thành false để kết thúc vòng lặp
            }
        }
    }

    public void updateEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID của nhân viên cần cập nhật: ");
        int searchID = sc.nextInt();
        sc.nextLine();


        for (Experience em : DS_NV_KN) {
            if (em.getID() == searchID) {
                System.out.println("Nhập tên mới: ");
                String newName = sc.nextLine();
                em.setFullName(newName);

                System.out.println("Nhập ngày sinh mới: ");
                String newDate = sc.nextLine();
                em.setBirthDay(newDate);

                System.out.println("Nhập SĐT mới: ");
                int newSdt = sc.nextInt();
                sc.nextLine();
                em.setPhone(newSdt);

                System.out.println("Nhập email mới: ");
                String newEmail = sc.nextLine();
                em.setEmail(newEmail);

                System.out.println("Nhập số năm kinh nghiệm: ");
                int year = sc.nextInt();
                em.setExpInYear(year);

                System.out.println("Nhập kỹ năng chuyên môn: ");
                String skills = sc.nextLine();
                em.setProSkill(skills);

                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }


        for (Fresher fre : DS_NV_newout_school) {
            if (fre.getID() == searchID) {
                System.out.println("Nhập tên mới: ");
                String newName = sc.nextLine();
                fre.setFullName(newName);

                System.out.println("Nhập ngày sinh mới: ");
                String newDate = sc.nextLine();
                fre.setBirthDay(newDate);

                System.out.println("Nhập SĐT mới: ");
                int newSdt = sc.nextInt();
                sc.nextLine();
                fre.setPhone(newSdt);

                System.out.println("Nhập email mới: ");
                String newEmail = sc.nextLine();
                fre.setEmail(newEmail);

                System.out.println("Nhập thời gian tốt nghiệp: ");
                int year_TN = sc.nextInt();
                sc.nextLine();
                fre.setGraduation_date(year_TN);

                System.out.println("Nhập loại tốt nghiệp: ");
                String rank = sc.nextLine();
                fre.setGraduation_rank(rank);

                System.out.println("trường tốt nghiệp: ");
                String school = sc.nextLine();
                fre.setEducation(school);

                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }

        for (Intern in : DS_inter) {
            if (in.getID() == searchID) {
                System.out.println("Nhập tên mới: ");
                String newName = sc.nextLine();
                in.setFullName(newName);

                System.out.println("Nhập ngày sinh mới: ");
                String newDate = sc.nextLine();
                in.setBirthDay(newDate);

                System.out.println("Nhập SĐT mới: ");
                int newSdt = sc.nextInt();
                sc.nextLine();
                in.setPhone(newSdt);

                System.out.println("Nhập email mới: ");
                String newEmail = sc.nextLine();
                in.setEmail(newEmail);

                System.out.println("Nhập chuyên ngành đang học: ");
                String chuyennganh = sc.nextLine();
                in.setMajors(chuyennganh);

                System.out.println("Nhập học kì đang học");
                int hocki = sc.nextInt();
                sc.nextLine();
                in.setSemester(hocki);

                System.out.println("Nhập trường đang học: ");
                String name_school = sc.nextLine();
                in.setUniversity_name(name_school);

                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã ID đã nhập.");
    }
    public void delete() {
        System.out.println("----------------");
        System.out.println("Nhập ID nhân viên xóa: ");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();

        for (int i = 0; i < DS_NV_KN.size(); i++) {
            Experience e1 = DS_NV_KN.get(i);
            if (e1.getID() == ID) {
                DS_NV_KN.remove(i);
                Employee_count--;
                System.out.println("Đã xóa nhân viên kinh nghiệm có ID " + ID);
                return;
            }
        }
        for (int i = 0; i < DS_NV_newout_school.size(); i++) {
            Fresher e1 = DS_NV_newout_school.get(i);
            if (e1.getID() == ID) {
                DS_NV_newout_school.remove(i);
                Employee_count--;
                System.out.println("Đã xóa nhân viên mới ra trường có ID " + ID);
                return;
            }
        }
        for (int i = 0; i < DS_inter.size(); i++) {
            Intern e1 = DS_inter.get(i);
            if (e1.getID() == ID) {
                DS_NV_KN.remove(i);
                Employee_count--;
                System.out.println("Đã xóa nhân viên thực tập có ID " + ID);
                return;
            }
        }


        System.out.println("Không tìm thấy nhân viên có ID " + ID + " trong danh sách.");
    }
    public void saveToFile(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(DS_NV_KN);
            objectOut.writeObject(DS_NV_newout_school);
            objectOut.writeObject(DS_inter);
            objectOut.writeObject(Employee_count);
            objectOut.close();
            fileOut.close();
            System.out.println("Dữ liệu đã được lưu vào file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            DS_NV_KN = (ArrayList<Experience>) objectIn.readObject();
            DS_NV_newout_school = (ArrayList<Fresher>) objectIn.readObject();
            DS_inter = (ArrayList<Intern>) objectIn.readObject();
            Employee_count = (int) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Dữ liệu đã được nạp từ file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ql_nhanvien";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connectToDatabase() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            System.out.println("Kết nối đến cơ sở dữ liệu thành công.");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối đến cơ sở dữ liệu: " + e.getMessage());
        }
        return connection;
    }

    @Override
    public void showIn4() {
        System.out.println("Danh sách nhân viên kinh nghiệm:");
        System.out.println("------------------------------");
        for (Experience em : DS_NV_KN) {
            System.out.println(em);
        }

        System.out.println("\nDanh sách nhân viên mới ra trường:");
        System.out.println("----------------------------------");
        for (Fresher fre : DS_NV_newout_school) {
            System.out.println(fre);
        }

        System.out.println("\nDanh sách nhân viên thực tập:");
        System.out.println("-----------------------------");
        for (Intern in : DS_inter) {
            System.out.println(in);
        }
    }

}
