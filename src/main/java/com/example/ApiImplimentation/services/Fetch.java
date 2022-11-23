package com.example.ApiImplimentation.services;

import com.example.ApiImplimentation.domain.DBpojo;
import com.google.gson.Gson;

import java.sql.*;

public class Fetch {

    public String senddata(Integer K) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            Connection C =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hktemp", "root", "root");
            Statement S = C.createStatement();
            DBpojo P = new DBpojo();

            String SQL = "select * from hoteldetails where HK_ID='"+K+"'";
            System.out.println(SQL);

            ResultSet rs = S.executeQuery(SQL);

            if (rs.next()) {
                P.setHkName(rs.getString("HotelName"));
                P.setHkLocation(rs.getString("Location"));
                P.setHk_ID(rs.getInt("HK_ID"));

                Gson gson = new Gson();
                String json = gson.toJson(P);
                System.out.println(json);
                return json;
            }

            else {
                return "Please check your logic>>>>>>>>>>";
            }

//            String HN =  new String();
//            String HL =  new String();
//            Integer I = null;
//            ResultSet rs = S.executeQuery(SQL);
//
//            if (rs.next()) {
//                HN = rs.getString("HotelName");
//                HL = rs.getString("Location");
//                I = rs.getInt ("HK_ID");
//            }
//
//            P.setHkName(HN);
//            P.setHkLocation(HL);
//            P.setHk_ID(Integer.valueOf(I));
        }

        catch (Exception e) {
            System.out.println(e);
        }
        return "Please check your logic";
    }
}
