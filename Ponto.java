public class Ponto {
    private double X;    // coordenada X
    private double Y;    // coordenada Y

    public Ponto(double umX, double umY)  {
        this.X = umX;
        this.Y = umY;
    }

    public void move(double novoX, double novoY) {
        this.X = novoX;
        this.Y = novoY;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
