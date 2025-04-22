package Views;

import Models.Persona;

public class ViewConsole {
    public void printPersonaArray(Persona[] personas){
        System.out.println("Lista de Personas:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ". " + personas[i].toString());
        }

    }

    public void printMenssage(String message){
        
        for(int i = 0; i < 2; i++){
            System.out.println(message);
        }
    }
}
