/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hobby;

/**
 *
 * @author Inezita
 */
public class Hobby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(NewClass Orang : NewClass.values()){
            System.out.printf("%s\t%s\t%s\n", Orang, Orang.getHobby(), Orang.getUmur());
        }
    }
    
}
