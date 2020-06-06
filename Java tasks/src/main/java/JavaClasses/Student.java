package JavaClasses;

public class Student {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String surname;
    private String middleName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String address;
    private int telephone;
    private String faculty;
    private int course;
    private int group;

    Student(String name, String surname, String middleName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, int telephone, String faculty, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
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
        return String.format("ID: %s\t name: %s\t surname: %s\t middle name %s\t address: %s \t data of birthday: %s.%s.%s \t telephone: %s\t faculty: %s\t course: %s\t group: %s",
                id, name, surname, middleName, address, dayOfBirth, monthOfBirth, yearOfBirth, telephone, faculty, course, group);
    }
}
