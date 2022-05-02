package com.uca.gui;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.uca.entity.GommetteEntity;

import com.uca.core.GommetteCore;

public class GommetteGUI {

    public static String getAllGommettes() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("Gommettes", GommetteCore.getAllGommettes());
        
        System.out.println(GommetteCore.getAllGommettes().get(0).getId());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("gommettes/gommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }
    public static void InsertGommette(HashMap<String,String> insertgommette) throws IOException, TemplateException {
        GommetteCore.insertgommette(insertgommette);
    }
    public static String UpdatepageGommette(HashMap<String,String> insertgommette) throws IOException, TemplateException {
        System.out.println(insertgommette);
        
        Configuration configuration = _FreeMarkerInitializer.getContext();
        Writer output = new StringWriter();
        Template template = configuration.getTemplate("gommettes/updategommettes.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(insertgommette, output);

        return output.toString();
    }
}
