package com.acertainbookstore.business;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.acertainbookstore.utils.BookStoreException;

public class Test {

	public static void main(String[] args) throws BookStoreException {
		// TODO Auto-generated method stub
		
		CertainBookStore bookStore = new CertainBookStore();
		StockBook book1 = new ImmutableStockBook(1, "Title 1", "Author 1", 500, 10, 232, 1, 3, true);
		StockBook book2 = new ImmutableStockBook(2, "Title 2", "Author 2", 400, 2, 0, 2, 1, false);
		StockBook book3 = new ImmutableStockBook(3, "Title 3", "Author 3", 300, 2, 0, 2, 2, false);
		StockBook book4 = new ImmutableStockBook(4, "Title 3", "Author 3", 300, 2, 2221, 5, 20, false);
		
		Set<StockBook> stockbooks = new HashSet<StockBook>();
		stockbooks.add(book1);
		stockbooks.add(book2);
		stockbooks.add(book3);
		stockbooks.add(book4);

		bookStore.addBooks(stockbooks);
		
		BookRating rating1 = new BookRating(1, 1);
		BookRating rating12 = new BookRating(1, 4);
//		BookRating rating12 = new BookRating(4, 4);
//		BookRating rating3 = new BookRating(2, 4);
//		BookRating rating32 = new BookRating(3, 4);
		
		Set<BookRating> bookRating = new HashSet<BookRating>();
		Set<BookRating> bookRating2 = new HashSet<BookRating>();
		Set<BookRating> bookRating3 = new HashSet<BookRating>();
		bookRating.add(rating1);
//		bookRating.add(bookrating3);
		
		bookRating2.add(rating12);
//		bookRating2.add(rating2);
//		bookRating2.add(bookrating3);
		
		bookRating3.add(rating1);
//		bookRating3.add(bookrating2);
//		bookRating3.add(bookrating32);
//		bookRating.add(bookrating3);
//		
		System.out.print("map:" + bookStore.bookMap);
		bookStore.rateBooks(bookRating);
		bookStore.rateBooks(bookRating2);
		bookStore.rateBooks(bookRating3);
		bookStore.getTopRatedBooks(4);
		
		bookStore.getBooksInDemand();

	}

}
