import java.io.*;


class tree_heap
{
	public int MAX=150;
	public int list[]=new int[MAX];
	public int N;
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		tree_heap heap=new tree_heap();
		
		int choice=1;
		while(choice!=0)
		{
			System.out.print("SELECT:-\n\t1.Insert\n\t2.Delete\n\t3.show\n\t0.exit\nCHOOSE::");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
			System.out.print("Enter the element to be inserted::");
			int in=Integer.parseInt(br.readLine());
			heap.insert(in);
			heap.show();
			break;
			case 2:
			heap.delete();
			heap.show();
			break;
			case 3:
			heap.show();
			break;
			case 0:
			break;
			default:
			System.out.println("\n enter the right choice");
			break;
			}
		}
	}

void insert(int item)
{
	if(N>=MAX)
	{	System.out.println("InSertion Not possible");
		return;
	}
	else
	{	
		N++;
		list[N]=item;
		int i=N,p;
		p=i/2;
		while(p>0 && list[p]<list[i])
		{
		 int temp=list[i];
		 list[i]=list[p];
		 list[p]=temp;
		i=p;
		p/=2;
		}
	return;
	}
	
	
}
	
void delete()
{	
	
}
	
void show()
{
	for(int i=1;i<=N;i++)
	System.out.print(list[i]+"  ");
	
}











}