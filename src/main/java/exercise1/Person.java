package exercise1;

class Person {
	private String name;
	private Integer age;

	public Person(String n, int a) {
		name = n;
		age = a;
		System.out.println("Veillez accueillir un nouveau né !!!! " + name + " : " + age);
	}

	public String getName(){
		return name;
	}

	public int getAge (){
		return age;
	}
}
