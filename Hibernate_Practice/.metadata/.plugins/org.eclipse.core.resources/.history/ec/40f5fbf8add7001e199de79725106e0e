package in.co.rays.junit;

import org.junit.Test;

public class TesFail {
@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setName("abc");
		bean.setSalary(6000);
		UserModel model=new UserModel();
		model.add(bean);
		bean=UserModel.findByPk(2);
		if(bean==null) {
			System.out.println("Record is not added");
		}else
		{
			System.out.println("Record is added");
		}
	}

}
