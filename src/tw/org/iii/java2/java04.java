package tw.org.iii.java2;

public class java04 {

	public static void main(String[] args) {
		
		byte a = 127 ;  // 127 ,128 , 129 => int
		a++;  //-128
		/*
		 * ?? ç‚ºè¶…å‡ºBYTE  128ç¯„å?æ?ä»¥æ?ƒè?Šæ??-128
		 * 
		 * ?™é?Šç??+ä¸æ˜¯?•¸å­¸å? æ??
		 */ 
		a += 4 ;
		long b =12 ;
		// a = b  A??„å?¼ç„¡æ³•å¸¶?…¥?–¼B  ?? ç‚ºBå®???Šç‚ºLONG
		System.out.println(a);
		//int c = 12 ;  ?›´è­? 12
		int c = 012 ;  //  ?›¶??‹é ­ ?‚º 8?²åˆ¶  ??ä»¥è§£è®??‚º  8 *1 +2  =10
		System.out.println(c);

		int d = 0X12; // è§?è®??‚º 0X = 16 *1+2
		System.out.println(d);
		
	}

}
