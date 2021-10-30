/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinetest.Dao;

import com.mycompany.onlinetest.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author a
 */
public class UserDao {
      private SessionFactory factory;
    public UserDao(SessionFactory factory)
    {
    this.factory = factory;
    }
    public User getUserByEmailPassword(String email , String pass){
    
    User u = null;
        try {
            String query="from User where email =: e and password =: p";
            Session s =this.factory.openSession();
           
                    Query q= s.createQuery(query);
                    
                    q.setParameter("e",email);
                    q.setParameter("p",pass);
                    
                    u = (User)q.uniqueResult();
                    s.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    return u;
    } 
}
