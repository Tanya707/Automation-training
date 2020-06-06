package JavaClasses;

import java.util.ArrayList;
import java.util.List;

class University {
    private String universityName;
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public University(String universityName) {
        this.universityName = universityName;
    }

   public static void addStudentToList(Student Student) {
     studentList.add(Student);
   }

    List<Student> getListByfaculty(String listSortByNameFaculty) {
        List<Student> list = new ArrayList<Student>();
        for (Student c : studentList) {
            if (c.getFaculty() == listSortByNameFaculty) {
                list.add(c);
            }
        }
        return list;
    }

    List<Student> getListByfacultyCourse(String listSortByNameFaculty1, int listSortByNameCourse1) {
        List<Student> list = new ArrayList<Student>();
        for (Student c : studentList) {
            if (c.getFaculty() == listSortByNameFaculty1 && c.getCourse() == listSortByNameCourse1) {
                list.add(c);
            }
        }
        return list;
    }

    List<Student> getListByYearOfBirth(int listSortByYearOfBirth) {
        List<Student> list = new ArrayList<Student>();
        for (Student c : studentList) {
            if (c.getYearOfBirth() > listSortByYearOfBirth) {
                list.add(c);
            }
        }
        return list;
    }

    List<Student> getListByGroup(int listSortByGroup) {
        List<Student> list = new ArrayList<Student>();
        for (Student c : studentList) {
            if (c.getGroup() == listSortByGroup) {
                list.add(c);
            }
        }
        return list;
    }
}
