package com.uca.dao;

import com.uca.entity.Prof;

import java.sql.*;
import java.util.ArrayList;

public class ProfDAO extends _Generic<Prof> {

    public ArrayList<Prof> getAllProfs() {
        ArrayList<Prof> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM Prof ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Prof entity = new Prof();
                entity.setId(resultSet.getInt("id"));
                entity.setNom(resultSet.getString("lastname"));
                entity.setPrenom(resultSet.getString("firstname"));
                entity.setNomUtilisateur(resultSet.getString("username"));
                entity.setMotDePasse(resultSet.getString("passeword"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    @Override
    public Prof create(Prof obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(Prof obj) {
        //TODO !
    }
}
