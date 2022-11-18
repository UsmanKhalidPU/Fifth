package com.example.ApiImplimentation.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class ApiImplimentation {
    private String message;

    public ApiImplimentation(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
