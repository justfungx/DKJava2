package tw.org.iii.java2;

public class java04 {

	public static void main(String[] args) {
		
		byte a = 127 ;  // 127 ,128 , 129 => int
		a++;  //-128
		/*
		 * ??�為超出BYTE  128範�?��?以�?��?��??-128
		 * 
		 * ?��?��??+不是?��學�?��??
		 */ 
		a += 4 ;
		long b =12 ;
		// a = b  A??��?�無法帶?��?��B  ??�為B�???�為LONG
		System.out.println(a);
		//int c = 12 ;  ?���? 12
		int c = 012 ;  //  ?��??�頭 ?�� 8?�制  ??以解�??��  8 *1 +2  =10
		System.out.println(c);

		int d = 0X12; // �?�??�� 0X = 16 *1+2
		System.out.println(d);
		
	}

}
