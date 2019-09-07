package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StudentService;
public class TestSpring {
	public static void main(String[] args) {
		/*Spring出场*/
		ApplicationContext context =
		new ClassPathXmlApplicationContext("spring-config.xml");//自定义配置文件
		
		StudentService ss3 =
		(StudentService) context.getBean("studentService");//根据id获取bean

		ss3.getPerson().Show();
		}
}
