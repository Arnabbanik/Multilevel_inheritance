public class Black extends Hair implements Blonde{
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

	@Override
	public void poly() {
		System.out.println("I'm Arnab");	
	}
	public Black() {}
	@Override
	public int sum1(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
