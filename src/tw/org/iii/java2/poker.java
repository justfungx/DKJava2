package tw.org.iii.java2;

public class poker {

	public static void main(String[] args) {
		// æ´—ç??
		int[] poker = new int [52];//52å¼µç??
		for (int i = 0; i<poker.length ; i++){
		int temp ;
		
		//æª¢æŸ¥æ©Ÿåˆ¶
		boolean Replay;
		do{
			temp = (int)(Math.random()*52); //?š¨æ©Ÿç™¼?‡º52å¼µç?Œä¸¦æª¢æŸ¥??è??
			Replay =false; //?™¼??Œå‡º?¾??è?‡ã?‚å?å?žåˆ°??æ–°?™¼???
			for(int j = 0 ;j<i ; i++){
				if (temp == poker[j]){
					Replay = true ;
					break;
				}
			}
		}while(Replay);
		poker[i] = temp;
		
		}
		//?™¼???
		int [][] player = new int [4][13];
		for(int i =0; i<poker.length; i++){
		player[i%4][i/4]=poker[i];	
		}
	}

}
