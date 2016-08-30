package tw.org.iii.java2;

public class java12 {

	public static void main(String[] args) {
		//String a= "A" ;
		int a =10 ;
		final int b = 8 ; //??? ?? å…¥final ?¥è¨´B?‚ºå¸¸æ•¸??
		switch (a) { //?œ¨switch??‹åˆ¥ä¸­åª?¥??—byte?short?int?char??„å?—å?ƒå?ç‚º
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break; //??? break ?˜¯?¯ä»¥ç?ç•¥??„ã?ä?†ç?‹å?æ?ƒç¹¼çºŒåŸ·è¡Œç›´?ˆ°ä¸‹ä??‹å‡º?¾??„break
		case 100:
			// case b :  ?œ¨CASEä¸? ?ª?ƒ½?¥??—å¸¸?•¸ ä¸æ¥??—è?Šæ•¸??
			//??? case b+5 :
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}

}
