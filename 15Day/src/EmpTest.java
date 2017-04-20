import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.biz.EmpService;
import com.entity.EmpDTO;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*EmpService service = new EmpService();		
		int count = service.empCount();
		System.out.println(count);
		
		List<EmpDTO> list= service.salPaging(0, 5);
		for (EmpDTO empDTO : list) {
			System.out.println(empDTO);
		}
		
		System.out.println("=========================");
		HashMap<String, Integer> map = new HashMap<>();         
		map.put("aaa", 800);
		map.put("bbb", 3000);
		List<EmpDTO> list2= service.selectSal(map);
		for (EmpDTO empDTO : list2) {
			System.out.println(">"+empDTO);
		}*/
		
		//System.out.println("=========================");
		/*EmpService service = new EmpService();			
		// sal 가 800, 3000만 뽑고 싶어 그럼 이걸 어딘가에 담아둬야 하니깐 
		//1.haspMap에 담거나 2.ArrayList에 담음
		//dto는 sal 하나만 담을 수 있으니깐 다른 데이터를 저장할 수 없어서 dto에 안 담는다 		
		ArrayList<Integer> xxx = new ArrayList<>();
		xxx.add(800);
		xxx.add(3000);
		
		HashMap<String, ArrayList<Integer>> yyy= new HashMap<>();    // ArrayList<Integer>를 value로 받아옴 
		yyy.put("salXXX", xxx);

		List<EmpDTO> list3= service.selectInSal(yyy);
		for (EmpDTO empDTO : list3) {
			System.out.println(empDTO);
		}*/
	
		//System.out.println("=========================");
		EmpService service = new EmpService();
		
		EmpDTO dto= new EmpDTO();
		dto.setSal(800);
		EmpDTO dto2= new EmpDTO();
		dto.setSal(3000);
		EmpDTO dto3= new EmpDTO();
		dto.setSal(5000);
		
		ArrayList<EmpDTO> a = new ArrayList<>();
		a.add(dto);
		a.add(dto2);
		a.add(dto3);
		
		HashMap<String, ArrayList<EmpDTO>> yyy= new HashMap<>();    // ArrayList<Integer>를 value로 받아옴 
		yyy.put("salEmpXXX", a);

		List<EmpDTO> list4= service.salEmpXXX(yyy);
		for (EmpDTO empDTO : list4) {
			System.out.println("***:"+empDTO);
		}
		
		
		
		
		
	}//end main 

}
	
	
