package com.example.ApiImplimentation.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBImplimentation {

    public static void main(String[] args) {

        try {
            Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/hktemp", "root", "root");
            Statement S = C.createStatement();
//
//            Scanner SC = new Scanner(System.in);
//            System.out.println("Enter Hotel name: ");
//            String Hname = SC.nextLine();
//            System.out.println("Enter Hotel Location: ");
//            String HLoc = SC.nextLine();
//            System.out.println("Enter Hotel ID: ");
//            String HId = SC.nextLine();
//
//            String query = "insert into hoteldetails(HotelName, Location, HK_ID) values ('" + Hname +"', '"+HLoc +"', '"+ HId +"')";
//            //System.out.println(query);
//            int r = S.executeUpdate(query);
//            //System.out.println(r);
//
//            ResultSet St = S.executeQuery("select * from hoteldetails");
//            while(St.next())
//            {
//                System.out.println(St.getString(1));
//            }
//
//            String SQL = "insert into hoteldetails(HotelName, Location, HK_ID) values (?,?,?)";
//            //System.out.println(SQL);
//            PreparedStatement pst = C.prepareStatement(SQL);
//            //System.out.println(pst);
//
//            for(int i=0; i<3; i++)
//            {
//                System.out.println("Enter Hotel name: ");
//                String Hname_ = SC.nextLine();
//                pst.setString(1,Hname_);
//                System.out.println("Enter Hotel Location: ");
//                String HLoc_ = SC.nextLine();
//                pst.setString(2,HLoc_);
//                System.out.println("Enter Hotel ID: ");
//                Integer HId_ = Integer.valueOf(SC.nextLine());
//                pst.setInt(3, HId_);
//
//                pst.executeUpdate();
//            }

        }

        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
