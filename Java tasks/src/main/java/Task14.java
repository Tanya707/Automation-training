public class Task14 {

    public static void main(String[] args) {
        int s = 0;
        int p = 1;
        for (int i = 0; i < args.length; i++) {
            int at = Integer.parseInt(args[i]);
            s = s + at;
            p = p * at;
        }
        System.out.println("Сумма: " + s);
        System.out.println("Произведение: " + p);
    }
}
