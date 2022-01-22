
 class Animal {
String name;
Animal(String name)
{
	this.name=name;
	
}
public void print()
{
	System.out.println("this is " + name);
}

}
 class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}
	public void print() {
		System.out.println("our animal is " + name);
		super.print();
	}
}
 class teat1{
	 public static void main(String args[])
	 {
		 Animal a = new Animal("Tibetian husky");
		 Dog d = new Dog("German Shepherd");
		 d.print();
		 a.print();
	 }
 }
