import java.io.*;
class multiply_matrix
{
public static void main(String args[])throws Exception
{
BufferedReader br;
InputStreamReader isr;
isr=new InputStreamReader(System.in);
br=new BufferedReader(isr);
int a[][]=new int [5][5];
int b[][]=new int [5][5];
System.out.print("enter number of rows in the first matrix  ");
int row1=Integer.parseInt(br.readLine());
System.out.print("enter number of cols in the first matrix  ");
int col1=Integer.parseInt(br.readLine());
System.out.print("enter number of rows in the second matrix  ");
int row2=Integer.parseInt(br.readLine());
System.out.print("enter number of cols in the second matrix  ");
int col2=Integer.parseInt(br.readLine());
if(col1==row2)
{
System.out.println("enter elements in the first array");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("enter elements in the second array");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
b[i][j]=Integer.parseInt(br.readLine());
}
int c[][]=new int [5][5];
int sum;
for(int i=0;i<row2;i++)
{
for(int j=0;j<col1;j++)
{
sum=0;
for(int p=0;p<row2;p++)
sum=sum+a[i][p]*b[p][j];
c[i][j]=sum;
}
}
System.out.println("multiplication is");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
System.out.print(c[i][j]);
System.out.println();
}
}
else
System.out.println("matrix multiplication is not possible");
}
}

