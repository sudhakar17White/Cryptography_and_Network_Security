/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package row_col_transposition;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Encryption {
    
    String en(String text,String key)
    { 
        Scanner s=new Scanner(System.in);
        
        int t=key.length();
    
        String mat[]=new String[t];
        int m[]=new int[t];
        int m1[]=new int[t];
        
        for(int i=0;i<t;i++)
        { 
             char a=key.charAt(i);
             mat[i]=""+a;
             m[i]=(char)a;
        
        }
        
        
        int tot=(text.length()/t);
        if(tot==1)
        { 
            tot=tot+1;
        
        }
        
       
        //key Gen
        
        String mata[][]=new String[tot][t];
        
        int co=0;
        int ab=97;
        for(int i=0;i<tot;i++)
        { 
        
            
            for(int j=0;j<t;j++)
            { 
                
                if(co==text.length())
                { 
                
                    mata[i][j]=""+(char)ab;
                    ab=ab+1;
                    
                }
                else
                {
                    char a=text.charAt(co);
                    //System.out.println(a);
                    mata[i][j]=""+a;
                    co=co+1;
                    
                    //System.out.println(co);
                }
            
            }
            
        
        }
        System.out.println(Arrays.toString(mat));
        for(int i=0;i<tot;i++)
        { 
        
            System.out.print("[");
            for(int j=0;j<t;j++)
            { 
            
                System.out.print(mata[i][j]+"  ");
                
            
            }
            System.out.print("]");
            System.out.println("\n");
        
        }
        
        
        
        //System.out.println(Arrays.toString(m));
        for(int i=0;i<t;i++)
        { 
             int g=m[i];
             m1[i]=g;
        
        }
        
       
        Arrays.sort(m1);
        //System.out.println(Arrays.toString(m1));
        
        int po=0;
       
        int index[]=new int[t];
        String ans="";
        for(int i=0;i<t;i++)
        { 
            int fr=m1[i];
            //System.out.println(fr);
            for(int j=0;j<t;j++)
            {    
                //System.out.println(m[j]);
                if(fr==m[j])
                { 
                    index[i]=j;
                    //System.out.println(j);
                    for(int k=0;k<tot;k++)
                    { 
                    
                        ans=ans+mata[k][j];
                        //System.out.println(mata[k][j]);
                    
                    }
                    
                }
            }
        }
        
        
        System.out.println(Arrays.toString(index));
        //System.out.println(Arrays.toString(m));
        ans=ans.toUpperCase();
        
        return ans;
    
    }
    
}
