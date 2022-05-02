package com.uca.core;

import com.uca.dao.ProfDAO;
import com.uca.entity.Prof;

import java.util.ArrayList;

public class ProfCore {

    public static ArrayList<Prof> getAllProfs() {
        return new ProfDAO().getAllProfs();
    }

} 
