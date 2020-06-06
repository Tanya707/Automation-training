import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int N = scanner.nextInt();
        System.out.println("Ваш месяц: "+solution(N));
    }
    public static String solution(int N){
        String[] month ={" ","Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентбрь","Октябрь","Ноябрь","Декабрь"};
        if (N>0 && N<month.length) return month[N];
        return "Неправильно введены данные";
    }
}
