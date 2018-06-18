class lab2
{
public static void main(String[] args)
{
String s[];
int i,j,l,f=0;
String temp;
s=new String[args.length];
for(i=0;i<args.length;i++)
s[i]=new String(args[i]);


l=s.length;

for(i=0;i<l;i++)
{
	for(j=i+1;j<l;j++)
        {
        	if(s[i].compareTo(s[j])>=0)
	{
	temp=s[i];
	s[i]=s[j];
	s[j]=temp;
	}
}
}

for(i=0;i<s.length;i++)
System.out.println("    " + s[i]);


}
}







/*
for(exp1;exp2;exp3)
{
statements;


}
*/