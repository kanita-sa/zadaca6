package zadaci.zadatak1;

import java.util.ArrayList;

public class Classroom {

    private ArrayList<Students> studentsList;

    public Classroom(){
        this.studentsList = new ArrayList<>();
    }

    public boolean addStudent(final Students theStudent){
        return this.studentsList.add(theStudent);
    }

    public boolean isPresent(final String name){
        for (Students student : studentsList){
            if(student.getName() == name){
                return true;
            }
        }
        return false;
    }

    public void printClassroom(){
        for (Students student : studentsList){
            System.out.println(student.toString());
        }
    }

}
