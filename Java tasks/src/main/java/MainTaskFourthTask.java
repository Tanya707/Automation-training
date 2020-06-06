public class MainTaskFourthTask {

    public static void main(String[] args) {
        int Sum = 0;
        int Product = 1;
        for (int i = 0; i < args.length; i++) {
            int Number = Integer.parseInt(args[i]);
            Sum = Sum + Number;
            Product = Product * Number;
        }

        System.out.println("Сумма: " + Sum);
        System.out.println("Произведение: " + Product);
    }
}
