/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vigenere_chiper;

/**
 *
 * @author sudhakar
 */
public class Decryption {
    String de(String word,String key)
    { 
        word=word.toUpperCase();
        key=key.toUpperCase();
        int size=word.length();
        
        String wr[]=new String[size];
        String ke[]=new String[size];
        
        for(int i=0;i<size;i++)
        { 
        
            char a=word.charAt(i);
            wr[i]=""+a;
        
        }
       // System.out.println(Arrays.toString(wr));
        int ksize=key.length();
        int to=size-ksize;
        
        String com="";
        for(int i=0;i<to;i++)
        { 
        char a=key.charAt(i);
            com=com+a;
        
        }
        key=key+com;
        //System.out.println(key);
        int kk=key.length();
        
        for(int i=0;i<kk;i++)
        { 
        
            char a=key.charAt(i);
            ke[i]=""+a;
        }
       // System.out.println(Arrays.toString(ke));
        
        String ans="";
        int total[]=new int[size];
        
        for(int i=0;i<size;i++)
        { 
        
            char a=wr[i].charAt(0);
            char b=ke[i].charAt(0);
            
            int ar=(char)a;
            int br=(char)b;
            
            //System.out.println(ar+""+br);
            int t=(ar-br)%26;
            
            if(t<0)
            { 
            
                t=t+26;
                total[i]=t;
                //System.out.println(t);
            
            }
            else
            {  
               total[i]=t;
               //System.out.println((char)t);
            }
        }
            
          // System.out.println(Arrays.toString(total)); 
         
         String check="abcdefghijklmnopqrstuvwxyz";  
           
         for(int i=0;i<size;i++)
         { 
             int cb=total[i];
             
             for(int j=0;j<check.length();j++)
             { 
             
                 if(cb==j)
                 {
                  ans=ans+check.charAt(cb);
                 }
             }
             
         
         }
           
         //System.out.println(ans); 
         
         ans=ans.toUpperCase();
      return ans;
    }
}
