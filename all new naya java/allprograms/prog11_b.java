class infix
{
		char target[],stack[] ;
		char s[],t[];
		int top ;


infix( )
{
	top = -1 ;
target=new char[80];
stack=new char[80];
t=new char[80];
s=new char[80];
}

void setexpr ( char str[] )
{
	s = str;

}

void  push ( char c )
{
	if ( top == 80 )
		System.out.println("Stack is full");
	else
	{
		top++ ;
		stack[top] = c ;
	}
}

char pop( )
{
	if ( top == -1 )
	{
		System.out.println("Stack is empty");
		return (char)-1;
	}
	else
	{
		char item = stack[top] ;
		top-- ;
		return item ;
	}
}

void convert( )
{
int i=0,j=0;
	while ( s[i]!='\0')
	{
		if ( Character.isLetter(s[i]))
		{
			while (Character.isLetter(s[i]))
			{
				t[j++]=s[i++];
			}
		}
		if ( s[i] == '(' )
		{
			push (s[i]) ;
			i++ ;
		}
		char opr ;
		if ( s[i] == '*' || s[i] == '+' || s[i] == '/' || s[i] == '%' || s[i] == '-' || s[i] == '$' )
		{
			if ( top != -1 )
			{
				opr = pop( ) ;
				while ( priority ( opr ) >= priority ( s[i] ) )
				{
					t[j] = opr ;
					j++ ;
					opr = pop( ) ;
				}
				push ( opr ) ;
				push ( s[i] ) ;
			}
			else
				push (s[i]) ;
			i++ ;
		}

		if ( s[i] == ')' )
		{
			opr = pop( ) ;
			while ( ( opr ) != '(' )
			{
				t[j] = opr ;
				j++ ;
				opr =  pop( ) ;
			}
			i++ ;
		}
	}

	while ( top != -1 )
	{
		char opr = pop( ) ;
		t[j] = opr ;
		j++ ;
	}

	t[j] = '\0';
}

int priority ( char c )
{
	if ( c == '$' )
		return 3 ;
	if ( c == '*' || c == '/' || c == '%' )
		return 2 ;
	else
	{
		if ( c == '+' || c == '-' )
			return 1 ;
		else
			return 0 ;
	}
}

void show( )
{
for(int i=0;t[i]!='\0';i++)
System.out.print(t[i]);
 
}
}

public class prog11_b
{

public static void main(String args[])
{
String s=args[0];

int len=s.length();
char expr[]=new char[len+1];
s.getChars(0,len,expr,0);
expr[len]='\0';

infix q =new infix();
q.setexpr(expr) ;
q.convert() ;

System.out.println("The postfix expression is:");
q.show( ) ;
}
}