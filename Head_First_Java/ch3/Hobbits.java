class Hobbits{
	String name;
	
	public static void main(String [] args){
		Hobbits [] h=new Hobbits[3];
		for(int i=0;i<3;++i){
			h[i] = new Hobbits();
			h[i].name="bilbo";
			if(i==1)
				h[i].name="froda";
			if(i==2)
				h[i].name="sam";
			System.out.println(h[i].name + "is a good name!");
		}
	}
}