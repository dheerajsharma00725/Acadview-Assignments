interface Animals {
    void speak();
    void eat();
	public static void main(String[] args) {
      Dog d=new Dog();
      d.speak();
      d.eat();
      cat c=new cat();
      c.speak();
      c.eat();
	}
}
 class Dog implements Animals{
	public void speak() {
		System.out.println("Dog=Bark");
	}
	public void eat() {
		System.out.println("Bones");
	}
}
 class cat implements Animals{
		public void speak() {
			System.out.println("Cat-Meow");
		}
		public void eat() {
			System.out.println("Milk");
		}
}