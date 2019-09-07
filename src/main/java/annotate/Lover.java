package annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Lover {
	@Autowired
	private Man man;
	@Autowired
	private Woman woman;

	@Override
	public String toString() {
		return man.getUsername() + "和" + woman.getUsername() + "是恋人";
	}
//有@Autowired时getter和setter可去掉
}
