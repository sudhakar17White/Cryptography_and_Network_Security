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
public class Decryption {
    
    void dec(String text,int depth)
    {   
        Scanner s=new Scanner(System.in);
        
        
        int size=text.length()/2;
        for(int k=0;k<1;k++)
        {
        
        if(text.matches("[0-9]"))
        { 
            
            System.out.println("Sorry,Input must be a positive number");
            break;
        
        }
        else if(depth<0)
        { 
            System.out.println("Sorry,Input must be a positive number");
            break;
        }
        else
        {
        
        
        
        String fi=text.substring(0, size);
       // System.out.println(fi);
        String se=text.substring(size, text.length());
        //System.out.println(se);
        
        String ans="";
        for(int i=0;i<size;i++)
        { 
            
            ans=ans+fi.charAt(i);
            ans=ans+se.charAt(i);
        
        }
        System.out.println(ans.toLowerCase());
    
        }
       }
    }
    
}
