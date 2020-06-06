package Task2;

public class student {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String name2;
    private String name3;
    private int dayofbirth;
    private int monthofbirth;
    private int yearofbirth;
    private String address;
    private int telephone;
    private String faculty;
    private int course;
    private int group;

    student(String name, String name2, String name3, int dayofbirth, int monthofbirth, int yearofbirth, String address, int telephone, String faculty, int course, int group) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.dayofbirth = dayofbirth;
        this.monthofbirth = monthofbirth;
        this.yearofbirth = yearofbirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getName(){
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public int getDayofbirth() {

        return dayofbirth;
    }


    public int getMonthofbirth() {
        return monthofbirth;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getFaculty(){
        return faculty;
    }

    public int getCourse(){
        return course;
    }

    public int getGroup(){
        return group;
    }

    public String toString() {
        return String.format("ID: %s\t name: %s\t name2: %s\t name3 %s\t address: %s \t data of birthday: %s.%s.%s \t telephone: %s\t faculty: %s\t course: %s\t group: %s",
                id, name, name2, name3, address, dayofbirth, monthofbirth, yearofbirth, telephone, faculty, course, group);
    }
}
