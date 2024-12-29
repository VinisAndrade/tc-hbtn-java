
/*public class Program {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new FormaGeometrica();

        try {
            FormaGeometrica formaGeometrica = new FormaConcreta();
            System.out.println(formaGeometrica.area());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}*/

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
