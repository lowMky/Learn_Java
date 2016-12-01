public class Player{
	int id;
	Player(int _id){
		id=_id;
	}
	int guess(){
		int num=(int)(Math.random()*10);
		System.out.println("Player "+id+" hava guessed "+num);
		return num;
	}
}