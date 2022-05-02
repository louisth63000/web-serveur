package com.uca;

import com.uca.dao._Initializer;
import com.uca.gui.*;

import static spark.Spark.*;

import java.net.URLDecoder;
import java.util.HashMap;

public class StartServer {

    public static void main(String[] args) {
        // Configure Spark
        staticFiles.location("/static/");
        port(8081);

        _Initializer.Init();

        // Defining our routes
        get("/users", (req, res) -> {
            return UserGUI.getAllUsers();
        });

        get("/eleves", (req, res) -> {
            return EleveGUI.getAllEleves();
        });

        get("/gommettes", (req, res) -> {
            return GommetteGUI.getAllGommettes();
        });
        post("/gommettes", (req, res) -> {
            String body = req.body();
            HashMap<String, String> params = new HashMap();
            for (String s : body.split("&")) {
                String[] kv = s.split("=");
                params.put(kv[0], kv[1]);
            }
            GommetteGUI.InsertGommette(params);
            return GommetteGUI.getAllGommettes();
        });
        post("/gommettes", (req, res) -> {
            String body = req.body();
            HashMap<String, String> params = new HashMap();
            for (String s : body.split("&")) {
                String[] kv = s.split("=");
                params.put(kv[0], kv[1]);
            }
            GommetteGUI.InsertGommette(params);
            return GommetteGUI.getAllGommettes();
        });
        post("/gommettes/:id", (req, res) -> {
            String body = req.body();
            HashMap<String, String> params = new HashMap();
            for (String s : body.split("&")) {
                String[] kv = s.split("=");
                params.put(kv[0], URLDecoder.decode(kv[1], "UTF-8"));
                System.out.println(kv[0]);
            }
            String token = doLogin.createToken("Test", "azerty");
            System.out.println(token);
            System.out.println(doLogin.introspect(token).get("name"));
            return GommetteGUI.UpdatepageGommette(params);
            // res.redirect("/gommettes", 301);
            // return;
        });

    }
}
