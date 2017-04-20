import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.biz.EmpService;
import com.entity.EmpDTO;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpService service = new EmpService();
		
		EmpDTO dto = new EmpDTO();
		dto.setSal(800);
		EmpDTO dto2 = new EmpDTO();
		dto2.setSal(3000);
		EmpDTO dto3 = new EmpDTO();
		dto3.setSal(5000);
		
		ArrayList<EmpDTO> a = new ArrayList<>();
		a.add(dto);
		a.add(dto2);
		a.add(dto3);
		HashMap<String, ArrayList<EmpDTO>> yyy=
				new HashMap<>();
		yyy.put("salEmpXXX", a);
		
		List<EmpDTO> kkk = service.salEmpXXX(yyy);
		for (EmpDTO empDTO : kkk) {
			System.out.println("***:"+empDTO);
		}
		
		
		
		
		
		
		// sal 가 800,3000 검색
/*		ArrayList<Integer> xxx = new ArrayList<>();
		xxx.add(800);
		xxx.add(3000);
		
		HashMap<String, ArrayList<Integer>> yyy=
				new HashMap<>();
		yyy.put("salXXX", xxx);
		
		List<EmpDTO> list = service.selectInSal(yyy);
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}*/
		
		
		
		
		
		
		
		
		/*int count = service.empCount();
		System.out.println(count);
		
		List<EmpDTO> list = service.salPaging(0, 5);
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}
		HashMap<String, Integer> map =
				new HashMap<>();
		map.put("aaa", 800);
		map.put("bbb", 3000);
		List<EmpDTO> list2 = service.selectSal(map);
		for (EmpDTO empDTO : list2) {
			System.out.println(">"+empDTO);
		}*/
		
		
		
		
	}//end main

}
