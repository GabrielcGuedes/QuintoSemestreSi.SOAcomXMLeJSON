/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import classe.Veiculo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//import org.jboss.logging.Logger;

/**
 *
 * @author alunocmc
 */
@WebServlet ("/ControleVeiculoXML")
public class ExemploXml extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
    
        try {
            Veiculo v = new Veiculo("ABC-123",2019,"Fiat","Palio",1000);
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Veiculo.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(v, sw);
            
            String xmlContent = sw.toString();
            
            response.getWriter().println(xmlContent);
            
        } catch (JAXBException ex) {
            java.util.logging.Logger.getLogger(ExemploXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
