package com.uca.gui;

import com.uca.core.ProfCore;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class ProfGUI {

    public static String getAllProfs() throws IOException, TemplateException {
        Configuration configuration = _FreeMarkerInitializer.getContext();

        Map<String, Object> input = new HashMap<>();

        input.put("Profs", ProfCore.getAllProfs());
        
        System.out.println(ProfCore.getAllProfs().get(0).getId());

        Writer output = new StringWriter();
        Template template = configuration.getTemplate("users/Prof.ftl");
        template.setOutputEncoding("UTF-8");
        template.process(input, output);

        return output.toString();
    }
}
