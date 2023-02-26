public class Triangle {

    private float sideA, sideB, sideC, triangleArea;

    public Triangle(float triangleSideA, float triangleSideB, float triangleSideC){
        sideA = triangleSideA;
        sideB = triangleSideB;
        sideC = triangleSideC;
        checkInput();
        calcTriangleArea();
    }
    private void checkInput(){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0)
            throw new IllegalArgumentException("Длины сторон треугольника должны быть больше нуля");

        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA))
            throw new IllegalArgumentException("Треугольник с заданными сторонами не существует");
    }
    private void calcTriangleArea(){
        float semiPerimeter = (sideA + sideB + sideC)/2;
        triangleArea = (float) Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    }
    public float getHeightToSideA(){
        return (2 / sideA) * triangleArea;
    }
    public float getHeightToSideB(){
        return (2 / sideB) * triangleArea;
    }
    public float getHeightToSideC(){
        return (2 / sideC) * triangleArea;
    }
}
