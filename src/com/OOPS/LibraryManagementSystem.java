package com.OOPS;
import java.util.ArrayList;
import java.util.List;

class Book{
		private String title;
		private String author;
		private boolean isBorrowed;
		
		Book(String title, String author){
			this.title = title;
			this.author = author;
			this.isBorrowed = false;
		}
		
		public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isBorrowed() {
	        return isBorrowed;
	    }
	    
	    
	    public void borrowbook() {
	    	if(!isBorrowed) {
	    		isBorrowed = true;
	    	    System.out.println(title + " has been borrowed.");
	        } else {
	            System.out.println(title + " is already borrowed.");
	        }
	    }
	    
	    public void returnBook() {
	        if (isBorrowed) {
	            isBorrowed = false;
	            System.out.println(title + " has been returned.");
	        } else {
	            System.out.println(title + " was not borrowed.");
	        }
	    }
	}

	
	 class Member {
	    private String name;
	    private int memberId;

	     Member(String name, int memberId) {
	        this.name = name;
	        this.memberId = memberId;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getMemberId() {
	        return memberId;
	    }
	}
	 
	 class Library{
		 private List <Book> books;
		 private List <Member> members;
	 
	 
	 Library (){
		 books = new ArrayList<>();
		 members =  new ArrayList<>();		
	 }
	 
	 public void addBook (Book book) {
		 books.add(book);
	        System.out.println(book.getTitle() + " has been added to the library.");
	 }
	 
	 public void addMember(Member member) {
	        members.add(member);
	        System.out.println(member.getName() + " has been added as a library member.");
	    }
	 public void borrowBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                book.borrowbook();
	                return;
	            }
	        }
	        System.out.println("Book not found in the library.");
	    }

	    public void returnBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                book.returnBook();
	                return;
	            }
	        }
	        System.out.println("Book not found in the library.");
	    }

	    public void searchBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                System.out.println("Found book: " + book.getTitle() + " by " + book.getAuthor());
	                return;
	            }
	        }
	        System.out.println("Book not found in the library.");
	    }

	    public void listOverdueBooks() {
	        // For simplicity, this method will just list all borrowed books.
	        // In a real system, you would check the borrow date and compare it with the current date.
	        System.out.println("Overdue Books:");
	        for (Book book : books) {
	            if (book.isBorrowed()) {
	                System.out.println(book.getTitle() + " by " + book.getAuthor());
	            }
	        }
	    }
	 } 
public class LibraryManagementSystem {

	public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook("The Catcher in the Rye");
        library.returnBook("The Catcher in the Rye");
        library.searchBook("To Kill a Mockingbird");
        library.listOverdueBooks();
    }
}
