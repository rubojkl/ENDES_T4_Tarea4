/**
 * La clase main desde la cual se ejecuta todo el codigo
 * @author ruben
 * @version 1.0
 */
public class Main {
    /**
     * El método  que inicia la aplicación.
     *
     * @param args para los metodos
     */
    public static void main(String[] args) {
        //Generamos dos objetos autos con el constructor
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        //Generamos un concesionario tambien
        Concesionario concesionario1 = new Concesionario();

        //Le agregamos los autos creados anteriormente
        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        //Imprimimos los Autos por pantalla
        concesionario1.imprimirAutos();
    }
}
