package Task2;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        university BNTU = new university("BNTU");
        university.addStudentToList(new student("Иван", "Дроздов", "Михайлович",  12, 11, 1990, "Минск", 12345, "ЭФ", 3, 211));
        university.addStudentToList(new student("Богдан", "Букатин", "Петрович",  2, 10, 1992, "Минск", 5478, "ФЭС", 4, 210));
        university.addStudentToList(new student("Елена", "Сидорова", "Александровна", 3, 8, 1994, "Могилев", 64897, "ФТУГ", 2, 215));
        university.addStudentToList(new student("Иван", "Петров", "Михайлович",  4, 5, 1993, "Борисов", 15685, "ЭФ", 3, 211));
        university.addStudentToList(new student("Татьяна", "Борбицкая", "Александровна",  25, 11, 1991, "Гомель", 645567, "ФТУГ", 2, 235));
        university.addStudentToList(new student("Ирина", "Иванова", "Дмитриевна",  23, 9, 1995, "Брест", 536987, "ФТУГ", 2, 235));
        university.addStudentToList(new student("Дмитрий", "Пчелкин", "Михайлович",  22, 10, 1996, "Минск", 15685, "ЭФ", 1, 201));
        university.addStudentToList(new student("Светлана", "Козлова", "Александровна",  25, 8, 1996, "Чашники", 64846, "ЭФ", 3, 211));
        university.addStudentToList(new student("Светлана", "Хацкевич", "Алексеевна",  20, 12, 1990, "Витебск", 68979, "ФЭС", 3, 248));

        System.out.println("\nList of students of a given faculty");
        List<student> listSortByNameFaculty = BNTU.getListByfaculty("ЭФ");
        for (student c : listSortByNameFaculty) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ЭФ and course 1");
        List<student> listSortByNameFacultyCourseEF1 = BNTU.getListByfacultyCourse("ЭФ", 1);
        for (student c : listSortByNameFacultyCourseEF1) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ЭФ and course 3");
        List<student> listSortByNameFacultyCourseEF3 = BNTU.getListByfacultyCourse("ЭФ", 3);
        for (student c : listSortByNameFacultyCourseEF3) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФЭС and course 3");
        List<student> listSortByNameFacultyCourseFES3 = BNTU.getListByfacultyCourse("ФЭС", 3);
        for (student c : listSortByNameFacultyCourseFES3 ) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФЭС and course 4");
        List<student> listSortByNameFacultyCourseFES4 = BNTU.getListByfacultyCourse("ФЭС", 4);
        for (student c : listSortByNameFacultyCourseFES4 ) {
            System.out.println(c);
        }

        System.out.println("\nList of students of faculty ФТУГ and course 2");
        List<student> listSortByNameFacultyCourseFTUG2 = BNTU.getListByfacultyCourse("ФТУГ", 2);
        for (student c : listSortByNameFacultyCourseFTUG2) {
            System.out.println(c);
        }

        System.out.println("\nList of students of Year of birth");
        List<student> listSortByYearOfBirth = BNTU.getListByYearOfBirth(1994);
        for (student c : listSortByYearOfBirth) {
            System.out.println(c);
        }

        System.out.println("\nList of students of Group");
        List<student> listSortByGroup = BNTU.getListByGroup(211);
        for (student c : listSortByGroup) {
            System.out.println(c);
        }
    }
}
