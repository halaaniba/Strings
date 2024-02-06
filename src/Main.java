//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Giovanni", 17);
        Studente studente2 = new Studente("Mario", 19);
        Studente studente3 = new Studente("Marco", 16);
        Studente studente4 = new Studente("Francesca", 12);
        Studente studente5 = new Studente("Alberto", 14);
        Studente studente6 = new Studente("Giulia", 18);
        Studente studente7 = new Studente("Benedetta", 17);


        List<Studente> lista1 = Arrays.asList(studente1, studente2, studente3);
        System.out.println(lista1);
        List<Studente> lista2 = new ArrayList<>();
        lista2.add(studente4);
        lista2.add(studente5);
        lista2.add(studente6);
        lista2.add(studente7);
        System.out.println(lista2);
    }

}

