package services;
import java.util.HashSet;
import java.util.Set;

public class SetImplimentation {
    public static void main(String[] args) {
        HashSet<String> StudentSet = new HashSet<String>();
        StudentSet.add("Usman");
        StudentSet.add("Khalid");
        StudentSet.add("Ali");
        StudentSet.add("Umer");
        StudentSet.add("Arshad");
       // StudentSet.get
        // Printing elements of HashSet object
        System.out.println(StudentSet);
        System.out.println("Set Has Value: " + StudentSet.contains("Umer"));

        StudentSet.add("Usman_");
        StudentSet.add("Khalid_");
        StudentSet.add("Ali_");
        StudentSet.add("Umer_");
        StudentSet.add("Arshad_");
        // StudentSet.get
        // Printing elements of HashSet object
        System.out.println(StudentSet);
        System.out.println("Set Has Value: " + StudentSet.contains("Umer_"));
    }
}
