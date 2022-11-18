package com.example.ApiImplimentation.domain;

import com.google.gson.annotations.SerializedName;

public class DBpojo {

    @SerializedName("HkNamePM")
    private String HkName;

    @SerializedName("HkLocationPM")
    private String HkLocation;

    @SerializedName("Hk_IDPM")
    private Integer Hk_ID;

    public String getHkName() {
        return HkName;
    }

    public String getHkLocation() {
        return HkLocation;
    }

    public Integer getHk_ID() {
        return Hk_ID;
    }

}
