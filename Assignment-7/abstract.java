abstract class Animal{
	String breed,color,name;
	abstract void eat();
	void speak(){
		System.out.println("Speak() Method");
	}
}
class dog extends Animal{
	dog(String breed,String colour,String name){
	this.breed=breed;
	this.color=color;
	this.name=name;
	}
	void details() {
		System.out.println("Name : "+ name);
		System.out.println("Breed : "+ breed);
		System.out.println("Color : "+ color);
	}

	void eat(){
		System.out.println("I eat pedigree.");
			}

}
class main {

	public static void main(String[] args) {
		Animal an=new dog("Pitbull","Brown","Peter");
	dog d=new dog("Pitbull","Brown","Peter");
     d.details();
    an.eat();
	an.speak();
	}

}