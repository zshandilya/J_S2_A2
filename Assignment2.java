import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int m,n,flag;
		Scanner s=new Scanner(System.in);
		char ans;
		
		do
		{
			System.out.println("***** GENERATE LIST OF PRIME NUMBERS BETWEEN ANY TWO NUMBERS(say m & n) *****");
			System.out.print("Enter m: ");
			m=s.nextInt();
			System.out.print("Enter n: ");
			n=s.nextInt();
		
			if(m>1)
			{
				System.out.println("Prime Numbers between " +m+" and " +n+" : ");
				for (int i=m;i<=n;i++)
				{
					flag=0;
					for(int j=2;j<i;j++)
					{
						if(i%j==0)
							flag=1;
					}
					if(flag==0)
						System.out.print(i + "   ");
				}
			} 
			else
				System.out.println("1 is neither prime nor composite. m has to be greater than 1.");
			
			System.out.print("\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
			
		} while(ans=='y');
		
		s.close();	//Closing the scanner
	}

}
