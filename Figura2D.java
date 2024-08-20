//
// interface para objetos 2d
//

public interface Figura2D {
     /**
       * área da figura
    */
    double area();
    
    // mover objeto

    void mover(double umX, double umY);
    void zoom(double fator);
}
