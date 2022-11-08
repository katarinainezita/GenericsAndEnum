/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hobby;

/**
 *
 * @author Inezita
 */
public enum NewClass {
    Sopri("Makan", "21"),
    Juan("Tidur", "20"),
    Sasa("Belanja", "19");
    
    public final String hobi;
    public final String umur;
    
    NewClass (String _hobi, String _umur){
        hobi = _hobi;
        umur = _umur;
    }
    
    public String getHobby(){
        return hobi;
    }
    
    public String getUmur(){
        return umur;
    }
    
    
}
