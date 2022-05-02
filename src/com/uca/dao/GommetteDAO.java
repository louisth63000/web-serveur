package com.uca.dao;

import com.uca.entity.GommetteEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GommetteDAO extends _Generic<GommetteEntity> {

    public ArrayList<GommetteEntity> getAllGommettes() {
        ArrayList<GommetteEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM Gommette ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                GommetteEntity entity = new GommetteEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setCouleur(resultSet.getString("couleur"));
                entity.setDescrition(resultSet.getString("description"));
                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }
    public void insertGommette(HashMap<String,String> insertgommette) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("INSERT INTO Gommette (description , couleur) VALUES(?,?);");
            preparedStatement.setString(1, insertgommette.get("description"));
            preparedStatement.setString(2, insertgommette.get("nom"));
            int resultSet = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public GommetteEntity create(GommetteEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(GommetteEntity obj) {
        //TODO !
    }
}
