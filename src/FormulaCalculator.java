import java.util.Scanner;

public class FormulaCalculator {

    public static void main(String[] args){
        double a = 0, b = 0, c = 0;
        double result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        while (!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("a = ");
        }
        a = sc.nextInt();

        System.out.print("b = ");
        while (!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("b = ");
        }
        b = sc.nextInt();

        System.out.print("c = ");
        while (!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("c = ");
        }
        c = sc.nextInt();

        double temp = Math.sqrt(Math.pow(b, 2) + 4*a*c);

        if (a == 0) {
            result = Double.NaN;
        } else if(temp < 0){
            result = Double.NaN;
        } else {
            result = ((b + temp)/(2*a)) - Math.pow(a, 3)*c + b;
        }
        System.out.println("Result = " + result);
    }
}
