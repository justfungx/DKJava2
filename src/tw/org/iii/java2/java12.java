package tw.org.iii.java2;

public class java12 {

	public static void main(String[] args) {
		//String a= "A" ;
		int a =10 ;
		final int b = 8 ; //??? ??�入final ?��訴B?��常數??
		switch (a) { //?��switch??�別中只?��??�byte?�short?�int?�char??��?��?��?�為
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break; //??? break ?��?��以�?�略??��?��?��?��?��?�繼續執行直?��下�??�出?��??�break
		case 100:
			// case b :  ?��CASE�? ?��?��?��??�常?�� 不接??��?�數??
			//??? case b+5 :
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}

	}

}
