package com.example.ApiImplimentation.services;

import com.example.ApiImplimentation.domain.DBpojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class DbApi {
    DBpojo DbP ;
    public void adddata(DBpojo j) {
        Connection C = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hktemp", "root", "root");
            Statement S = C.createStatement();

            Integer Hk_ID = j.getHk_ID();
            String HotelName = j.getHkName();
            String Location = j.getHkLocation();

            String SQL = "insert into hoteldetails(HotelName, Location, HK_ID) values (?,?,?)";
            //System.out.println(SQL);
            PreparedStatement pst = C.prepareStatement(SQL);

            //System.out.println(pst);

            pst.setString(1, HotelName);
            pst.setString(2, Location);
            pst.setInt(3, Hk_ID);

            Integer K = pst.executeUpdate();
            System.out.println("No of records Inserted : " + K);
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
