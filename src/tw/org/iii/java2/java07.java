package tw.org.iii.java2;

public class java07 {

	public static void main(String[] args) {
		byte a = 10 , b = 8;
		//byte c = a + b;   byte int short ?��互為??��?��?�除??��?�數  ?��?��?�� int 存放
		// (byte short int) long 
		int c = a + b ;
		//int d = a + b  => 18
		double e = 10 ,f = 3;
		double d = a + b ;  //強�?�別 & 弱�?�別差異
		double g = e / f ;
		System.out.println(g);
	}

}
