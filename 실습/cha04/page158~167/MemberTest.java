package cha04_exercises;

class Member{
	private String name, id, pwd;
	private int age;
	
	public Member(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	
	public void getMember() {
		System.out.println(name +"/"+ id +"/"+ pwd +"/"+ age);
	}
	
	public void setMember(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
}

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
