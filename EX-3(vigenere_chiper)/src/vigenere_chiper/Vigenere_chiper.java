/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vigenere_chiper;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Vigenere_chiper {

    /**
     * @param args the command line arguments
     */
    public static void cc() {
	
		
		System.out.println("***********************************************");
		System.out.println("course code:IT1681");
		System.out.println("course Name:Crptography and network security Laboratory");
		System.out.println("Ex-3:Implementaion of Vigenere cipher");
		System.out.println("Name:SUDHAKAR.D");
		System.out.println("RollNumber:20UIT019");
		System.out.println("Date:03.02.2023");
		System.out.println("************************************************");
		
		
	}
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        DataInputStream input=new DataInputStream(System.in);
        int ch;
        
        
        String key = null,word;
        cc();
        do
        {
        ch=s.nextInt();
        switch(ch)
        {
           
            case 1:
                 int k=0,w=0;
                
                 word = input.readLine();

                 //String key="";
                 for(int i=0;i<word.length();i++)
                 { 
                     char a=word.charAt(i);
                     if(Character.isLetter(a))
                     {    
                       k++;
                     }
                 
                 }
                 if(word.length()==k)
                 {
                     
                 key = input.readLine();
                 for(int j=0;j<key.length();j++)
                 { 
                     char a=key.charAt(j);
                     if(Character.isLetter(a))
                     { 
                     
                        w++;
                     
                     }
                 
                 }
                    if(w==key.length())
                    {   
                    Encryption enc = new Encryption();
                    String ans=enc.en(word, key);
                    System.out.println(ans);
                    break;
                    }
                    else
                    { 
                    
                        System.out.println("sorry,input must be word");
                    
                    }
                 }
                
                 else
                 { 
                 
                     System.out.println("sorry,input must be word");
                 }
                 break;
                
                
            case 2:
                    int ki=0,wi=0;
                
                    word = input.readLine();

                   
                    
                  for(int i=0;i<word.length();i++)
                 { 
                     char a=word.charAt(i);
                     if(Character.isLetter(a))
                     {    
                       ki++;
                     }
                 
                 }
                  
                 if(word.length()==ki)
                 {
                 key = input.readLine();
                 for(int j=0;j<key.length();j++)
                 { 
                     char a=key.charAt(j);
                     if(Character.isLetter(a))
                     { 
                     
                        wi++;
                     
                     }
                 
                 }
                 if(wi==key.length())
                 { 
                    Decryption dec=new Decryption();
                    String an=dec.de(word.toLowerCase(), key);
                    System.out.println(an.toLowerCase());
                    break;
                 }
                 else
                 { 
                 
                     System.out.println("sorry,input must be word");
                 
                 }
                }
                 else
                 { 
                 
                  System.out.println("sorry,input must be word");
                 
                 }
                 break;
                 
            case 3:
                    System.out.println("bye");
                    System.exit(0);
                    break;
                    
           }
        
        }while(ch>0&&ch<=2);
    
     
        
        
        
    }

}
//PVRLHFQEEIDM
//cryptography
//network
