package com.example.ApiImplimentation.services;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FetchTest {

    @Test
    void senddatatest() {
        Fetch F= new Fetch();
        String S  = F.senddata(2);
        String E  = "{\"HkNamePM\":\"H One\",\"HkLocationPM\":\"Lahore\",\"Hk_IDPM\":2}";
        assertEquals(E, S);
    }

    @Test
    void sendfalsedatatest() {
        Fetch F= new Fetch();
        String S  = F.senddata(1);
        String E  = "Please check your logic>>>>>>>>>>";
        assertEquals(E, S);
    }

    @Test
    void sendException() {
        Fetch F = new Fetch();
        String S  = F.senddata(null);
        String E  = "Please check your logic";
        assertEquals(E, S);
    }
}