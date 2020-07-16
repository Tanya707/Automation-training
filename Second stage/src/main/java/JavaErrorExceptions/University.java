package JavaErrorExceptions;

import java.util.ArrayList;

public class University {
    private String universityName;
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public static void addStudentToList(Student Student) {
        studentList.add(Student);
    }

    public static void Checking() throws UniversityException{
        int Count=0;
        for (Student c : studentList) {
            if(c.getMarkOfEnglish()<1 | c.getMarkOfEnglish()>10) throw new UniversityException("The mark of English is incorrect");
            if(c.getMarkOfHistory()<1 | c.getMarkOfHistory()>10) throw new UniversityException("The mark of History is incorrect");
            if(c.getMarkOfMath()<1 | c.getMarkOfMath()>10) throw new UniversityException("The mark of Math is incorrect");
            if(c.getFaculty()=="ЭФ"|c.getFaculty()=="ФЭС"|c.getFaculty()=="ФТУГ") {
                Count++;
            }
            if (c.getName()==""|c.getSurname()==""|c.getMiddleName()=="") throw new UniversityException("Don't have student on faculty:"+c.getFaculty()+"   in group:  "+c.getGroup());
            if (c.getFaculty()=="ЭФ") {
               if (c.getGroup()==201 | c.getGroup()==211) {
               }
               else throw new UniversityException("Incorrect group");
            }
            if (c.getFaculty()=="ФЭС") {
                if (c.getGroup()==312 | c.getGroup()==310 | c.getGroup()==311) {
                }
                else throw new UniversityException("Incorrect group");
            }
            if (c.getFaculty()=="ФТУГ") {
                if (c.getGroup()==401) {
                }
                else throw new UniversityException("Incorrect group");
            }
        }
        if(Count!=studentList.size()) throw new UniversityException("Name of faculty is incorrect or you should add faculty");
    }

    public static double AverageMarkOfEnglishInUniversity()  {
        float Mark = 0, Count = 0;
        for (Student c : studentList) {
            Mark = Mark + c.getMarkOfEnglish();
            Count++;
        }
        float AverageMark = Mark / Count;
        return AverageMark;
    }

    public static double AverageMarkOfStudent(String listSortByName, String listSortBySurname, String listSortByMiddleName) {
        float AverageMark = 0;
        for (Student c : studentList) {
            if (c.getName() == listSortByName &&c.getSurname() == listSortBySurname && c.getMiddleName() == listSortByMiddleName) {
                AverageMark = (float) ((c.getMarkOfEnglish()+c.getMarkOfHistory()+c.getMarkOfMath())/3.0);
            }
        }
        return AverageMark;
    }

    public static double AverageMarkOfFacultyGroupMath(String listSortByFaculty, int listSortByGroup) {
        float Mark = 0, Count = 0;
        for (Student c : studentList) {
            if (c.getFaculty() == listSortByFaculty && c.getGroup() == listSortByGroup) {
                Mark = Mark + c.getMarkOfMath();
                Count++;
            }
        }
        float AverageMark = Mark / Count;
        return AverageMark;
    }
}

