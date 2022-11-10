package services;
import java.util.ArrayList;

public class ArrayListImplimentation {
    public static void main(String[] args) {
        ArrayList<String> Student = new ArrayList<String>();
        Student.add("Usman");
        Student.add("Khalid");
        Student.add("Ali");
        Student.add("Umer");

        System.out.println(Student.get(2));
        Student.set(2,"Shahab");
        System.out.println(Student.get(2));

        System.out.println(Student.size());
        Student.remove(2);
        System.out.println(Student.size());
        //System.out.println(Student.get(2));
        Student.clear();
        System.out.println(Student.size());

    }
}
