package annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");
		Lover lover = context.getBean("lover", Lover.class);
		System.out.println(lover);
	}

}
