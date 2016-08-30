package tw.org.iii.java2;

public class java19 {

	public static void main(String[] args) {
		int p1,p2,p3,p4,p5,p6;
		p1=p2=p3=p4=p5=p6=0;
		for( int i= 0; i <= 100 ; i++){
		int point =(int)(Math.random()*6+1);
		switch (point){
		case 1: p1++ ;break;
		case 2: p2++ ;break;
		case 3: p3++ ;break;
		case 4: p4++ ;break;
		case 5: p5++ ;break;
		case 6: p6++ ;break;
		}
		}
	System.out.println("1é»žå‡º?¾"+ p1 +"æ¬?");
	System.out.println("2é»žå‡º?¾"+ p2 +"æ¬?");
	System.out.println("3é»žå‡º?¾"+ p3 +"æ¬?");
	System.out.println("4é»žå‡º?¾"+ p4 +"æ¬?");
	System.out.println("5é»žå‡º?¾"+ p5 +"æ¬?");
	System.out.println("6é»žå‡º?¾"+ p6 +"æ¬?");
	}

}
