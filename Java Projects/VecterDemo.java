import java.util.*;
class VecterDemo
{
	public static void main(String args[])throws Exception
	{
		Vector list=new Vector();
		int length=args.length;
		for(int i=0;i<length;i++)
		{
			list.addElement(args[i]);
			int size=list.size();
			String listArray[]=new String[size];
			list.copyInto(listArray);
			System.out.println("List of languages");
			for(int j=0;j<length;j++)
			{
				System.out.println(listArray[j]);
			}
		}
	}
}