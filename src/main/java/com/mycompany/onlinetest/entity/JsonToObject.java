/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinetest.entity;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author a
 */
@SuppressWarnings("unchecked")
public class JsonToObject {
    
    public static List<Question> readJson(){
         ObjectMapper mapper = new ObjectMapper();
 List<Question> qList= new ArrayList<>();
        try {
            // Java object to JSON file
          Question[] q =  mapper.readValue(new File("D:\\netbeans-workspace\\com.mycompany_onlineTest_war_1.0-SNAPSHOT\\src\\json.txt"), Question[].class);
      
          String jsonString = mapper.writeValueAsString(q);
          qList= Arrays.asList(q);
            for (Question question : q) {
               // System.out.println("================"+question.getQues());
            }
           // System.out.println("/////////////////////////"+jsonString);
        } catch (IOException ex) {
            Logger.getLogger(JsonToObject.class.getName()).log(Level.SEVERE, null, ex);
        }

	// Java object to JSON string
	
    return qList;
    }
   
    public static String readFile(){
    String path="D:\\netbeans-workspace\\com.mycompany_onlineTest_war_1.0-SNAPSHOT\\src\\json.txt";
    /*File file= new File(path);
      String st="";
        try {
            st = new String ( Files.readAllBytes( Paths.get(path) ) );
            System.out.println("************************** "+st);
        } catch (IOException ex) {
            Logger.getLogger(JsonToObject.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
        JSONParser jSONParser = new JSONParser();
        List<Question> qList = new ArrayList<Question>();
        
        try {
             FileReader reader = new FileReader(path);
              Object obj = jSONParser.parse(reader);
              JSONArray arrayList = (JSONArray) obj;
            //System.out.println("------------- "+arrayList);

          //  arrayList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonToObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JsonToObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(JsonToObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
           
 
            
    
    
     return "";
    }
    
    
}
