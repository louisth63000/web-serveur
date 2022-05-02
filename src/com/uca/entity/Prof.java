package com.uca.entity;
public class Prof
{
    private String nom;
    private String prenom;
    private String nomUtilisateur;
    private String MotDePasse;
    private int id;
    
    public int getId() {
        return this.id;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public String getNomUtilisateur() {
        return this.nomUtilisateur;
    }
    
    public String getMdp() {
        return this.MotDePasse;
    }
    
    public void setId(int Id)
    {
        this.id=Id;
    }
    public void setNom(String n)
    {
        this.nom=n;
    }
    public void setPrenom(String p)
    {
        this.prenom=p;
    }
    public void setNomUtilisateur(String user)
    {
        this.nomUtilisateur=user;
    }
    public void setMotDePasse(String Mdp)
    {
        this.MotDePasse=Mdp;
    }
    
}
