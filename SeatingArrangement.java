
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class SeatingArrangement 
{
    public static void main(String args[] ) throws Exception 
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());              
        
        for(int i=0; i<t; i++)
        {
            int n = Integer.parseInt(br.readLine());

            int k = n%12;
            int j = n/12;
            int ans=0;

            if(k==0)
            {
                ans = 12*(j-1)+1;
            }
            else
            {
                ans = 12*j + (13-k);
            }
            
            String a = " ";

            if(n%6==1 || n%6==0)
            {
                a = "WS";
            }
            else if(n%6==2 || n%6==5)
            {
                a = "MS";
            }
            else if(n%6==3 || n%6==4)
            {
                a = "AS";
            }

            System.out.println(ans+" "+a);
       }
    }
}
