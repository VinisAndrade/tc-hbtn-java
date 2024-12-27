public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Getter para largura
    public double getLargura() {
        return largura;
    }

    // Setter para largura
    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    // Getter para altura
    public double getAltura() {
        return altura;
    }

    // Setter para altura
    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }
}