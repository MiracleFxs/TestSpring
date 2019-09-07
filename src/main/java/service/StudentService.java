package service;

public class StudentService {
	private IPerson person;

	public IPerson getPerson() {
		return person;
	}

	public void setPerson(IPerson person) {
		this.person = person;
	}

	public StudentService() {
		this.person = new Man();
	}

	//StudentService不创建对象 ,转由第三方负责注入(如Test)，称为构造器注入
	public StudentService(IPerson person) {
		this.person = person;
	}
}
