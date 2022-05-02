package com.uca.core;


import java.util.ArrayList;
import java.util.HashMap;

import com.uca.entity.GommetteEntity;
import com.uca.dao.GommetteDAO;

public class GommetteCore {

    public static ArrayList<GommetteEntity> getAllGommettes() {
        return new GommetteDAO().getAllGommettes();
    }
    public static void insertgommette(HashMap<String,String> insertgommette)
    {  
        GommetteDAO insert=new GommetteDAO();
        insert.insertGommette(insertgommette);
    }
}
