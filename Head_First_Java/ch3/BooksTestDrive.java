class Books{
	String title;
	String author;
}

class BooksTestDrive{
	public static void main(String [] args){
		Books [] mybooks = new Books[3];
		for(int i=0;i<3;++i)
			mybooks[i]=new Books();
		int x=0;
		mybooks[0].title="The Grapes of Java";
		mybooks[1].title="The Java Gatsby";
		mybooks[2].title="The Java Cookbook";
		mybooks[0].author="bob";
		mybooks[1].author="sue";
		mybooks[2].author="ian";
		
		while(x<3){
			System.out.println(mybooks[x].title+" by "+mybooks[x].author);
			++x;
		}
	}
}