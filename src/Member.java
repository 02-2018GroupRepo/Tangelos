public class Member {
    static String teamName = "Tangelo";
    static String atribute = "Bio Scientist";
    private String name;
    private String major;
    private String school;
    private int graduationYear;

    public String getName() {
        return this.name;
    }
    public String getMajor() {
        return this.major;
    }
    public String getSchool() {
        return this.school;
    }
    public int getGraduationYear() {
        return this.graduationYear;
    }

    public void setName(String name){
        this.name= name;
    }
    public void setMajor(String major){
        this.major= major;
    }
    public void setSchool(String school){
        this.school= school;
    }
    public void setGraduationYear(int year){
        this.graduationYear= year;
    }
}
