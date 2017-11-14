/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.lang.Throwable.*; 
import javax.swing.*; 
import java.awt.*;
import java.lang.*;


public class Divisao {
    private int x,y,resultado; 
    String tre; 
    public Divisao(int x, int y) 
    { 
        this.x = x; 
        this.y = y; }
    public void divide () {
    try{
        resultado =x/y;
        System.out.println("o resultado é "+resultado);
        return;
    }
    catch (ArithmeticException e)
    {
    System.out.println("o segundo valor nao pode ser 0");
    System.out.println(e.getMessage());
    e.printStackTrace();
    
    }
    finally{
    System.out.println("fim!");
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Divisao d = new Divisao(2,0);
        d.divide();

    } // main } // Zero
    }
    
