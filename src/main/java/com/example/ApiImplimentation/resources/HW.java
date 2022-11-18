package com.example.ApiImplimentation.resources;

import com.example.ApiImplimentation.domain.ApiImplimentation;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hwr")
public class HW {

    @GET
    @Path("/test")
    public Response helloWorld()
    {
        ApiImplimentation APIIMP;
        APIIMP = new ApiImplimentation("My Name is Usman");

        Gson g = new Gson();
        String J = g.toJson(APIIMP);
        return Response.ok(J).build();
    }
}
