package JavaClasses;

import java.util.List;

public class MainTask {

    public static void main(String[] args) {
        University BNTU = new University("BNTU");
        University.addStudentToList(new Student("Иван", "Дроздов", "Михайлович",  12, 11, 1990, "Минск", 12345, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Богдан", "Букатин", "Петрович",  2, 10, 1992, "Минск", 5478, "ФЭС", 4, 210));
        University.addStudentToList(new Student("Елена", "Сидорова", "Александровна", 3, 8, 1994, "Могилев", 64897, "ФТУГ", 2, 215));
        University.addStudentToList(new Student("Иван", "Петров", "Михайлович",  4, 5, 1993, "Борисов", 15685, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Татьяна", "Борбицкая", "Александровна",  25, 11, 1991, "Гомель", 645567, "ФТУГ", 2, 235));
        University.addStudentToList(new Student("Ирина", "Иванова", "Дмитриевна",  23, 9, 1995, "Брест", 536987, "ФТУГ", 2, 235));
        University.addStudentToList(new Student("Дмитрий", "Пчелкин", "Михайлович",  22, 10, 1996, "Минск", 15685, "ЭФ", 1, 201));
        University.addStudentToList(new Student("Светлана", "Козлова", "Александровна",  25, 8, 1996, "Чашники", 64846, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Светлана", "Хацкевич", "Алексеевна",  20, 12, 1990, "Витебск", 68979, "ФЭС", 3, 248));

        System.out.println("\nList of students of a given faculty");
        List<Student> listSortByNameFaculty = BNTU.getListByfaculty("ЭФ");
        for (Student c : listSortByNameFaculty) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ЭФ and course 1");
        List<Student> listSortByNameFacultyCourseEF1 = BNTU.getListByfacultyCourse("ЭФ", 1);
        for (Student c : listSortByNameFacultyCourseEF1) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ЭФ and course 3");
        List<Student> listSortByNameFacultyCourseEF3 = BNTU.getListByfacultyCourse("ЭФ", 3);
        for (Student c : listSortByNameFacultyCourseEF3) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФЭС and course 3");
        List<Student> listSortByNameFacultyCourseFES3 = BNTU.getListByfacultyCourse("ФЭС", 3);
        for (Student c : listSortByNameFacultyCourseFES3 ) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФЭС and course 4");
        List<Student> listSortByNameFacultyCourseFES4 = BNTU.getListByfacultyCourse("ФЭС", 4);
        for (Student c : listSortByNameFacultyCourseFES4 ) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФТУГ and course 2");
        List<Student> listSortByNameFacultyCourseFTUG2 = BNTU.getListByfacultyCourse("ФТУГ", 2);
        for (Student c : listSortByNameFacultyCourseFTUG2) {
            System.out.println(c);
        }

        System.out.println("\nList of students of Year of birth");
        List<Student> listSortByYearOfBirth = BNTU.getListByYearOfBirth(1994);
        for (Student c : listSortByYearOfBirth) {
            System.out.println(c);
        }

        System.out.println("\nList of students of Group");
        List<Student> listSortByGroup = BNTU.getListByGroup(211);
        for (Student c : listSortByGroup) {
            System.out.println(c);
        }
    }
}
