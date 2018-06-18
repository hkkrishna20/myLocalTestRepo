import java.io.*;
import java.lang.*;

/*
107604				djac
Construction of Binary Search Tree using Linked lIst
*/
class node
{
 int data;
 node lc;
 node rc;
}



class bst
 { public static void main(String args[])throws IOException
  {

     InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
	operation_bst opp=new operation_bst();
    System.out.print("Enter the ROOT Node value: ");
    int rooot=Integer.parseInt(br.readLine());
	opp.construct(rooot);
    
	int choice=1;
		while(choice !=0)
		{
			System.out.print("\nEnter Ur Choice:-\n\t1.INSERT \n\t2.PREORDER\n\t3.INORDER\n\t4.POSTORDER\n\t0.EXIT\n=>");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			 case 1:
			 
			 /*System.out.print("Enter the KEY element: ");
			 int key=Integer.parseInt(br.readLine());
			 
			 System.out.print("Enter the ITEM to be Inserted to KEY("+key+"): ");
			 int item=Integer.parseInt(br.readLine());
			 opp.insert(key,item);*/
			 break;
			 case 2:
			 	System.out.print("\n\nPREORDER:");
				opp.preorder();
			 break;
			 case 3:
			 	System.out.print("\n\nINORDER:");
    				opp.inorder();
			 break;
			 case 4:
			 	System.out.print("\n\nPOSTORDER:");
    				opp.postorder();
			 break;
			 case 0:
			 	System.out.println("Thank you....");
			 default:
			 break;
			 
			
			
			
			
			}
		    System.out.println("\n");
		}
		
}
  }

class operation_bst
{
 

 InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
 node root=new node();

void preorder()
{ preorder(root);}
void inorder()
{ inorder(root);}
void postorder()
{ postorder(root);}

void preorder(node ptr)
{
if(ptr!=null)
{ System.out.print("  "+ptr.data);
  preorder(ptr.lc);
  preorder(ptr.rc);
}
}


void inorder(node ptr)
{
if(ptr!=null)
{ inorder(ptr.lc);
System.out.print("  "+ptr.data);
  
  inorder(ptr.rc);
}
}

void postorder(node ptr)
{
if(ptr!=null)
{ 
  postorder(ptr.lc);
  postorder(ptr.rc);
  System.out.print("  "+ptr.data);
}
}

void construct(int item)throws IOException
{
 construct(root,item);
}




void construct(node ptr,int item) throws IOException
{
 String s;
 int val;
if(ptr!=null)
{
	ptr.data=item;
	System.out.print("is "+item+" has LEFT-Tree:(y/n): ");
	s=br.readLine();
 	if(s.charAt(0)=='y')
    	{while(true)
    	{
        	System.out.print("Enter LEFT-Child of "+item+" value: ");
		val=Integer.parseInt(br.readLine());
		if(val<ptr.data)
		{node temp=new node();
		ptr.lc=temp;
		construct(ptr.lc,val);
		break;
		}
	   	else{System.out.println("\nLeft child doesn't contain Heigher value(>"+ptr.data+")\n Re enter");}
	}
	}
	
 	else 
	{ 
	  ptr.lc=null;
 	  construct(ptr.lc,0);
	}
	
	System.out.print("is "+item+" has RIGHT-Tree:(y/n): ");
	s=br.readLine();
	if(s.charAt(0)=='y')
	{while(true)
   	{
		System.out.print("Enter RIGHT-Child of "+item+" value: ");
		val=Integer.parseInt(br.readLine());
		if(val>ptr.data)
		{node temp=new node();
		ptr.rc=temp;
		construct(ptr.rc,val);
		break;
		}
	   	else{System.out.println("\nRight child doesn't contain Lesser value\n Re enter:");}

	}
	}
	else
	{
	  ptr.rc=null;
	  construct(ptr.rc,0);
	}
}

}
}

























