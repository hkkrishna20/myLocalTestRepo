public class sam9
{

public static void print(String[] s)
{
int i;

System.out.print("Array  :");
for(i=0;i<s.length;i++)
System.out.print("   " + s[i]);
}

public static void main(String[] args)
{

String[] s={"Sunday","Monday","Tuesday","Wednesday"};
print(s);

}

}

//char s[][]="sunday",";