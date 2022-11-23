package com.example.ApiImplimentation.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class forDelete {
    public String deletedate(Integer s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"). newInstance();

            Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hktemp", "root", "root");
            Statement S = C.createStatement();
            String SQL = "delete from hoteldetails where HK_ID='"+s+"'";
            System.out.println(SQL);
            int rs = S.executeUpdate(SQL);
            return "No of records deleted: " +rs;

        }


        catch (Exception e) {
            System.out.println(e);
        }

        return "Please check your logic";

    }
}
