/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evraktakip_v1;

import com.sun.corba.se.impl.logging.POASystemException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yavuz
 */
public class User {
   public  static ArrayList <User> userlar = new ArrayList<>();
    String id,parola,isim,soyisim;
    User(){
        
    }
    User(String id,String parola){
        
        this.id=id;
        this.parola=parola;
        userlar.add(this);
    }
    User(String id,String parola,String adi,String soyadi){
        this.id=id;
        this.isim=adi;
        this.soyisim=soyadi;
        this.parola=parola;
        userlar.add(this);
    }
    
}
