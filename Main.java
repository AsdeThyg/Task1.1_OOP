import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            float triangleSideA = getTriangleSide("A");
            float triangleSideB = getTriangleSide("B");
            float triangleSideC = getTriangleSide("C");

            Triangle triangle = new Triangle(triangleSideA, triangleSideB, triangleSideC);

            System.out.println("Длина высоты к стороне A: " + triangle.getHeightToSideA());
            System.out.println("Длина высоты к стороне B: " + triangle.getHeightToSideB());
            System.out.println("Длина высоты к стороне C: " + triangle.getHeightToSideC());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    private static float getTriangleSide(String triangleSideName) {
        System.out.println("Длина стороны " + triangleSideName + " треугольника:");
        return new Scanner(System.in).nextFloat();
    }

}