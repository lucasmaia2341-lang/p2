public class exercicio02 {

    private double altura = 1;
    private double largura = 1;

    // Getter da altura
    public double getAltura() {
        return altura;
    }

    // Setter da altura
    public void setAltura(double altura) {

        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida.");
        }
    }

    // Getter da largura
    public double getLargura() {
        return largura;
    }

    // Setter da largura
    public void setLargura(double largura) {

        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida.");
        }
    }

    // Método para calcular área
    public double calcularArea() {
        return altura * largura;
    }

    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
