
public class Main {

    public static void main(String[] args) {
        System.out.println("hello world\n");
        Circulo c1 = new Circulo();
        System.out.println("c1: " + c1.toString());
        c1.mover(3,6);
        System.out.println("novo c1: " + c1.toString());
        c1.zoom(2);
        System.out.println("novo c1: " + c1.toString());


        Circulo c2 = new Circulo(3,4, 1);
        System.out.println("c2: " + c2.toString());
        System.out.println("area do c2:" + c2.area());




        Circulo[] lista;              // lista --> null
                                      //               (0)  (1)   (2)
        lista = new Circulo[3];       // lista  --> [ null, null, null ]

        lista[0] = c2;
        lista[1] = c1;
        lista[2] = new Circulo(2,3, 5);

        System.out.println("\nLista de circulos:");
        for(int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());
        }

        System.out.println("\nLista de circulos (foreach):");
        for( Circulo c : lista) {
            System.out.println(c.toString());
        }

        Figura2D fig = new Circulo(3,4,5);
        System.out.println("\n\nFig2D: " + fig.toString());

        System.out.println("\n");


    }
}
