public class Intern implements Employee{
    private int ID;
    private String FullName;
    private String BirthDay;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private String Majors;
    private int Semester;
    private String University_name;


    public Intern(int ID, String fullName, String birthDay, int phone, String email, String employee_type, int employee_count, String majors, int semester, String university_name) {
        this.ID = ID;
        FullName = fullName;
        BirthDay = birthDay;
        Phone = phone;
        Email = email;
        Employee_type = employee_type;
        Employee_count = employee_count;
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
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

    @Override
    public void showIn4() {

    }
}
