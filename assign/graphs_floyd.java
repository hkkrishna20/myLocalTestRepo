import java.io.*;
import java.util.*;
import java.lang.*;

class graphs_floyd
{
	public int N,MAX=1000;
	public int mat[][]=new int[15][15];
	public int Q[][]=new int[15][15];
	public String path[][]=new String[15][15];
	
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		graphs_floyd gf=new graphs_floyd();
		
		System.out.print("Enter number of vertices::");
		gf.N=Integer.parseInt(br.readLine());
		
		String s;
		for(int i=1;i<=gf.N;i++)
		{	s=br.readLine();
			StringTokenizer st=new StringTokenizer(s,",. \t");
			for(int j=1;j<=gf.N;j++)
			gf.mat[i][j]=Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=gf.N;i++)
		{	for(int j=1;j<=gf.N;j++)
			System.out.print(gf.mat[i][j]+"  ");
			System.out.println();
		}
		gf.floyd();
		System.out.println("Shortest Patths Matrix");
		for(int i=1;i<=gf.N;i++)
		{	for(int j=1;j<=gf.N;j++)
			System.out.print(gf.Q[i][j]+"  ");
			System.out.println();
		}
		
		
		System.out.println("Shortest Patths");
		for(int i=1;i<=gf.N;i++)
		{	for(int j=1;j<=gf.N;j++)
			System.out.print(gf.path[i][j]+"\t");
			System.out.println();
		}
	
	}
	void floyd()
	{
		String p1,p2;
		for(int i=1;i<=N;i++)
		{  for(int j=1;j<=N;j++)
			if(mat[i][j]==0)
			{
				Q[i][j]=MAX;
				path[i][j]=null;
			}
			else
			{
				Q[i][j]=mat[i][j];
				path[i][j]=combine(i,j);
			}
		}
		for(int k=1;k<=N;k++)
		{	for(int i=1;i<=N;i++)
			{	for(int j=1;j<=N;j++)
				{	Q[i][j]=min(Q[i][j],Q[i][k]+Q[k][j]);
					if(Q[i][k]+Q[k][j]<Q[i][j])
					{
					p1=path[i][k];
					p2=path[k][j];
					path[i][j]=combine(p1,p2);
					}
				}
			}
		}
	}
	int min(int x,int y)
	{
		if(x>y)
		return(y);
		else return(x);
	}
	
	String combine(String x,String y)
	{
		if(x.charAt(x.length()-2)==y.charAt(0))
		{
		  x[x.length()-1]=y.charAt(1);
		  for(int i=2;i<=y.length()-2;i++)
		  { x[x.length()-1]=y.charAt(i);
		  }
		}
		else
		{
		  x[x.length()-1]='-';
		  for(int i=0;i<=y.length()-2;i++)
		  {   x[x.length()-1]=y.charAt(i);
		  }
		}
		return(x);
	}
	
	String combine(int x,int y)
	{
		String s=x+"-"+y;
		return(s);
	}
}



















