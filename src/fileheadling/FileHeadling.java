/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileheadling;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Jehan
 */
public class FileHeadling {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException{
        
        try{
            File readFile = new File("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\input.txt");
            Scanner myReader = new Scanner(readFile); 
            
            FileWriter outfile = new FileWriter("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\output.txt");
            
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            
        }
        catch(FileNotFoundException e){
             System.out.println("An error occurred.");
        }
            
    }
    
}
