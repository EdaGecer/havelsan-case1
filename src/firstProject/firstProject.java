package firstProject;

import java.util.Scanner;

public class firstProject {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, j, space = 1;
        int t =0;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j<= n; j++)
        {
        for (i = 1; i<= space; i++)
        {
        System.out.print(" ");
        }
        space--;
        t = 2 * j - 1;
        for (i = 1; i <= t; i++)
        {
        System.out.print("*");
        }
        System.out.println("");
        }
        for(int b=0;b<3;b++)
        {
        	for(int x=0;x<t;x++)
        	{
        		if(x<3 || x>=t-3)
                System.out.print("*");
        		else
                System.out.print(" ");	
        			
        	}
            System.out.println("");
        }
        sc.close();
    }
}
