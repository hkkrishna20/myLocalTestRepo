import java.io.*;
import java.util.*;
import java.lang.*;

class graphs_matrix
{
	public int N=0;
	public int mat[][]=new int[15][15];
	
	public static void main(String args[])throws IOException
	{
// 		int n=0;
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
// 		System.out.print("enter no. of vertices to be created::");
// 		n=Integer.parseInt(br.readLine());
// 		int ver[]=new int[15];		//max of 15 vertices can be inserted
		graphs_matrix gm=new graphs_matrix();
		int choice=1;
		while(choice!=0)
		{
			System.out.print("\nSELECT:-\n1.Insert\n2.display mat\n3.DFS\n0.exit\nchoose::");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
			System.out.print("\nDo u want to insert Vertex V"+(gm.N+1)+" (y/n)::");
			String s=br.readLine();
			char ch=s.charAt(0);
			if(ch=='y' || ch=='Y')
			{	if(gm.N==0)gm.N++;
				else{
				System.out.println("enter the adjacent vertices of V"+(gm.N+1)+"in a *row and in *sorted order* (Ex.:1,3,5,7)");
				s=br.readLine();
				
				gm.insert_ug(s);
				}
			}
			break;
			case 2:
			System.out.println();
			for(int i=1;i<=gm.N;i++)
			{	for(int j=1;j<=gm.N;j++)
				{System.out.print(gm.mat[i][j]+"\t");
				}System.out.println();
			}
			break;
			case 3:
			gm.dfs();
			break;
		}
		}	
	}
	/** Inserting a vertex */
	void insert_ug(String s)
	{
		int Vx;
		N=N+1;
		Vx=N;
		
		StringTokenizer st=new StringTokenizer(s," ,.\t");
				int cou=st.countTokens();
				
				int []x=new int[cou+1];
				for(int i=1;i<cou+1;i++)
					x[i]=Integer.parseInt(st.nextToken());
		
		int l=cou;
		int j;
		
		for(int i=1;i<=Vx;i++)
		{
			mat[Vx][i]=0;
			mat[i][Vx]=0;
		}
		
		System.out.println("\nVertex V"+Vx+" has been created");
		
		
		for(int i=1;i<=l;i++)
		{
			j=x[i];
			if(j>=N)System.out.println("Vertex V"+j+"  doesnot exits");
			else
			{
				mat[Vx][j]=1;
				mat[j][Vx]=1;
			}
		}
	}
	
	
	void dfs()
	{
		int u=1,i;
		boolean flag=false;
		int visit[]=new int[N];
		int vcount=0;
		stacks stk=new stacks();
		stk.push(u);
		while(!stk.isempty())
		{
			u=stk.pop();
			System.out.println("u==="+u);
			for(i=0;i<=vcount;i++)
			{if(visit[i]==u){flag=true;break;}}
			if(flag==false)
			{
				vcount++;
				visit[vcount]=u;
				
				for(i=1;i<=N;i++)
				{if(mat[u][i]==1)
				  stk.push(i);
				}	
			}
		}
		System.out.println("IN DFS");
		for(i=0;i<N;i++)
		System.out.print("  "+visit[i]);
	}
	
	
	
	
}






class stacks
{
int MAX=35;
int top;
int list[]=new int[MAX];
	
void push(int x)
{
	if(top>=MAX)
	{
	System.out.println("STACK FULL");
	return;
	}
	else
	{
		top+=1;
		list[top]=x;	
	}
return;
}


int pop()
{
	if(top==0)
	{
	System.out.println("STACK EMPTY");
	return(0);
	}
	else{
	int x=list[top];
	top-=1;
	return(x);
	}
}
boolean isempty()
{
if(top==0)
return(true);
else
return(false);
}

}



















