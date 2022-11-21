package com.example.ApiImplimentation.resources;

import com.example.ApiImplimentation.domain.ApiImplimentation;
import com.example.ApiImplimentation.domain.DBpojo;
import com.example.ApiImplimentation.services.DbApi;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hwr")
public class HW {

    @GET
    @Path("/test")
    public Response helloWorld()
    {
        ApiImplimentation APIIMP;
        APIIMP = new ApiImplimentation("Usman");

        Gson g = new Gson();
        String J = g.toJson(APIIMP);
        return Response.ok(J).build();
    }
    @POST
    @Path("/add")
    public Response HW(String PL)
    {
        Gson g = new Gson();
        DBpojo J = g.fromJson(PL, DBpojo.class);
        System.out.println(J);
        DbApi dbapi = new DbApi();
        dbapi.adddata(J);
        System.out.println(dbapi);

        return Response.ok().build();
    }
}
