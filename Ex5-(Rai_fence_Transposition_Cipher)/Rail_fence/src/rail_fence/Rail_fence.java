/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rail_fence;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Rail_fence {

    static void info()
    { 
        
		System.out.println("***********************************************");
		System.out.println("course code:IT1681");
		System.out.println("course Name:Crptography and network security Laboratory");
		System.out.println("Ex-5:Implementaion of Rail fence Transposition Cipher");
		System.out.println("Name:SUDHAKAR.D");
		System.out.println("RollNumber:20UIT019");
		System.out.println("************************************************");
		
    }
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        info();
        
       
        
        int ch;
        do{
        
            
        ch=s.nextInt();
       
        
        
        switch(ch)
        {
            case 1:
                s.nextLine();
                String text=s.nextLine();
                
                if(text.matches(".*\\d.*"))
                { 
            
                    System.out.println("Input must be a Word");
                    
                }
                else
                {
                int depth=s.nextInt();
                if(depth<0)
                { 
                    System.out.println("Sorry,Input must be a positive number");
                    break;
                }
                else
                {
                    Encryption en=new Encryption();
                    en.enc(text,depth);
                    break;
                }
               }
                
            case 2:
                s.nextLine();
                String text1=s.nextLine();
                
                if(text1.matches(".*\\d.*"))
                { 
            
                    System.out.println("Input must be a Word");
                    
                }
                else
                {
                int depth=s.nextInt();
                if(depth<0)
                { 
                    System.out.println("Sorry,Input must be a positive number");
                    break;
                }
                else
                {
                    Decryption de=new Decryption();
                    de.dec(text1,depth);
                    break;
                }
               }
                break;
            case 3:
                System.out.println("Bye");
                System.exit(0);
        }
        
        
        }while(ch>0&&ch<=3);
    
    }
    
}
