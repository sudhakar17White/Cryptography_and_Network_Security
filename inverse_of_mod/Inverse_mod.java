import java.util.*;
class Inverse_mod
{
    static int modInverse(int inv,int mod)
    {

        int val=0;
        int i=1;    

           while(val!=1)
           {
            int mul=inv*i;
            int re=mul/mod;
            int to=(mul-(re*mod));
            if(to==1)
            {
              val=1;
              return i;
              
            }
            i++;
            
          }

        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the Inverse value:");
        int inv=s.nextInt();
        
        System.out.println("Enter the Mod Value:");
        int mod=s.nextInt();
        
        System.out.println("Inverse oF Mod Value :"+modInverse(inv,mod));


    }


}