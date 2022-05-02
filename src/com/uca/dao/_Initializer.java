package com.uca.dao;

import java.sql.*;

import javax.print.attribute.SetOfIntegerSyntax;

 public class _Initializer {

    public static void Init(){
        Connection connection = _Connector.getInstance();
        try {
            PreparedStatement statement;

            //Init articles table
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS users (id int primary key auto_increment, firstname varchar(100), lastname varchar(100)); ");
            statement.executeUpdate();

            //Todo Remove me !
/*            statement = connection.prepareStatement("INSERT INTO users(firstname, lastname) VALUES(?, ?);");
            statement.setString(1, "Theodore");
            statement.setString(2, "Muillerez");
            statement.executeUpdate(); */
            
            
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Prof (id int primary key auto_increment, nom varchar(100), prenom varchar(100), pseudo varchar(100)); ");
            statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Classe (id int primary key auto_increment, nomClasse varchar(100)); ");
            statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Eleve (id int primary key auto_increment, nom varchar(100), prenom varchar(100), datedenaissance varchar(100),classe varchar(100),FOREIGN KEY (classe) REFERENCES Classe(nomClasse))");
            statement.executeUpdate();
            
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Gommette (id int primary key auto_increment,description varchar(100) , couleur varchar(100)); ");
            statement.executeUpdate();
            
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS EleveGommette (id int primary key auto_increment,idGommette int , idEleve int , idProf int ,Raison varchar(100),FOREIGN KEY (idGommette) REFERENCES Gommette(id),FOREIGN KEY (idEleve) REFERENCES Eleve(id),FOREIGN KEY (idProf) REFERENCES Prof(id)); ");
            statement.executeUpdate();

            //Todo Remove me !

            // statement = connection.prepareStatement("INSERT INTO Classe (nomClasse) VALUES(?);");
            // statement.setString(1, "1er");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Classe (nomClasse) VALUES(?);");
            // statement.setString(1, "2nd");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Eleve(nom, prenom,datedenaissance,classe) VALUES( ?, ?, ?, ?);");
            // statement.setString(1, "test1");
            // statement.setString(2,"Test45");
            // statement.setString(3,"01/01/2000");
            // statement.setString(4,"1er");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Eleve(nom, prenom,datedenaissance,classe) VALUES( ?, ?, ?, ?);");
            // statement.setString(1, "test2");
            // statement.setString(2,"HELLOOOWORLD");
            // statement.setString(3,"05/07/2000");
            // statement.setString(4,"2nd");
            // statement.executeUpdate();

            // statement = connection.prepareStatement("INSERT INTO Prof ( nom , prenom, pseudo) VALUES(?,?,?);");
            // statement.setString(1, "sgsg");
            // statement.setString(2, "TEST2");
            // statement.setString(3, "fhj");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Prof ( nom , prenom, pseudo) VALUES(?,?,?);");
            // statement.setString(1, "idée");
            // statement.setString(2, "Aucune");
            // statement.setString(3, "gpaid");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Gommette (description , couleur) VALUES(?,?);");
            // statement.setString(1, "Très bien");
            // statement.setString(2, "OR");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO Gommette (description , couleur) VALUES(?,?);");
            // statement.setString(1, "Nul à chier");
            // statement.setString(2, "ROUGE");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO EleveGommette (idGommette, idEleve , idProf ,Raison ) VALUES(?,?,?,?);");
            // statement.setInt(1,1);
            // statement.setInt(2,1);
            // statement.setInt(3,1);
            // statement.setString(4, "areeqrqj");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("INSERT INTO EleveGommette (idGommette, idEleve , idProf ,Raison ) VALUES(?,?,?,?);");
            // statement.setInt(1,2);
            // statement.setInt(2,2);
            // statement.setInt(3,2);
            // statement.setString(4, "stdsdthsj");
            // statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("could not create database !");
        }
    }
}
