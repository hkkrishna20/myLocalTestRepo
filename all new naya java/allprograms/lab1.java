class lab1
{
public static void main(String[] args)
{
String s=args[0];
int i,j,l,f=0;
l=s.length();

for(i=0,j=l-1;i<l/2;i++,j--)
{
      if(s.charAt(i)!=s.charAt(j))
      {
        System.out.print(s+ " Not a palindrome");  
	f=1;
	break;
	}
}
if(f==0)
      System.out.print(s+"  is palindrome");  



}
}







/*
for(exp1;exp2;exp3)
{
statements;


}
*/