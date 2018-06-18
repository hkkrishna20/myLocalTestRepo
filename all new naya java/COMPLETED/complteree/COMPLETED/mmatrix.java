/*                      problem for finding multiplication of two matrices    */
/*  NAME: M.HARIKRISHNA*/
/* ROLLNO: 10906011*/
/* COMPUTER SCIENCE AND ENGINEERING*/


import java.io.*;
class mmatrix
{
	public static void main(String args[])throws Exception
		{
			BufferedReader r;
			InputStreamReader sr;
			sr=new InputStreamReader(System.in);
			r=new BufferedReader(sr);
			int ad[][]=new int [5][5];
			int bd[][]=new int [5][5];
			System.out.print("enter number of rows of first matrix  ");
			int r1=Integer.parseInt(r.readLine());
			System.out.print("enter number of columns of first matrix  ");
			int c1=Integer.parseInt(r.readLine());
			System.out.print("enter number of rows of  second matrix  ");
			int r2=Integer.parseInt(r.readLine());
			System.out.print("enter number of columns  of second matrix  ");
			int c2=Integer.parseInt(r.readLine());
if(c1==r2)
{
		System.out.println("enter elements in the first matrix  ");
		for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				ad[i][j]=Integer.parseInt(r.readLine());
			}
		System.out.println("enter elements in the second matrix ");
		for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				bd[i][j]=Integer.parseInt(r.readLine());
			}
			int cd[][]=new int [5][5];
			for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
						{
						for(int p=0;p<c1;p++)
						cd[i][j]=cd[i][j]+(ad[i][p]*bd[p][j]);
						}
				}
			System.out.println("multiplication of two given matrices is");
			for(int i=0;i<r2;i++)
				{
						for(int j=0;j<c1;j++)
						System.out.print("\t\t"+cd[i][j]);
						System.out.println(                       );
				}
	}
	else
	System.out.println("matrix multiplication is not possible for given matrices ");
}
}
/*                  OUTPUT */
/* 
enter number of rows of first matrix  3
enter number of columns of first matrix  2
enter number of rows of  second matrix  2
enter number of columns  of second matrix  3
enter elements in the first matrix
1
2
3
4
5
6
enter elements in the second matrix
3
2
1
6
5
4
multiplication of two given matrices is
                15              12
                33              26
*/

