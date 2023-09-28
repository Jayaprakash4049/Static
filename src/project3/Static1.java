package project3;

public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       numbers a=new numbers();
       numbers a1=new numbers();
      
       
       a.add();
       a1.mul();
     
       
	}

}
 class numbers{
	static int a =0;
	int b=2;

	numbers(){
		this.a++;
		System.out.println(a);
		// System.out.println(b);
	}

 public void add() {
	 System.out.println("add function");
	a=a+1;
	 a=b+2;
	 System.out.println(a);
 }
 public void mul() {
	 System.out.println("Mul Function");
	a=a+1;
	 a=b*3;
	 System.out.println(a);
 }
 }