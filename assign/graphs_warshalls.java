import java.io.*;
import java.util.*;

class graphs_warshalls
{
	public int N;
	public int mat[][]=new int[15][15];
	public int P[][]=new int[15][15];
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		graphs_warshalls gw=new graphs_warshalls();
		
		System.out.print("Enter number of vertices::");
		gw.N=Integer.parseInt(br.readLine());
		
		String s;
		for(int i=1;i<=gw.N;i++)
		{	s=br.readLine();
			StringTokenizer st=new StringTokenizer(s,",. \t");
			for(int j=1;j<=gw.N;j++)
			gw.mat[i][j]=Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=gw.N;i++)
		{	for(int j=1;j<=gw.N;j++)
			System.out.print(gw.mat[i][j]+"  ");
			System.out.println();
		}
		gw.warshall();
		System.out.println("Path Matrix");
		for(int i=1;i<=gw.N;i++)
		{	for(int j=1;j<=gw.N;j++)
			System.out.print(gw.P[i][j]+"  ");
			System.out.println();
		}
	
	
	}
	void warshall()
	{
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			P[i][j]=mat[i][j];
		}
		for(int k=1;k<=N;k++)
		for(int i=1;i<=N;i++)
		for(int j=1;j<=N;j++)
		P[i][j]=or(P[i][j],and(P[i][k],P[k][j]));
	}
	int or(int x,int y)
	{
		if(x==1 || y==1)
		return(1);
		else return(0);
	}
	
	int and(int x,int y)
	{
		if(x==1 && y==1)
		return(1);
		else return(0);
	}
	
}



















