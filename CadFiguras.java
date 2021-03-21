import java.util.ArrayList;
import java.util.List;

public class CadFiguras {
    private List<Figura2D> lista;

    public CadFiguras() {
        lista = new ArrayList<>();
    }

    public void add(Figura2D fig) {
        lista.add(fig);
    }

    public void list() {
        System.out.println("\n\nRelatorio (ruim, pq?) de Figs2D\n");
        for (Figura2D fig: lista) {
            System.out.println(fig);
        }
        System.out.println("\n");
    }
    
}
