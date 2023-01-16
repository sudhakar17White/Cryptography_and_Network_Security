import java.util.*;
class CaeserChiper 
{
    String alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String en="";
    String dec="";
    int val;
    
    void Encrption(String word)
    {
        
       int size=word.length();
	   
	    for(int i=0;i<size;i++)
	    { 
	        
	        char a=word.charAt(i);
	        
	        for(int j=0;j<=25;j++)
	        { 
	            
	            char b=alp.charAt(j);
	            
	            int comp=Character.compare(a,b);
	            
	            if(comp==0)
	            { 
	                
	               val=j+3;
	               val=val%26;
	               
	               char c=alp.charAt(val); 
	               
	               en=en+c; 
	                
	            }
	            
	            
	        }
	        
	        
	    }
	    System.out.println("Encryption Word:"+en);
	
    }
    
    void Decryption(String word)
    { 
         
	    int size=word.length();
	    for(int i=0;i<size;i++)
	    { 
	        
	        char a=word.charAt(i);
	        
	        for(int j=0;j<=25;j++)
	        { 
	            
	            char b=alp.charAt(j);
	            
	            int comp=Character.compare(a,b);
	            
	            if(comp==0)
	            { 
	                
	               val=j-3;
	               val=val%26;
	               
	               char c=alp.charAt(val); 
	               
	               dec=dec+c; 
	                
	            }
	            
	            
	        }
	        
	        
	    }
	   System.out.println("Decryption :"+dec);
	    
        
        
        
        
    }
    
    
}
class ShiftCipher
{ 
    
    String alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String en="";
    String dec="";
    int val;
    
    void Encryption(String word,int key)
    { 
        
         
       int size=word.length();
	   
	    for(int i=0;i<size;i++)
	    { 
	        
	        char a=word.charAt(i);
	        
	        for(int j=0;j<=25;j++)
	        { 
	            
	            char b=alp.charAt(j);
	            
	            int comp=Character.compare(a,b);
	            
	            if(comp==0)
	            { 
	                
	               val=j+key;
	               val=val%26;
	               
	               char c=alp.charAt(val); 
	               
	               en=en+c; 
	                
	            }
	            
	            
	        }
	        
	        
	    }
	    System.out.println("Encryption Word:"+en);
	
        
        
        
        
    }
    void Decryption(String word,int key)
    { 
         int size=word.length();
	    for(int i=0;i<size;i++)
	    { 
	        
	        char a=word.charAt(i);
	        
	        for(int j=0;j<=25;j++)
	        { 
	            
	            char b=alp.charAt(j);
	            
	            int comp=Character.compare(a,b);
	            
	            if(comp==0)
	            { 
	                
	               val=j-key;
	               val=val%26;
	               
	               char c=alp.charAt(val); 
	               
	               dec=dec+c; 
	                
	            }
	            
	            
	        }
	        
	        
	    }
	   System.out.println("Decryption :"+dec);
	    
        
        
        
        
        
    }
    
    
    
    
    
}

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
	    CaeserChiper cc=new CaeserChiper();
	    ShiftCipher sc=new ShiftCipher();
	   
	    int ch;
	    do
	    {
	        System.out.println("Enter the Msg:");
	        String word=s.next();
	        System.out.println("Main Menu");
	        System.out.println("1.<---caeser cipher--->\n2.<---Shift cipher");
	       
	        ch=s.nextInt();
	        
	        switch(ch)
	        { 
	            
	            case 1:
	                     System.out.println("Menu:\n1.Encrption\n2.Decryption\n3.Back to Main Menu");
	                     System.out.println("Enter the choice:");
	                     int cs=s.nextInt();
	                     if(cs==1)
	                     {
	                        cc.Encrption(word);
	                        break;
	                        
	                     }
	                     else if(cs==2)
	                     { 
	                        cc.Decryption(word);
	                        break;
	                         
	                     }
	                   
	                   break;
	                    
	            
	            case 2:
	                     System.out.println("Enter key Value:");
	                     int key=s.nextInt();
	                     System.out.println("Menu:\n1.Encrption\n2.Decryption\n3.Back to Main Menu");
	                     System.out.println("Enter the choice:");
	                     int csr=s.nextInt();
	                     
	                     if(csr==1)
	                     { 
	                         
	                         sc.Encryption(word,key);
	                         break;
	                       
	                     }
	                     else if(csr==2)
	                     { 
	                         
	                         sc.Decryption(word,key);
	                         break;
	                         
	                     }
	                
	                break;
	                    
	        }
	        
	        
	    }while(ch>=1&&ch<3);
	    
	}
}

