package constructorandfile;

public class ThisKeyword {
	
	 int a;
	 void setValue(int a)
  {
	this.a=a;
  }
  void show()
  {
	System.out.println(a);
  }
	public static void main(String[] args) {
	 ThisKeyword obj = new ThisKeyword();
	     obj.setValue(10);
		 obj.show();
	}

}
