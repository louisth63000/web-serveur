package com.uca.dao;

import com.uca.entity.EleveEntity;

import java.sql.*;
import java.util.ArrayList;

public class EleveDAO extends _Generic<EleveEntity> {

    public ArrayList<EleveEntity> getAllEleves() {
        ArrayList<EleveEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM Eleve ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                EleveEntity entity = new EleveEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setNom(resultSet.getString("nom"));
                entity.setprenom(resultSet.getString("prenom"));
                entity.setdatedenaissance(resultSet.getString("datedenaissance"));
                entity.setClasse(resultSet.getString("classe"));
                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    @Override
    public EleveEntity create(EleveEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(EleveEntity obj) {
        //TODO !
    }
}
