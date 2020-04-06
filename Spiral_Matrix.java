import java.util.Scanner;
public class Spiral_Matrix {
	public static void main(String args[])
	{
		int row,column,m,n,i,j,k = 0,l = 0;
		boolean key = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		row = scan.nextInt();
		System.out.println("Enter the no of columns ");
		column = scan.nextInt();
		int a[][] = new int [row][column];
		for(i = 0;i<row;i++)
			for(j = 0;j<column;j++)
				a[i][j] = scan.nextInt();
		m = row;
		n = column;
		while(k<m && l<n)
		{
			for(i = 0;i<n;i++)
			{
				System.out.print(a[k][i]+" ");
			}
			k++;
			for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
		}

	}

}
}
