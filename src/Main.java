//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

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
        //Creare un ArrayList con 12 elementi e stamparlo in console.
        ArrayList<Student> studentes1 = new ArrayList<>();
        studentes1.add(new Student("Mario",25));
        studentes1.add(new Student("Samuele",21));
        studentes1.add(new Student("Fiorenzo",22));
        studentes1.add(new Student("Gabriele",27));
        studentes1.add(new Student("Lorenzo",25));
        studentes1.add(new Student("Brigida",24));
        studentes1.add(new Student("Sara",19));
        studentes1.add(new Student("Michele",24));
        studentes1.add(new Student("Daniele",28));
        studentes1.add(new Student("Davide",25));
        studentes1.add(new Student("Maurizio",30));
        studentes1.add(new Student("Mario",29));
        Collections.sort(studentes1, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getAge(),student2.getAge());
            }
        });
        for (Student studente : studentes1) {
            System.out.println(studente);
    }
}
}

