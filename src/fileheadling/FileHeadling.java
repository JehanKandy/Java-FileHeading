/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileheadling;

import java.io.*;
/**
 *
 * @author Jehan
 */
public class FileHeadling {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        try{
            FileReader in = new FileReader("input.txt");
            FileWriter out = new FileWriter("output.txt");
        }
        catch(IOException e){
            System.out.println("ERROR : " + e.getMessage());
        }
            
    }
    
}
