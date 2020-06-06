import java.util.Random;
import java.util.Scanner;

class RandomNumbers{
    Scanner Scanner=new Scanner(System.in);
    Random random=new Random();
    private int N;
    private int[] myarray;
    public void setN() {
        System.out.print ("Введите количество случайных чисел:");
        N=Scanner.nextInt();
        myarray=new int[N];
    }
    public int getN(){
        return N;
    }
    public void setmyarray(int n){
        for (int i=0; i<N; i++){
            myarray[i]=random.nextInt();
        }
    }
    public void showmyarray(){
        System.out.print("Массив случайных цифр без перехода на новую строку:");
        for (int i=0; i<myarray.length; i++){
            System.out.print(myarray[i]+" ");
        }
        System.out.println();
    }
    public void showmylnarray(){
        System.out.println("Массив случайных цифр с переходом на новую строку:");
        for (int i=0; i<myarray.length; i++){
            System.out.println(myarray[i]+" ");
        }
    }
}

public class Task13 {
    public static void main(String[] args) {
        RandomNumbers num=new RandomNumbers();
        num.setN();
        num.setmyarray(num.getN());
        num.showmyarray();
        num.showmylnarray();
    }
}
