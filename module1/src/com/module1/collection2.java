package com.module1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Author
{
	private String firstName;
	private String lastName;
	
	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}

class Book
{
	private String title;
	private Author author;
	
	public Book(String title, Author author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}

class BookImplementation {
	public List<String> firstNameOfAuthors(Author...authors)
	{
		List<String> list=null;
		List<Author> allAuthors=Arrays.asList(authors);
		list=allAuthors.stream().map(author->author.getFirstName()).collect(Collectors.toList());
		return list;
	}
	
	public List<String> titlesOf(Book...books)
	{
		List<Book> allBooks=Arrays.asList(books);
		List<String> list=allBooks.stream().map(book->book.getTitle()).collect(Collectors.toList());
		return list;
	}
	
	
}

public class collection2 {
	public static void main(String[] args) {
		Author jb=new Author("J", "B");
		Author bg=new Author("B","G");
		Author bab=new Author("BA","B");
		
		Book java1=new Book("Effective Java", jb);
		Book java2=new Book("Java 123",bg);
		Book java3=new Book("Java dummies",bab);
		
		BookImplementation bi=new BookImplementation();
		List<String> names=bi.firstNameOfAuthors(jb,bg,bab);
		System.out.println(names);

		List<String> titles=bi.titlesOf(java1,java2,java3);
		System.out.println(titles);
	
	}
}
