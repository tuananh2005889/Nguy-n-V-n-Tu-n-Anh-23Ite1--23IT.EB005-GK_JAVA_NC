import java.util.ArrayList;
import java.util.Scanner;

public class Experience implements Employee {
    private int ID;
    private String FullName;
    private String BirthDay;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private int ExpInYear;
    private String ProSkill;
    private ArrayList<Experience> DS_NV_KN;

    public Experience(int ID, String fullName, String birthDay, int phone, String email, String employee_type, int employee_count, int expInYear, String proSkill) {
        this.ID = ID;
        FullName = fullName;
        BirthDay = birthDay;
        Phone = phone;
        Email = email;
        Employee_type = employee_type;
        Employee_count = employee_count;
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(String employee_type) {
        Employee_type = employee_type;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }



    @Override
    public void showIn4() {

    }
}
