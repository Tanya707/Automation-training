package JavaErrorExceptions;

import java.util.List;

public class MainTask {

    public static void main(String[] args) {
        University BNTU = new University("BNTU");
        University.addStudentToList(new Student("Иван", "Дроздов", "Михайлович", 6, 5, 10, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Вадим", "Букатин", "Петрович", 9, 10, 4, "ФЭС", 4, 312));
        University.addStudentToList(new Student("Елена", "Сидорова", "Александровна", 4, 5, 6, "ФТУГ", 2, 401));
        University.addStudentToList(new Student("Иван", "Петров", "Михайлович", 7, 6, 5, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Татьяна", "Борбицкая", "Александровна", 10, 10, 10, "ФТУГ", 2, 401));
        University.addStudentToList(new Student("Ирина", "Иванова", "Дмитриевна", 4, 4, 4, "ФЭС", 2, 310));
        University.addStudentToList(new Student("Дмитрий", "Пчелкин", "Михайлович", 6, 10, 8,"ЭФ" , 1, 201));
        University.addStudentToList(new Student("Светлана", "Козлова", "Александровна", 5, 5, 7, "ЭФ", 3, 211));
        University.addStudentToList(new Student("Светлана", "Хацкевич", "Алексеевна", 8, 6, 7, "ФЭС", 3, 311));

        try {
            University.Checking();
            System.out.println("\nAverage mark of English in University:  " +University.AverageMarkOfEnglishInUniversity());
            System.out.println("\nAverage mark of student Иван Михайлович Дроздов:   " + University.AverageMarkOfStudent("Иван", "Дроздов", "Михайлович"));
            System.out.println("\nAverage mark of group 211, of Energy faculty in Math:  " + University.AverageMarkOfFacultyGroupMath("ЭФ", 211));
        }
        catch (UniversityException ex){
            System.out.println(ex.getMessage());
        }
    }
}
