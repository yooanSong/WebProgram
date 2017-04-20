import java.util.List;

import com.biz.DeptService;
import com.entity.DeptDTO;

public class DeptTest {

	public static void main(String[] args) {
		DeptService service = new DeptService();
		
		DeptDTO dto = service.selectByDeptno(40); //dept table에서 deptno가 40인 레코드(한줄)를 select 하겠다 
		System.out.println(dto);
		
		List<DeptDTO> list= service.selectALL();
		for (DeptDTO deptDTO : list) {
			System.out.println(">" + deptDTO);
		}
	
		//1.저장
		//service.insert(new DeptDTO(80, "인사", "부산")); //왔다갔다하는 기본단위는 DeptDTO
		
		//2.삭제
		//service.delete(88);
		
		//3. 수정
		//service.update(new DeptDTO(80, "인사2", "부산2"));

		

	}

}
