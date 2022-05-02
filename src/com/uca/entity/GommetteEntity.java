package com.uca.entity;

import java.sql.Timestamp;

public class GommetteEntity {
    private String description;
    private String couleur;
    private int id;

    public GommetteEntity() {
        //Ignored !
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setDescrition(String description)
    {
        this.description = description;
    }
    public String getCouleur()
    {
        return this.couleur;
    }
    public void setCouleur(String couleur)
    {
         this.couleur =couleur ;
    }      
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }          
}
