/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
class Encryption {
    Scanner s=new Scanner(System.in);
        void enc(String word,int row,int col)
        {
            int key[][]=new int[row][col];
            int check=0;
            for(int i=0;i<row;i++)
            {   for(int j=0;j<col;j++)
                {
                    key[i][j]=s.nextInt();
                    if(key[i][j]<0)
                    {
                        check++;
                    }
                }
            }
            
            if(check==0)
            {
            
            int len=word.length()/2;
            int wr[][]=new int[len][row];
            
            String abc="abcdefghijklmnopqrstuvwxyz";
            int ans[]=new int[word.length()];
                int r=0;
                for(int l=0;l<word.length();l++)
                {
                for(int k=0;k<abc.length();k++)
                    {   
                          
                        if(word.charAt(l)==abc.charAt(k))
                            {
                               ans[r]=k;
                               r++;
                               break;
                            }
                    }
                    
                }
//               for(int i=0;i<ans.length;i++)
//               {
//                System.out.print(ans[i]+" ");
//               }
               // 2 * 2 matrix
               int k=0;
               for(int i=0;i<len;i++)
               {
                   for(int j=0;j<row;j++)
                   {
                        wr[i][j]=ans[k];
                        k++;
                   }
                   
               }
              
               int val=0;
               int ch=0;
               int ch2=0;
               int inc=0;
               int a[]=new int[word.length()];
               for(int i=0;i<len;i++)
               {
                   for(int ro=0;ro<row;ro++)
                   {
                       for(int co=0;co<col;co++)
                       {
                           int mul=key[ro][co];
                           val=val+(mul*wr[ch][ch2]);
                           ch2++;
                           //System.out.println(val%26);
                       }
                       ch2=0;
                       a[inc]=val%26;
                       inc++;
                       val=0;
                   }
                  
                   ch++;
               
               
               }
               //System.out.println(Arrays.toString(a));
               
               String enc="";
               for(int i=0;i<a.length;i++)
               {
                  enc=enc+abc.charAt(a[i]);
               }
               System.out.println(enc.toUpperCase());   
            }
            else
            {
            
                System.out.println("Sorry Input Must be positive Number");
            
            }
        }
}
 