package Models;

/**
 * Clase Persona que representa una entidad Persona con atributos para nombre y
 * edad.
 */
public class Persona {
    // Atributos de la clase
    private String nombre; // Almacena el nombre de la persona
    private int edad; // Almacena la edad de la persona

    /**
     * Constructor para crear una nueva instancia de Persona con un nombre y edad
     * específicos.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad; // Asigna la edad pasada al atributo edad de la clase
    }

    @Override
    public String toString() {
        return nombre + " - " + edad; // Devuelve el nombre y la edad de la persona en formato String
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }

    // TODO: Agregar getters y setters para los atributos de la clase


}
