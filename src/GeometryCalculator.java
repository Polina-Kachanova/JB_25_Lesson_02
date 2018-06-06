import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args){
        int r;
        double circumference = 0, square = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Radius = ");
        while (!sc.hasNextInt()){
            sc.nextLine();
            System.out.print("Radius = ");
        }
        r = sc.nextInt();

        circumference = 2 * Math.PI * r;
        square = Math.PI * Math.pow(r, 2);

        System.out.println("Circumference = " + circumference);
        System.out.println("Square = " + square);
    }
}
