import java.io.*;

class node
{
   int data;
   int freq=1;
   node lc,rc;
}


class histo
{
  public static void main(String args[])throws IOException
  {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	operation opp=new operation();
		int key;
		System.out.println("Enter the  element and '-1' to terminate:- ");
		do{	 
			 key=Integer.parseInt(br.readLine());
			 if(key!=-1)
			 {opp.insert(key);}
		}while(key!=-1);
		System.out.println("\n\nINORDER:\nITEM\tFREQ");
		opp.inorder();
			 System.out.println("\n");
		
		System.out.println("\n\nPREORDER:\nITEM\tFREQ");
		opp.preorder();
			 System.out.println("\n");
}
}

class operation
{
 

 InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
 node root=new node();
void insert(int item)throws IOException
{
 insert(root,item);
}

void inorder()
{ inorder(root);}
void preorder()
{ preorder(root);}


void insert(node ptr,int item) throws IOException
{
node ptr1=null;
boolean occur=false;
if(ptr==null)root.data=item;
else{
while(ptr!=null && occur!=true)
{
	if(ptr.data==item)
	{ ptr.freq++;
	  occur=true;}
	
	else if(ptr.data>item)
	{
	ptr1=ptr;
	ptr=ptr.lc;
	}
 	else if (ptr.data<item)
	{ 
	
 	 ptr1=ptr;
	ptr=ptr.rc;
	}
	
}
if(ptr==null && ptr1!=null)
{
  node child=new node();
  child.data=item;
  if(ptr1.data<item)ptr1.rc=child;
  else if(ptr1.data>item) ptr1.lc=child;
}
}

}

void inorder(node ptr)
{
if(ptr!=null)
{ inorder(ptr.lc);
System.out.println(ptr.data+"\t"+ptr.freq);
  
  inorder(ptr.rc);
}
}



void preorder(node ptr)
{
if(ptr!=null)
{ System.out.println(ptr.data+"\t"+ptr.freq);
   preorder(ptr.lc);

  
  preorder(ptr.rc);
}
}



}