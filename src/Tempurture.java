import java.util.Scanner;

public class Tempurture {
    public static void main(String[] args) {
        int[] temps = new int[30];
        boolean[] isFilled = new boolean[30];

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter two numbers: data temperature");
            String input = scanner.nextLine(); //"11 31"
            if("end".equals(input)){
                break;
            }
            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temps[day] = t;
            isFilled[day] = true;
            double sum = 0;
            for (int tt: temps){
                sum += tt;
            }
            int cnt = 0;
            for(boolean f: isFilled){
                cnt++;
            }
            System.out.println("Средняч температура: " + (sum / cnt) );
            t
        }
    }
}