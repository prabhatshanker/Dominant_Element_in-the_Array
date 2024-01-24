import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T-->0){
            int n = scn.nextInt();
            int a[] = new int[n];
            int f1[] = new int[1001];
            for(int i=0; i<n; i++){
                a[i]=scn.nextInt();
            }
            for(int i=0; i<n; i++){
                f1[a[i]]++;
            }
            java.util.Arrays.sort(f1);
            if(f1[1000]!=f1[999])
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
