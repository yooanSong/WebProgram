package com.employee.test;

import java.util.ArrayList;
import java.util.Date;


import com.employee.biz.EmployeeBiz;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import com.employee.util.CommonUtil;
import com.notice.biz.NoticeBiz;
import com.notice.entity.Notice;

public class EmployeeTest {

	
	
	public static void main(String[] args) {
		
		EmployeeBiz empBiz = new EmployeeBiz();
		NoticeBiz noticeBiz = new NoticeBiz();
		
		while (true) {
			printMainMenu();
			String inputMenu = CommonUtil.getUserInput();
	if (inputMenu.equals("1")) {
	
		   printEmployeeList(empBiz);
		   System.out.println("====================================================================================\n");
		}else if (inputMenu.equals("2")) {
				System.out.println("*****************************************");
				System.out.println("\t[2.임직원 정보 검색]");
				System.out.println("*****************************************");
				System.out.println("1.사번 검색");
				System.out.println("2.이름 검색");
				System.out.println("3.부서 검색");
				System.out.println("4.근무지 검색");
				System.out.println("5.연봉 검색");
				System.out.println("*****************************************");
				System.out.print("메뉴 입력(1~5 사이 정수로 입력) => ");
				String inputSubMenu = CommonUtil.getUserInput();
				int menu = Integer.parseInt(inputSubMenu);
				
				switch(menu){
				case 1:
					System.out.print("검색할 사번를 입력하세요 => ");
					  break;
				case 2:
					System.out.print("검색할 이름를 입력하세요 => ");
				  break;
				case 3:
					System.out.print("검색할 부서를 입력하세요(1.영업 2.개발) => ");
				  break;
				case 4:
					System.out.print("검색할 근무지를 입력하세요 => ");
				  break;
				case 5:
					System.out.println("입력한 연봉보다 많은 임직원을 모두 출력합니다.");
					System.out.print("검색할 연봉를 입력하세요 => ");
				  break;
				}//end switch
		
					String searchWord = CommonUtil.getUserInput();
					try {
						empBiz.printSearchList(inputSubMenu,searchWord);
					}/*catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}*/catch(Exception e){
					System.out.println(e.getMessage());
					
				}
				
			} else if (inputMenu.equals("3")) {
				System.out.println("*****************************************");
				System.out.println("\t[3.임직원 정보 추가 ]");
				System.out.println("*****************************************");
				String employeeNum = empBiz.createEmplyeeNum();
				System.out.println("사원번호[" + employeeNum + "]를 생성하였습니다");
				System.out.print("추가할 이름을 입력하세요 => ");
				String employeeName = CommonUtil.getUserInput();
				System.out.print("추가할 부서를 입력하세요(1.영업 2.개발) => ");
				String department = CommonUtil.getUserInput();			
				System.out.print("추가할 근무지를 입력하세요(서울,부산,인천 ) => ");
				String location = CommonUtil.getUserInput();
				System.out.print("추가할 연봉을 입력하세요 =>  ");
				String salary = CommonUtil.getUserInput();
				System.out.print("추가할 입사일(예:2014-06-01)을 입력하세요 \n 엔터를 치면 현재날짜로 입력됩니다. =>");
				
				String dateOfHire = CommonUtil.getUserInput();
				if(dateOfHire.equals("")){
					dateOfHire = CommonUtil.getDate(new Date());
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 등록
				Employee emp = null;
				if("1".equals(department)){
					emp = new Sales(Integer.parseInt(employeeNum), employeeName,						
							CommonUtil.getDate(dateOfHire),  location, Integer.parseInt(salary), 
							EmployeeBiz.EMPLOYEE_WORK, Integer.parseInt(salary)*Sales.COMMISSION_RATE);
				}else{
					emp = new Engineer(Integer.parseInt(employeeNum), employeeName, CommonUtil.getDate(dateOfHire),  
							location, Integer.parseInt(salary), EmployeeBiz.EMPLOYEE_WORK);
				}
				empBiz.employeeInsert(emp);
               
				//사원 목록 출력
				printEmployeeList(empBiz);
			}else if (inputMenu.equals("4")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[4.임직원 정보 수정 ]");
				System.out.println("*****************************************");
				System.out.print("수정할 사원번호를 입력하세요 => ");
				String employeeNum = CommonUtil.getUserInput();
				System.out.print("수정할 이름을 입력하세요.\n Enter를 치면 이름은 수정하지 않습니다. => ");
				String employeeName = CommonUtil.getUserInput();
				System.out.print("수정할 부서를 입력하세요.(1.영업 2.개발) => ");
				String department = CommonUtil.getUserInput();
				System.out.print("수정할 근무지를 입력하세요.(서울,부산,인천 )\n Enter를 치면 근무지는 수정하지 않습니다.");
				String location = CommonUtil.getUserInput();
				System.out.print("수정할 연봉을 입력하세요.\n Enter를 치면 연봉은 수정하지 않습니다. =>");
				String salary = CommonUtil.getUserInput();
				if(salary.equals("")){
					salary = "0";  //기본값
				}
				System.out.println();
				System.out.println("*****************************");
				//사원 수정 
				Employee emp = null;
				if("1".equals(department)){
					emp = new Sales(Integer.parseInt(employeeNum), employeeName, new Date(),  location, Integer.parseInt(salary), EmployeeBiz.EMPLOYEE_WORK, Integer.parseInt(salary)*Sales.COMMISSION_RATE);
				}else if("2".equals(department)){
					emp = new Engineer(Integer.parseInt(employeeNum), employeeName, new Date(),  location, Integer.parseInt(salary), EmployeeBiz.EMPLOYEE_WORK);
				}
				try {
					empBiz.employeeUpdate(emp);
				} 
				/*catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}*/
			catch(Exception e){
				System.out.println(e.getMessage());
				
			}

				//사원 목록 출력
				printEmployeeList(empBiz);
				
			} else if (inputMenu.equals("5")) {
				
				System.out.println("*****************************************");
				System.out.println("\t[5.임직원 정보 삭제 ]");
				System.out.println("*****************************************");
				System.out.print("삭제할 사원번호를 입력하세요=> ");
				String employeeNum = CommonUtil.getUserInput();
				System.out.println("*****************************");
	            try {
					empBiz.employeeDelete(Integer.parseInt(employeeNum));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} /*catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}*/catch(Exception e){
					System.out.println(e.getMessage());
					
				}
	           
	            printEmployeeList(empBiz);
			}else if (inputMenu.equals("6")) {
				
				System.out.println("*****************************************");
				System.out.print("변경할 사원번호를 입력하세요 => ");
				String inputNum = CommonUtil.getUserInput();
				System.out.println("1.외출");
				System.out.println("2.출장");
				System.out.println("3.휴가");
				System.out.println("4.근무");
				System.out.println("------------------------------------------------");
				System.out.print("메뉴를 입력하세요(정수) => ");
				String inputColumn = CommonUtil.getUserInput();
				System.out.println("------------------------------------------------");
				try {
					empBiz.employeeService(inputNum, inputColumn);
				}/*catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}*/catch(Exception e){
				System.out.println(e.getMessage());
				
			}

			}
			else if (inputMenu.equals("7")) {
				
				//공지사항 목록
				 ArrayList<Notice> list = noticeBiz.selectAllNotice();
					System.out.println("======================================================================");
			        System.out.println("NO\t\t제목\t\t작성자\t작성일자");
			        System.out.println("----------------------------------------------------------------------");
			for (Notice notice : list) {
				System.out.print(notice.getNo() + "\t");
				System.out.print(notice.getContent() + "\t");
				System.out.print(notice.getName() + "\t");
				System.out.println(CommonUtil.getDate(notice.getWriteday()));
			}
			if (list.size() == 0)System.out.println("공지사항이 없습니다.");
			
			  System.out.println("======================================================================\n");
				
		   }else if (inputMenu.equals("8")) {
			System.out.println("*****************************************");
			System.out.print("공지 글 번호를 입력하세요 => ");
			String inputNum = CommonUtil.getUserInput();
			
			Notice notice=null;
			try {
				notice = noticeBiz.selectDetailNotice(inputNum);
				System.out.println("======================================================================");
				System.out.println("NO\t\t제목\t\t작성자\t작성일자");
				System.out.println("----------------------------------------------------------------------");
				System.out.print(notice.getNo() + "\t");
				System.out.print(notice.getContent() + "\t");
				System.out.print(notice.getName() + "\t");
				System.out.println(CommonUtil.getDate(notice.getWriteday()));
				System.out.println("----------------------------------------------------------------------");
				System.out.println("\t"+notice.getContent());
				System.out.println("----------------------------------------------------------------------");
			}/*catch (DataNotFoundException e) {
			System.out.println(e.getMessage());
		}*/catch(Exception e){
			System.out.println(e.getMessage());
			
		}

		} else if (inputMenu.equals("9")) {
			System.out.println("*****************************************");
			System.out.print("수정 할 공지 글번호를 입력하세요=> ");
			String inputNum = CommonUtil.getUserInput();
			System.out.println("1.제목수정");
			System.out.println("2.내용수정");
			System.out.println("3.모두수정");
			System.out.println("------------------------------------------------");
			System.out.print("메뉴를 입력하세요(정수) => ");
			String inputColumn = CommonUtil.getUserInput();
			System.out.println("------------------------------------------------");
			   
					noticeBiz.printNoticeUpdate(inputNum,inputColumn);
					
			
			    
			    //공지사항 목록

					Notice notice=null;
					try {
						notice = noticeBiz.selectDetailNotice(inputNum);
						System.out.println("======================================================================");
						System.out.println("NO\t\t제목\t\t작성자\t작성일자");
						System.out.println("----------------------------------------------------------------------");
						System.out.print(notice.getNo() + "\t");
						System.out.print(notice.getContent() + "\t");
						System.out.print(notice.getName() + "\t");
						System.out.println(CommonUtil.getDate(notice.getWriteday()));
						System.out.println("----------------------------------------------------------------------");
						System.out.println("\t"+notice.getContent());
						System.out.println("----------------------------------------------------------------------");
					} /*catch (DataNotFoundException e) {
					System.out.println(e.getMessage());
				}*/catch(Exception e){
					System.out.println(e.getMessage());
					
				}
			   
			   
		  System.out.println("======================================================================\n");
			    
			}else if (inputMenu.equals("10")) {
				System.out.println("*****************************************");
				System.out.print("삭제 할 공지 글번호를 입력하세요 => ");
				String inputNum = CommonUtil.getUserInput();
				try {
					noticeBiz.noticeDelete(inputNum);
					System.out.println(inputNum+"번 글이 삭제되었습니다.");
				}/*catch (DataNotFoundException e) {
				System.out.println(e.getMessage());
			}*/catch(Exception e){
				System.out.println(e.getMessage());
				
			}
				System.out.println("------------------------------------------------");
			} else {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private static void printMainMenu() {

		System.out.println("*****************************************");
		System.out.println("\t[임직원 관리 시스템 메뉴]");
		System.out.println("*****************************************");
		System.out.println("1.전체 임직원 목록");
		System.out.println("2.임직원 정보 검색");
		System.out.println("3.임직원 정보 추가");
		System.out.println("4.임직원 정보 수정");
		System.out.println("5.임직원 정보 삭제");
		System.out.println("6.근태관리");
		System.out.println("7.공지사항 목록");
		System.out.println("8.공지사항 상세보기");
		System.out.println("9.공지사항 수정");
		System.out.println("10.공지사항 삭제");
		System.out.println("0.종료");
		System.out.println("*****************************************");
		System.out.print("메뉴 입력 => ");
	}//
	
	//사원 목록 출력
	public static void printEmployeeList(EmployeeBiz empBiz){
		  //사원 목록 리스트
				ArrayList<Employee> list = empBiz.selectAllEmployee();	
				System.out.println("====================================================================================");
				System.out.println("사번\t이름\t부서\t근무지\t연봉\t커미션\t입사일\t\t비고");
				System.out.println("------------------------------------------------------------------------------------");
				for (Employee e : list) {
					System.out.print(e.getEmployeeNum() + "\t");
					System.out.print(e.getEmployeeName() + "\t");
					String department = "개발";
					if(e instanceof Sales){
						department = "영업";
					}
					System.out.print(department + "\t");
					System.out.print(e.getLocation() + "\t");
					System.out.print(CommonUtil.getCurrency(e.getSalary()) + "\t");
					double commission = 0;
					if(e instanceof Sales){
						Sales s = (Sales)e;
						commission = s.getCommission();
						System.out.print(CommonUtil.getCurrency(((int)commission))+"\t");
					}else{
						System.out.print("\t");
					}
					
					System.out.print(CommonUtil.getDate(e.getDateOfHire()) + "\t");
					String state ="근무중";
					switch(e.getState()){
					case EmployeeBiz.EMPLOYEE_OUT: 
						state= "외출중";
						break;
					case EmployeeBiz.EMPLOYEE_TRIP:
						state= "출장중";
						break;
					case EmployeeBiz.EMPLOYEE_VACATION:
						state= "휴가중";
						break;
					}
					System.out.print(state);
					System.out.println();
				}//end for
	}//end printEmployeeList
	


}
