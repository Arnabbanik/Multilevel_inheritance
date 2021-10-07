public class White extends Black {
 public int d;
 public White(int a,int b, int c,int d) {
	 super( a, b, c);
	 this.d = d;
 }
 public int sqaure() {
	 int f = super.mul();
	 System.out.println(f);
	 return f*d;	 
 }
}
