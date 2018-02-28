import java.util.*;
import java.util.Scanner;
import java.lang.*;
class Test33
{
	public static void main(String ar[])
	{
		Vector v=new Vector();
		int ch;
		String s;
		do
		{
			System.out.println("List size= "+v.size());
			System.out.println("**********Menu********");
			System.out.println("1. Add\n 2. Delete\n 3. Search\n 4. Display\n 5. Exit");
			System.out.println("Enter your choice");
			Scanner in=new Scanner(System.in);
			ch=in.nextInt();
			switch(ch)
			{
				case 1:
				//Scanner in=new Scanner(System.in);
				System.out.println("Enter the name");
				s=in.nextLine();
				//v.Add(s);
				break;
				
				case 2:
				//Scanner in=new Scanner(System.in);
				System.out.println("Delete this");
				s=in.nextLine();
				if(v.remove(s))
				System.out.println("Name is deleted");
				else
				System.out.println("Name is not found");
				break;
				
				case 3:
				//Scanner in=new Scanner(System.in);
				System.out.println("Name to be search");
				s=in.nextLine();
				if(v.contains(s))
				System.out.println("Name is found");
				else
				System.out.println("Name is not found");
				break;

				case 4:
				if(v.isEmpty())
				System.out.println("List is empty");
				else
				{
				System.out.println("Names are");
				for(int i=0;i<v.size();i++)
				System.out.println(v.get(i));
				}
				break;
			
				case 5:
				break;
				default:
				System.out.println("Invalid choice");
			}
		}while(ch!=5);
	}
}			
