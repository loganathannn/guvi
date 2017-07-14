import java.util.Scanner
public class Countacn {
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter");
	String a=sc.nextLine();
	
	int c=0,d=0,e=0;
	char [] b=a.toCharArray();
	for (int i=0;i<a.length();i++)
	{
		if(Character.isAlphabetic(b[i]))
		{
			c++;
			//System.out.println("c="+ c);
		}
	
	else if(Character.isDigit(b[i]))
	{
		d++;
		//System.out.println("d="+d);
	}
	else 
	{
		e++;
	}}
	System.out.println("alphabets="+c +" "+ "numbers is="+d +" "+"alphanumber is="+e);
}


}

