import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Money: ");
        money = sc.nextDouble();
        System.out.println("Time(month): ");
        month = sc.nextInt();
        System.out.println("Interest: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for(int i = 0;i<month;i++){
            total_interset = money * (interset_rate / 100) / 12 * month;

        }
        System.out.println("Total interset: " + total_interset);

    }
}
