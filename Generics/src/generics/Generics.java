/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generics;

/**
 *
 * @author Inezita
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arr = {57,61,41,56,47,71,64,43,66,4,54,30};
        Generics obj= new Generics();
        System.out.println("sum = " + obj.sum(arr));}
    
    public <T extends Number>double sum(T[] arr){
        double response = 0.0;
        for (T t : arr) {
            response = response + t.doubleValue();
        }
        return response;

    }
}
