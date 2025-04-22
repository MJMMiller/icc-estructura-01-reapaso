package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {

    public void ordenarPersona(Persona[] personas) {

        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Persona key = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
    }

    public void imprimirOrdenado(Persona[] personas) {
        ordenarPersona(personas);
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ". " + personas[i].toString());
        }
    }

    public void buscarPersonaPorEdad(Persona[] personas, int edad) {
        ordenarPersona(personas);
        int inicio = 0;
        int fin = personas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (personas[medio].getEdad() == edad) {
                System.out.println("Persona encontrada: " + personas[medio].toString());
                encontrado = true;
                break;
            }

            if (personas[medio].getEdad() < edad) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna persona con la edad " + edad);
        }
    }
}
