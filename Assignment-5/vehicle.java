abstract class Vehicle {
  abstract void start();
	abstract void stop();
}
class TwoWheeler extends Vehicle{


	public void start() {
		System.out.println("Starting Two Wheeler.");
	}
	public void stop(){
		System.out.println("Stopping Two wheeler.");
	}

}
class FourWheeler extends Vehicle{
 

	public void start() {
		System.out.println("Starting Four Wheeler.");
	}
	public void stop(){
		System.out.println("Stopping four wheeler.");
	}
}



class Vehicle1 {
	public static void main(String[] args) {
		Vehicle wheels = new TwoWheeler();
		Vehicle wheels1 = new FourWheeler();
		wheels.start();
		wheels.stop();
		wheels1.start();
		wheels1.stop();
	}
}