public class Studente {
    String name;
    int age ;

    public Studente(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
