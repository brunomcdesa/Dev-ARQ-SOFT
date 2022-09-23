
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {
		System.out.println("INSTANCIEI UM OBJETO");
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
