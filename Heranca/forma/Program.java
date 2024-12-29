public class Program {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new FormaGeometrica();

        try {
            System.out.printf("Area: %f", formaGeometrica.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
