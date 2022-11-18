package com.example.ApiImplimentation.services;
import java.util.LinkedList;

public class LLImplimentation {
    public static void main(String[] args) {
        LinkedList<String> Student = new LinkedList<String>();
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

        Student.addFirst("Sara");
        System.out.println(Student.get(0));
        System.out.println(Student.size());
    }

}
