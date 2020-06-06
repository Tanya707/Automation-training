package Task2;

import java.util.ArrayList;
import java.util.List;

class university {
    private String universityName;
    private static ArrayList<student> studentList = new ArrayList<student>();

    public university(String universityName) {
        this.universityName = universityName;
    }

   public static void addStudentToList(student Student) {
     studentList.add(Student);
   }

    List<student> getListByfaculty(String listSortByNameFaculty) {
        List<student> list = new ArrayList<student>();
        for (student c : studentList) {
            if (c.getFaculty() == listSortByNameFaculty) {
                list.add(c);
            }
        }
        return list;
    }

    List<student> getListByfacultyCourse(String listSortByNameFaculty1, int listSortByNameCourse1) {
        List<student> list = new ArrayList<student>();
        for (student c : studentList) {
            if (c.getFaculty() == listSortByNameFaculty1 && c.getCourse() == listSortByNameCourse1) {
                list.add(c);
            }
        }
        return list;
    }

    List<student> getListByYearOfBirth(int listSortByYearOfBirth) {
        List<student> list = new ArrayList<student>();
        for (student c : studentList) {
            if (c.getYearofbirth() > listSortByYearOfBirth) {
                list.add(c);
            }
        }
        return list;
    }

    List<student> getListByGroup(int listSortByGroup) {
        List<student> list = new ArrayList<student>();
        for (student c : studentList) {
            if (c.getGroup() == listSortByGroup) {
                list.add(c);
            }
        }
        return list;
    }
}
