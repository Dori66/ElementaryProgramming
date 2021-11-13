import java.util.Scanner;

public class ComputeVolumeOfCylinder {
    /**
     * Write a program that reads in the radius
     * and length of a cylinder and computes the area and volume
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);

    }
}
