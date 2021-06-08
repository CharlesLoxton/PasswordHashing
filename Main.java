/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr;

import java.io.*;

/**
 *
 * @author User
 */
public class Main {
    private static String drive;
   
   
    public static void main(String[] args){
        
        try{
            File[] paths = File.listRoots();
                for(File path:paths)
                {
                    // prints file and directory paths
                    drive = path.toString();
                    
                }
            String username = System.getProperty("user.name");
            File f = new File(drive + "details.txt");
            if (f.exists()){
                Login log = new Login();
                log.setVisible(true);
                
            }else{
                SignUp1 log = new SignUp1();
                log.setVisible(true);
            }
        }
        catch(Exception e){
            
        }
       
    }
}
