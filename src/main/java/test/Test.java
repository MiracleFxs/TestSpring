package test;

import service.*;

public class Test {
	public static void main(String[] args) {
		StudentService ss1 = new StudentService();
		ss1.getPerson().Show();
		/* Test:能不能输出女生啊?程序猿修改程序! */
		StudentService ss2 = new StudentService(new Woman());
		ss2.getPerson().Show();
		/* Test:我也不想负责对象的创建及维护,我好累! */
		/* Spring:都交给我! */
	}
}
