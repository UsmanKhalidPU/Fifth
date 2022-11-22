package com.example.ApiImplimentation.services;

import com.example.ApiImplimentation.domain.DBpojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class forUpdate {
    public String updatedata(DBpojo K, Integer s) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hktemp", "root", "root");
            Statement S = C.createStatement();


            String SQL = "select * from hoteldetails where HK_ID='"+s+"'";

            System.out.println(SQL);

            ResultSet rs = S.executeQuery(SQL);

            if (rs.next())
            {
                String SQL2 = "update hoteldetails set HotelName='" + K.getHkName() + "', " + "Location='" +K.getHkLocation() +"', " + "HK_ID='" +K.getHk_ID() + "' where HK_ID='" + s + "'";

                System.out.println(SQL2);
                S.executeUpdate(SQL2);

                return "Record Updated";
            }
            return "Key not found";
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return "Please check your logic";
    }
}
