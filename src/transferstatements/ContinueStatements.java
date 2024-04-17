package transferstatements;

public class ContinueStatements {

	public static void main(String[] args) {
		
	//	Continue: skip the current iteration and it is continue the rest of the iterations normally	
		
		for (int i=0;i<10;i++)
		{
			if (i==5)
		    continue;
		   System.out.println(i);
		}

	}

}
