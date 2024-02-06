//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> studentes = new ArrayList<>();
        studentes.add(new Studente("Marika", 15));
        studentes.add(new Studente("Giovanni", 18));
        studentes.add(new Studente("Filippo", 17));
        studentes.add(new Studente("Marika", 18));
        studentes.add(new Studente("Caterina", 15));
        for (Studente studente : studentes) {
            System.out.println(studente);
        }
        studentes.add(new Studente("Marco", 15));
        studentes.add(new Studente("Mario", 15));
        studentes.add(new Studente("Markus", 18));
        studentes.add(new Studente("Marta", 17));
        for (Studente studente : studentes) {
            System.out.println(studente);
        }

    }
}

