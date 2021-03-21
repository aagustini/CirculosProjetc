public class Quadrado implements Figura2D {
    private double lado;
    private Ponto cantoSupEsquerdo;

    public Quadrado(double x, double y, double umLado) {
        cantoSupEsquerdo = new Ponto(x,y);
        lado = umLado;     
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public void mover(double umX, double umY) {
       cantoSupEsquerdo = new Ponto(umX, umY);
        
    }

    @Override
    public void zoom(double fator) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        return String.format("(quadr) CSE: %s lado: %.2f",
                cantoSupEsquerdo.toString(), lado);
    }
    
}
