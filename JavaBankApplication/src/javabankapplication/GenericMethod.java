/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabankapplication;

/**
 *
 * @author Inezita
 */
public class GenericMethod {
    public <E> void printArray(E[] array){
        for( E arrayitem : array ){
            System.out.println( arrayitem );
        }//endfor
    }//end method
}
