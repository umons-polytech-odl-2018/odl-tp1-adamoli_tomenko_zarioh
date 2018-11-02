package exercise1;

class Person {
	private String nom;
	private Integer age;

	public Person(String n, int a) {
		nom = n;
		age = a;
		System.out.println("Veillez accueillir un nouveau né !!!! " + nom + " : " + age);
	}

	public String getName(){
		return nom;
	}

	public int getAge (){
		return age;
	}
}
