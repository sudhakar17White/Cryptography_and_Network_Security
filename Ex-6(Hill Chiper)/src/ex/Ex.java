/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author sudhakar
 */
public class Ex {

      public static void cc() {
	
		
		System.out.println("***********************************************");
		System.out.println("course code:IT1681");
		System.out.println("course Name:Crptography and network security Laboratory");
		System.out.println("Ex-6:Implementaion of Hill Chipher");
		System.out.println("Name:SUDHAKAR.D");
		System.out.println("RollNumber:20UIT019");
		System.out.println("************************************************");
		
		
	}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        cc();
        int ch;
        do
        {
            ch=s.nextInt();
        switch(ch){           
            case 1:
                s.nextLine();
                String word = s.nextLine();
                if(word.matches(".*\\d.*"))
                { 
            
                    System.out.println("Input must be a Word");
                    break;
                }
                else
                {
                int row = s.nextInt();
                int col = s.nextInt();
                if (row == col) {
                    Encryption eny = new Encryption();
                    eny.enc(word, row, col);
                    break;
                    
                } else {
                    if(row<0||col<0)
                    {
                        System.out.println("Sorry Input must be positive number");
                    }
                    else
                    {
                        System.out.println("Sorry,Matrix is not a square matrix");
                    }
                }
               }
                break;
            case 3:
                System.out.println("Bye");
                System.exit(0);
                break;
        }
            
        }while(ch>=1&&ch<=3);
    }

}
