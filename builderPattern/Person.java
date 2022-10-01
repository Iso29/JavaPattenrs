package builderPattern;

public class Person {
	private String name;
	private String surname;
	private int age;
	private String address;
	
	private Person() {}
	
	private Person(String name,String surname,int age,String address) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	public static class PersonBuilder{
		private Person p;
		
		public PersonBuilder() {
			p=new Person();
		}
		
		public PersonBuilder whatIsPersonName(String name) {
			this.p.name =name;
			return this;
		}
		
		public PersonBuilder whatIsPersonsurname(String surname) {
			this.p.surname =surname;
			return this;
		}
		
		public PersonBuilder howOldIsPerson(int age) {
			this.p.age =age;
			return this;
		}
		
		public PersonBuilder whereDoesPersonLive(String address) {
			this.p.address =address;
			return this;
		}
		
		public Person buildversion1() {
			return new Person(p.name,p.surname,p.age,p.address);
		}
		
		public Person buildVersion2() {
			Person pp = p;
			p=null;
			return pp;
		}
		
	}
}
