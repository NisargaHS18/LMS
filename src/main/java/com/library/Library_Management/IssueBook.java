package com.library.Library_Management;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="issue_book")
public class IssueBook{
	
	@Id
	private int user_id;
	private int Book_id;
	private Date date_of_issue;
	
	public IssueBook() {

	}

	public IssueBook(int user_id, int book_id, Date date_of_issue) {
		super();
		this.user_id = user_id;
		Book_id = book_id;
		this.date_of_issue = date_of_issue;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public Date getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(Date date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	@Override
	public String toString() {
		return "IssueBook [user_id=" + user_id + ", Book_id=" + Book_id + ", date_of_issue=" + date_of_issue + "]";
	}
	
	
	
	
}



