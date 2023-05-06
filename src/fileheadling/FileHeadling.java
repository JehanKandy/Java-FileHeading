/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileheadling;

import java.io.*;
import java.util.*;

/**
 *
 * @author Jehan
 */
public class FileHeadling {

    /**
     * @param args the command line arguments
     * 
     */

    public static void main(String[] args) {
        
        try{
            //FileInputStream in = new FileInputStream("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\input.txt");
            //FileOutputStream out = new FileOutputStream("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\output.txt");
            
            File infile = new File("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\input.txt");
            Scanner infileScan = new Scanner(infile);
            
            FileWriter outfile = new FileWriter("G:\\JAVA\\Projects\\fileHeadling\\build\\classes\\fileheadling\\output.txt");
        
            while(infileScan.hasNextLine()){
                String data = infileScan.nextLine();
                outfile.write(data);              
                
            }
            
            outfile.close();
            
            System.out.println("The FIle is Successfully Wrote");  
            

            
        }
        catch(IOException e){
            
        }
    }
    
}
