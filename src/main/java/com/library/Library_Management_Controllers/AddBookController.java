package com.library.Library_Management_Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.Library_Management.AddBooksMain;
import com.library.Library_Management.BooksDetails;
import com.library.service.AddBookService;

@Controller
public class AddBookController {

	@Autowired
	AddBookService add;

	/*@RequestMapping(value = "/Addbookconfirmation", method = RequestMethod.GET)
	public String getName() {
		return "Addbookconfirmation";
	}*/

	@RequestMapping(value = "/AddBook", method = RequestMethod.GET)
	public String getName1() {
		return "AddBook";
	}

	@RequestMapping(value = "/AddBook", method = RequestMethod.POST)
	public void add_book(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		String name = (request.getParameter("Name")).toString();
		System.out.println("Name:" + name);
		String author = (request.getParameter("Author")).toString();
		int Price = Integer.parseInt(request.getParameter("price"));
		String Book_edition = (request.getParameter("Book_edition")).toString();
		int pages = Integer.parseInt(request.getParameter("pages"));
		int ISBN = Integer.parseInt(request.getParameter("ISBN"));
		String language = (request.getParameter("language")).toString();
		int no = Integer.parseInt(request.getParameter("noofcopies"));

		String Date_of_publish_get = (request.getParameter("date_of_publish")).toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date Date_of_publish = sdf.parse(Date_of_publish_get);

		BooksDetails obj = new BooksDetails();

		obj.setBook_name(name);
		obj.setBook_author(author);
		obj.setBook_price(Price);
		obj.setBook_edition(Book_edition);
		obj.setPages(pages);
		obj.setISBN(ISBN);
		obj.setLanguage(language);
		obj.setDate_of_publish(Date_of_publish);
		obj.setNo(no);

		add.addbook(obj);

		/*
		 * Boolean avalibility= true;
		 * 
		 * AddBooksMain addbook= new AddBooksMain(); addbook.add_db(name, author,
		 * Price,Book_edition,pages,language,Date_of_publish,avalibility,ISBN);
  		 * ModelAndView mv= new ModelAndView();
		 * mv.setViewName("Addbookconfirmation.jsp"); mv.addObject("book_name",name);
		 * mv.addObject("book_author", author); mv.addObject("book_price", Price);
		 * mv.addObject("Book_edition", Book_edition); mv.addObject("pages", pages);
		 * mv.addObject("language", language); mv.addObject("Date_of_publish",
		 * Date_of_publish);
		 * 
		 */
		// return mv;
	}

}
