import javax.swing.text.View;

import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        ViewConsole vC = new ViewConsole();
        vC.printPersonaArray(personas);
        System.out.println("------------------------");

        System.out.println("Ordenar personas por edad");

        PersonaController pC = new PersonaController();
        pC.ordenarPersona(personas);
        vC.printPersonaArray(personas);

        System.out.println("-------------------------");

        System.out.println("Buscar persona por edad");
        int edadABuscar = 40;
        pC.buscarPersonaPorEdad(personas, edadABuscar);
        int edadABuscar1 = 99;
        pC.buscarPersonaPorEdad(personas, edadABuscar1);

    }
}
