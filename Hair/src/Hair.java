public class Hair implements Blonde {
  public int a;
  public int b;
  public Hair(int a, int b) {
	// TODO Auto-generated constructor stub
	  this.a=a;
	  this.b=b;
  }
  public void poly() {
		 System.out.println("I'm Mamata(Rima)");
	 }
  public int sum() {
	  return a+b;
  }
  public Hair() {}
  @Override
  public int sum1(int a, int b) {
	  // TODO Auto-generated method stub
	  return a/b;	
  }
}
