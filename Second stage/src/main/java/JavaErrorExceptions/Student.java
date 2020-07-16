package JavaErrorExceptions;

public class Student {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String surname;
    private String middleName;
    private int MarkOfMath;
    private int MarkOfHistory;
    private int MarkOfEnglish;
    private String faculty;
    private int course;
    private int group;

    Student(String name, String surname, String middleName, int MarkOfMath, int MarkOfHistory, int MarkOfEnglish, String faculty, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.MarkOfMath = MarkOfMath;
        this.MarkOfHistory = MarkOfHistory;
        this.MarkOfEnglish = MarkOfEnglish;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getMarkOfMath() {
        return MarkOfMath;
    }

    public int getMarkOfHistory() {
        return MarkOfHistory;
    }

    public int getMarkOfEnglish() {
        return MarkOfEnglish;
    }

    public String getFaculty(){
        return faculty;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public String getMiddleName() { return middleName; }

    public int getCourse(){
        return course;
    }

    public int getGroup(){
        return group;
    }

    private int getId() {return id;}

    public String toString() {
        return String.format("ID: %s\t name: %s\t surname: %s\t middle name %s\t faculty: %s\t course: %s\t group: %s\t Mark Of Math: %s\t Mark Of History: %s\t Mark Of English: %s",
                id, name, surname, middleName, faculty, course, group, MarkOfMath, MarkOfHistory, MarkOfEnglish);
    }
}
