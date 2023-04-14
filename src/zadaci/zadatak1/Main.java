package zadaci.zadatak1;

public class Main {
    public static void main(String[] args){
        final Classroom Class_IA = new Classroom();
        final Students student1 = new Students("Kanita");
        final Students student2 = new Students("Amina", 17);

        Class_IA.addStudent(student1);
        Class_IA.addStudent(student2);

        Class_IA.printClassroom();

        System.out.println(Class_IA.isPresent("Kanita"));
        System.out.println(Class_IA.isPresent("Alija"));
    }
}
