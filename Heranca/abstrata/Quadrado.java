public class Quadrado extends Retangulo {
    private double lado;

    // Getter para lado
    public double getLado() {
        return lado;
    }

    // Setter para lado
    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        this.largura = lado;
        this.altura = lado;
    }

    // Sobrescrita do método area
    @Override
    public double area() {
        return lado * lado;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}
