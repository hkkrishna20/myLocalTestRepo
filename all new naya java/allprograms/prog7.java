
import java.util.StringTokenizer;

class prog7
{
 	public static void main(String args[])
 	{
	StringTokenizer st=new 	StringTokenizer(args[0],",");
int s=0;
	while(st.hasMoreTokens())
{

String val=st.nextToken();
s+=Integer.parseInt(val);
System.out.println(val);
}
System.out.println("Sum: "+s);
}
}									


