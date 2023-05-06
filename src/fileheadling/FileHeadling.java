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
     * @throws java.io.IOException
     */

    public static void main(String[] args) {
        
        try{
            File readFile = new File("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\input.txt");
            Scanner myReader = new Scanner(readFile); 
            
            FileWriter outfile = new FileWriter("output.txt");
            //FileWriter myWriter = new FileWriter("filename.txt");
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                outfile.write(data);
                
                System.out.println("Copied.");
            }
            myReader.close();
            outfile.close();
        }
        catch(IOException e){
             System.out.println("An error occurred.");
        }
            
    }
    
}
