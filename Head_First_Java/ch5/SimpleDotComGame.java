public class SimpleDotComGame{
	public static void main(String [] args){
		
		SimpleDotCom dotcom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		
		int startofdotcom=(int)(Math.random()*5);
		
		int [] locations={startofdotcom,startofdotcom+1,startofdotcom+2};
		
		dotcom.setLocationCells(locations);
		
		int numOfGuess=0;
		String result;
		while(true){
			++numOfGuess;
			String guess = helper.getUserInput("enter a number");
			result=dotcom.checkYourself(String.valueOf(guess));
			if(result == "kill"){
				System.out.println(numOfGuess + " in total");
				break;
			}
		}
	}
}