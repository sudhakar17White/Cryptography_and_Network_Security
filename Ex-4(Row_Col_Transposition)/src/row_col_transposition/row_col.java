/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package row_col_transposition;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class row_col {
  
    public static void cc() {
	
		
		System.out.println("***********************************************");
		System.out.println("course code:IT1681");
		System.out.println("course Name:Crptography and network security Laboratory");
		System.out.println("Ex-4:Implementaion of Row-columnar transposition cipher");
		System.out.println("Name:SUDHAKAR.D");
		System.out.println("RollNumber:20UIT019");
		System.out.println("Date:08.02.2023");
		System.out.println("************************************************");
		
		
	}
    
    public static void main(String[] args) throws IOException {
        cc();
        Scanner s=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        int ch;
        String text,key;
        do
        {
        
        ch=s.nextInt();
        
        switch(ch)
        {
            case 1:
                text=dis.readLine();                                                 
               
                
                int k=0,w=0;
                for(int i=0;i<text.length();i++)
                 { 
                     char a=text.charAt(i);
                     if(Character.isLetter(a))
                     {    
                       k++;
                     }
                 
                 }
                 if(text.length()==k)
                 {
                     
                 key = dis.readLine();
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
                    Encryption enc=new Encryption();
                    String ans=enc.en(text,key);
                    System.out.println(ans);
                    break;
                    }
                    else
                    { 
                     
                     
                     System.out.println("Sorry,input must be word");    
                     
                    }
                 
                }
                 else
                 { 
                 
                     System.out.println("Sorry,input must be word");    
                     
                 
                 }
                 break;
            case 2:
                 text=dis.readLine();    
                  
                int ki=0,wi=0;
                for(int i=0;i<text.length();i++)
                 { 
                     char a=text.charAt(i);
                     if(Character.isLetter(a))
                     {    
                       ki++;
                     }
                 
                 }
                 if(text.length()==ki)
                 {
                     
                 key = dis.readLine();
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
        
                String ans=dec.de(text.toLowerCase(), key);
        
                System.out.println(ans.toLowerCase());
                break;
                 }
                 else
                 { 
                 
                       System.out.println("sorry,input must be word");
                 
                 }
                }
                 else
                 { 
                 
                 System.out.println("Sorry,input must be word");    
                     
                 
                 }
                 break;
            case 3:
                System.out.println("Bye");
                System.exit(0);
                
                
        }
        
        
        
        }while(ch>0&&ch<=3);
    }
    
}
//RAGBCRTYOAYPPH
//cryptography
//network