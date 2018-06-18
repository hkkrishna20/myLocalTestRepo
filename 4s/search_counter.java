import java.io.*;

class search_counter
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter the size of the list::  ");
		int size=Integer.parseInt(br.readLine());
		int ls_freq=0,bs_freq=0;
		int list[]=new int[size];
		boolean found=false;
		System.out.println("Enter the Elements:-");
		for(int i=0;i<size;i++)
		{ 
			list[i]=Integer.parseInt(br.readLine());
		}
		System.out.print("Enter the search Key:: ");
		int key=Integer.parseInt(br.readLine());
		
		//LINEAR Searching
		
		for(int i=0;i<size;i++)
		{ if(list[i]==key){ found=true;break;}
		  else ls_freq++;
		}
		if(found==true)System.out.println("LS_FREQ="+ls_freq);
		
		//Sorting
		
		











	}

}