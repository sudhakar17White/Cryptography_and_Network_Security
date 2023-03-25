/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rail_fence;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Encryption {
 
    void enc(String text,int depth)
    { 
        
        Scanner s=new Scanner(System.in);
        //String text=s.nextLine();
        int col=text.length();
        int a=0;
        String fis="",sec=""+text.charAt(0);
     
            for(int i=1;i<col;i++)
            { 
            
                if(i%depth==0)
                { 
                    
                    sec=sec+text.charAt(i);
            
                }
                else
                { 
                    fis=fis+text.charAt(i);
                
                }
                
            
            
        
        }
        
        String ans=(sec+fis).toUpperCase();
        
        System.out.println(ans);
            
        
    }
    
    
    
}
