/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classe.Multa;
import classe.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunocmc
 */
@WebServlet("/ControleMultaJSON")
public class ExemploJSONObjetosAgregados extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
    
   Veiculo v = new Veiculo("ABC-123",2019,"Fiat","Palio",1000);
   Multa m = new Multa(new Date(),150.0,4,v);
   
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setPrettyPrinting();
    Gson gson = gsonBuilder.create();
    
    String json = gson.toJson(m);
    response.getWriter().println(json);
    }
}
