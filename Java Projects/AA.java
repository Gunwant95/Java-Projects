import java.util.*;
class AA
{
	public static void main(String args[])
	{
		String s1;
		int v=0,d=0,c=0,t=0;
		char ch;
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();

		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);

			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				v++;
			}
			else
			if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
			{
				d++;
			}
			//else if(ch== )
			//{
				//b++;
			//}

			else if(ch=='\t')
			{
				t++;
			}

			else
			{
				c++;
			}
		}
System.out.println("Vowels="+v);
System.out.println("Digits="+d);
//System.out.println("Space="+b);
System.out.println("Constant="+c);
System.out.println("Tabs="+t);
}
}