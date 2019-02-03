
class Books {
	String title;
	String author;
	

}

class BooksTestDrive{
	public static void main (String[] args) {
		
		Books[] MyBooks = new Books[3];
		int x = 0;
		MyBooks [0] = new Books();
		MyBooks [1] = new Books();
		MyBooks [2] = new Books();
		MyBooks [0].title = "The Grapes of Java";
		MyBooks [1].title = "The Java Gatsby";
		MyBooks [2].title = "The Java Cookbook";
		MyBooks [0].author = "Bob";
		MyBooks [1].author = "Sue";
		MyBooks [2].author = "Ian";
		
		while (x < 3) {
			System.out.print(MyBooks[x].title);
			System.out.print(" by ");
			System.out.println(MyBooks[x].author);
			x = x + 1;
		}
	}
}
