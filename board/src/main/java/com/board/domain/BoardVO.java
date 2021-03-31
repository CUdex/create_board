package com.board.domain;

import java.util.Date;

public class BoardVO {
	
	/*
	create table tbl_board(
			bno int not null AUTO_INCREMENT,
			title varchar(50) not null,
			content text not null,
			writer varchar(50) not null,
			regData timestamp default now(),
			viewCnt int default 0,
			primary key (bno)
		);
	*/
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regData;
	private int viewCnt;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegData() {
		return regData;
	}
	public void setRegData(Date regDate) {
		this.regData = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

}
