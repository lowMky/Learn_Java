public class GuessGame{
	void setGame(int size){
		Player [] players;
		players = new Player[size];
		
		for(int i=0;i<size;++i){
			players[i]=new Player(i+1);
		}
		
		int ans=(int)(Math.random()*10);

		boolean [] flags;
		flags = new boolean[size];
		
		for(int i=0;i<size;++i)
			flags[i]=false;
		while(true){
			boolean tag=false;
			for(int i=0;i<size;++i){
				if(players[i].guess()==ans){
					flags[i]=true;tag=true;
				}
			}
			if(tag){
				System.out.println("Game over!");
				for(int i=0;i<size;++i)
					System.out.println("player "+players[i].id+" has got it right? "+flags[i]);
				break;
			}
			else System.out.println("Game continue!");
		}
	}
}