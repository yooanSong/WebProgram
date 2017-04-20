package com.notice.entity;

public class Notice {
	private int no;
	private String content;
	private String name;
	private String writeday;
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notice(int no, String content, String name, String writeday) {
		super();
		this.no = no;
		this.content = content;
		this.name = name;
		this.writeday = writeday;
	}
	public Notice(int no2, String title, String content2, String author, String writeday2) {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	

}
