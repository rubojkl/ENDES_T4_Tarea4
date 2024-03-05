import java.util.ArrayList;

/**
 * La clase Concesionario
 * @author ruben
 * @version 1.0
 */
public class Concesionario {

    /**
     * Lista de autos concesionarios
    */

    private ArrayList<Auto> autos;


    /**
     * Construstor de la lista de concesionarios
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }


    /**
     * Añade un auto a la lista concesionario
     *
     * @param auto Añade un auto a la lista concesionario
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }


    /**
     * Listar autos array list.
     *
     * @return La lista de autos
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprimir autos de la lista de autos
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

