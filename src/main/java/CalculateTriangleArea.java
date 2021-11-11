public class CalculateTriangleArea {

    public static double gerone(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) throw new NumberFormatException();;

        float p = (float) ((a + b + c) / 2.0);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
