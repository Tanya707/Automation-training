package JavaFundamentals.MainTaskThirdTask;

public class MainTaskThirdTask {
    public static void main(String[] args) {
        RandomNumbers num=new RandomNumbers();
        num.SetN();
        num.SetMyArray(num.GetN());
        num.ShowMyArray();
        num.ShowMyLnArray();
    }
}
