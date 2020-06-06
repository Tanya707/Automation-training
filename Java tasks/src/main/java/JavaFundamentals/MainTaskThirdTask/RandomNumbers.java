package JavaFundamentals.MainTaskThirdTask;

import java.util.Random;
import java.util.Scanner;

class RandomNumbers{
    Scanner Scanner=new Scanner(System.in);
    Random random=new Random();
    private int N;
    private int[] myarray;
    public void SetN() {
        System.out.print ("Введите количество случайных чисел:");
        N=Scanner.nextInt();
        myarray=new int[N];
    }

    public int GetN(){
        return N;
    }
    public void SetMyArray(int n){
        for (int i=0; i<N; i++){
            myarray[i]=random.nextInt();
        }
    }

    public void ShowMyArray(){
        System.out.print("Массив случайных цифр без перехода на новую строку:");
        for (int i=0; i<myarray.length; i++){
            System.out.print(myarray[i] + " ");
        }
        System.out.println();
    }

    public void ShowMyLnArray(){
        System.out.println("Массив случайных цифр с переходом на новую строку:");
        for (int i=0; i<myarray.length; i++){
            System.out.println(myarray[i] + " ");
        }
    }
}