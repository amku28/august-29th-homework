import java.lang.Math;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v; //wind speed
        int temp;
        double windChill;

        System.out.println("Enter Wind Speed:");
        v = scan.nextInt();

        System.out.println("Enter Temperature:");
        temp = scan.nextInt();

        //otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16

        if (v < 3) {
            windChill = temp;
        } else {
            windChill = 35.74 + 0.6215 * temp - 35.75 * v * 0.16 + 0.4275 * temp * Math.pow(v, 0.16);
        }
        if (temp > 50) {
            windChill = temp;
        } else {
            windChill = 35.74 + 0.6215 * temp - 35.75 * v * 0.16 + 0.4275 * temp * Math.pow(v, 0.16);
        }

        System.out.println("Wind Chill: " + windChill);
    }
}