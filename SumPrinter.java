import java.util.Scanner;
public class SumPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        SeriesSum call = new SeriesSum();

        int result = call.sumOfTheSeries(n);
        System.out.println(result);
    }
}
