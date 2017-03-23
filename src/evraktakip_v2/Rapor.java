/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evraktakip_v2;

/**
 *
 * @author yavuz
 */
public class Rapor extends Evrak{
    
    String baslik,aciklama;
    Doktor d;
    
    Rapor(){
        
    }
    Rapor(String baslik,String aciklama,Doktor doktor){
        this.baslik=baslik;
        this.aciklama=aciklama;
        this.d=doktor;
    }
    
}
