package jlexdev.com.jsonparsing;

/**
 * Created by JLex on 28/03/18.
 */

public class Terremoto {

    private String grado;
    private String ciudad;
    private String fecha;

    public Terremoto(String grado, String ciudad, String fecha) {
        this.grado = grado;
        this.ciudad = ciudad;
        this.fecha = fecha;
    }

    public String getGrado() {
        return grado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getFecha() {
        return fecha;
    }
}
