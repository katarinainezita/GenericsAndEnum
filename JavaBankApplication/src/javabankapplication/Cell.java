/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabankapplication;

/**
 *
 * @author Inezita
 */
public class Cell<E>{
    private E data;
    public void setValue(E celldata){
        data = celldata;
    }
    public E getValue() {
        return data;
    }
}
