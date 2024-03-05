import java.util.ArrayList;

/**
 * La clase auto en la cual tenemos clase marca y modelo
 * @author ruben
 * @version 1.0
 */
public class Auto {
    //Atributos de la clase auto
    private String marca;
    private String modelo;

    /**
     * Constructor de auto
     *
     * @param marca  la marca de auto
     * @param modelo el modelo de auto
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve la marca
     *
     * @return La marca
     */
    public String getMarca() {
        return marca;
    }


    /**
     * Metodo que establece una marca
     *
     * @param marca la marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }


    /**
     * Metodo que devuelve el modelo.
     *
     * @return modelo el modelo
     */
    public String getModelo() {
        return modelo;
    }


    /**
     * Metodo que establece el modelo.
     *
     * @param modelo el modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que convierte un objeto Auto en un objeto String
     * @return Cadena que presenta auto.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


