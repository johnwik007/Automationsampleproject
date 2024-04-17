package flowcontrolstatements;

public class WhileLoop {

	public static void main(String[] args) {   
	int a=1;                                         // check the condition & execute the code
	while(a<=5)                                      //   while (condition)    //condition must be Boolean & mandatory.
	 {                                               //   {
		System.out.println("subol");                         //body;                  
	      a++;                                       
	                                                  //   }                   
	 }   
	
	 int b=0;
	 do                              //   In do-while first body will be executed then only condition will be checked
	 {                               //   execute the code & then checks the condition.
		 System.out.println(b);
	 	 b++;
	 } while(b<5);
	 
	  
	}  
		
     }

	
