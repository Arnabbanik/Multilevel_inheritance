public class Black extends Hair {
 public int c;
 public Black(int a, int b, int c) {
	super(a,b);
	this.c=c;
}
public int mul() {
	 int b = super.sum();
	 System.out.println(b);
	 return b*c; 
 }
}
