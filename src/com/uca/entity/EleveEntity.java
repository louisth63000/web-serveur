package com.uca.entity;

import java.sql.Timestamp;

public class EleveEntity {
    private String nom;
    private String prenom;
    private String datedenaissance;
    private String classe;
    private int id;

    public EleveEntity() {
        //Ignored !
    }

    public String getnom()
    {
        return this.nom;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public String getprenom()
    {
        return this.prenom;
    }
    public void setprenom(String prenom)
    {
        this.prenom=prenom;
    }
    public String getdatedenaissance()
    {
        return this.datedenaissance;
    }
    public void setdatedenaissance(String datedenaissance)
    {
        this.datedenaissance=datedenaissance;
    }
    public String getClasse()
    {
        return this.classe;
    }
    public void setClasse(String classe)
    {
        this.classe=classe;
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
