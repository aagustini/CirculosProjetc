
// editado no remote

public class Ponto {
    private double X;    
    private double Y;    

    public Ponto(double umX, double umY)  {
        this.X = umX;
        this.Y = umY;
    }

    public void move(double novoX, double novoY) {
        this.X = novoX;
        this.Y = novoY;
    }


    // toString gerado automatico
    
    @Override
    public String toString() {
        return "Ponto{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
