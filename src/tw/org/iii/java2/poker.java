package tw.org.iii.java2;

public class poker {

	public static void main(String[] args) {
		// 洗�??
		int[] poker = new int [52];//52張�??
		for (int i = 0; i<poker.length ; i++){
		int temp ;
		
		//檢查機制
		boolean Replay;
		do{
			temp = (int)(Math.random()*52); //?��機發?��52張�?�並檢查??��??
			Replay =false; //?��??�出?��??��?��?��?��?�到??�新?��???
			for(int j = 0 ;j<i ; i++){
				if (temp == poker[j]){
					Replay = true ;
					break;
				}
			}
		}while(Replay);
		poker[i] = temp;
		
		}
		//?��???
		int [][] player = new int [4][13];
		for(int i =0; i<poker.length; i++){
		player[i%4][i/4]=poker[i];	
		}
	}

}
