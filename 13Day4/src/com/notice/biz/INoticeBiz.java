package com.notice.biz;

import java.util.ArrayList;

import com.notice.entity.Notice;

public interface INoticeBiz {
	ArrayList<Notice> selectAllNotice();
	Notice selectDetailNotice(String noticeNum);
	void noticeUpdate(Notice notice);
	void noticeDelete(String inputNum);
	

}
