package com.uca;

import com.uca.dao._Initializer;
import com.uca.gui.*;

import static spark.Spark.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Date;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.mindrot.jbcrypt.BCrypt;


public class doLogin {

    private final static String TOKEN="QVAlKTzo1zW9VwfGvJtrFZiSOzzEzEyb4Q4qdYIYncKqhd4l7Iasgq8LbesvH01Jk8kA49HNt9fq4M4Lpjpjvysyso7egZNlmHSU";
    public static Map<String,String> introspect(String token)
    {
        Claims claims = Jwts.parser().setSigningKey(TOKEN).parseClaimsJws(token).getBody();
        Map<String , String> map=new HashMap<>();
        map.put("name", claims.get("name", String.class));
        map.put("test", claims.get("test", String.class));
        return map;
    }   
    public static String createToken(String name, String test)
    {
        Map<String, String> content= new HashMap<>();
        content.put("name", name);
        content.put("test", test);
        return Jwts.builder().setClaims(content).setId(UUID.randomUUID().toString())
        .setExpiration(new Date(System.currentTimeMillis()*1000 * 60 *60 )).signWith(SignatureAlgorithm.HS256,TOKEN)
        .compact();
   } 
}

