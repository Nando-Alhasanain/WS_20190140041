/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.praktikum.c.tiga.ws.praktikum.c.tiga;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nando
 */
@Controller
public class DatabaseControllerXML {
    @CrossOrigin
    @RequestMapping(value="/datamhsXML", produces={MediaType.APPLICATION_XML_VALUE})
    
    @ResponseBody
    public List<Datamahasiswa> getDatamhs(){
        
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswa;
    }
    
}
