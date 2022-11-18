package com.example.ApiImplimentation.services;
import java.util.HashMap;

public class HMImplimentation {
    public static void main(String[] args) {
        HashMap<String, String> StudentCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        StudentCities.put("Usman", "Lahore");
        StudentCities.put("Khalid", "Bahawalpur");
        StudentCities.put("Ali", "Kasur");
        StudentCities.put("Umer", "Islamabad");

        System.out.println(StudentCities);

        System.out.println(StudentCities.get("Usman"));
        System.out.println(StudentCities.size());
        StudentCities.remove("Usman");
        System.out.println(StudentCities.size());

    }
}
