class stack
{

		int arr[] ;
		int top ;

stack( )
{
	top = -1 ;
arr=new int[10];
}

void push ( int item )
{
	if ( top == 9)
	{
	System.out.println("Stack is full");
		return ;
	}
	top++ ;
	arr[top] = item ;
}

int pop( )
{
	if ( top == -1 )
	{
		System.out.println("Stack is empty");
		return -1 ;
	}
	int data = arr[top] ;
	top-- ;
	return data ;
}
}
class prog11_a
{
public static void main(String args[])
{
	stack s=new stack() ;

	s.push ( 11 ) ;
	s.push ( 23 ) ;
	s.push ( -8 ) ;
	s.push ( 16 ) ;
	s.push ( 27 ) ;
	s.push ( 14 ) ;
	s.push ( 20 ) ;
	s.push ( 39 ) ;
	s.push ( 2 ) ;
	s.push ( 15 ) ;
	s.push ( 7 ) ;

	int i = s.pop( ) ;
System.out.println("Item popped: "+i);

	i = s.pop( ) ;
System.out.println("Item popped: "+i);

	i = s.pop() ;
System.out.println("Item popped: "+i);

	i = s.pop( ) ;
System.out.println("Item popped: "+i);

	i = s.pop( ) ;
System.out.println("Item popped: "+i);
}
}