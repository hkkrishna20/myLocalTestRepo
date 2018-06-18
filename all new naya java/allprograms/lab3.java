import java.io.*;
class lab3
{
public static void main(String args[]) throws IOException {


BufferedReader d
          = new BufferedReader(new InputStreamReader(in));
 
//DataInputStream in=new //DataInputStream(System.in);

int a[][],b[][],c[][];
int i,j,t,k,r1,c1,r2,c2;
r1=Integer.parseInt(args[0]);
c1=Integer.parseInt(args[1]);
r2=Integer.parseInt(args[2]);
c2=Integer.parseInt(args[3]);
a=new int[r1][c1];
b=new int[r2][c2];
c=new int[r1][c2];

if(c1==r2)
{
System.out.println("Input a Matrix: ");

for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.println("Input a number: ");
a[i][j]=
Integer.parseInt(d.readLine());
}
}

System.out.println("Input b Matrix: ");

for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.println("Input a number: ");
b[i][j]=Integer.parseInt(d.readLine());

}
}

System.out.println("a Matrix: ");

for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print("  " +a[i][j]);
}
System.out.println("  ");
}

for(i=0;i<r1;i++)
{
	for(j=0;j<c1;j++)
        {
		c[i][j]=0;
		for(k=0;k<c2;k++)
		c[i][j]+=a[i][k]*b[k][j];
	
  	}
}


System.out.println("c Matrix: ");

for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
System.out.print("  " +c[i][j]);
}
System.out.println("  ");
}

}
else
System.out.println("Invalid rows and columns  ");

}
}







/*
for(exp1;exp2;exp3)
{
statements;


}
*/