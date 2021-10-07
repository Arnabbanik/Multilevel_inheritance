public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a=4;
		  int b=3;
		  int c=4;
		  int d=5;
				  
          White w = new White( a, b,c,d);
          Hair h = new Hair();
          Hair h1 = new Black();
          Hair h2 = new White();
          Blonde bd = new Hair();
          Blonde bd1 = new Black();
          
          System.out.println("A:"+bd.sum1(a, b));
          System.out.println("B:"+bd1.sum1(a, b));
          h.poly();
          h1.poly();
          h2.poly();
          System.out.println(w.sum(4.02f, 2.02f));
          System.out.println(w.sqaure());
	}

}
