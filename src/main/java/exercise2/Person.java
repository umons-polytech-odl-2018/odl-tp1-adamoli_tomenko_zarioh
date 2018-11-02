package exercise2;

class Person {
	private int age;
	private static int PopulationSize=0;


	public Person(int a) {
		age = a;
		PopulationSize++;
	}


	public static int computePopulationSize()
	{
		return PopulationSize;
	}
}
