import Entidades.Matematica;
import Servicios.MatematicasServicios;

public class Main {
    public static void main(String[] args) {

        MatematicasServicios ms = new MatematicasServicios();
        Matematica m1 = ms.crearNumeros();
        ms.menu(m1);

    }
}