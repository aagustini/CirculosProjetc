public class Circulo {

    //private double coordX;   // coordenada em X do centro do circulo
    //private double coordY;

    private Ponto centro;
    private double raio;   // raio atributo

    public Circulo(double umX, double umY, double raio) {  // raio parametro
        //this.coordX = umX;
        //this.coordY = umY;
        centro = new Ponto(umX, umY);
        this.raio = raio;
    }

   public Circulo() {
        //coordX = 0;
        //coordY = 0;
        // centro = new Ponto(0, 0);
        //raio = 1;
        this(0, 0, 1);
    }

    public void mover(double novoX, double novoY) {
        //coordX = novoX;
        //coordY = novoY;
        centro.move(novoX, novoY);   // centro = new Ponto(novoX, novoY);
    }

    public void zoom(double fator)  {
        raio = raio * fator;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);  // 3.1415 * raio * raio
    }

    @Override
    public String toString() {
        //return "(" + coordX + ", " + ....;
        //return String.format("(%.2f, %.2f) raio: %.2f",
        //        coordX, coordY, raio);
        return String.format("(circ) centro: %s raio: %.2f",
                centro.toString(), raio);
    }
}
