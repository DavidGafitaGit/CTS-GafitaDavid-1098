package gafita.david.g1098.Facade;

public class TestFacade {

public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("---------------SINGLETON---------------");
		TestPatternFacade.testSingleton();
		System.out.println(" ");
		
		System.out.println("---------------FACTORY---------------");
		TestPatternFacade.testFactory();
		System.out.println(" ");
		
		System.out.println("---------------BUILDER---------------");
		TestPatternFacade.testBuilder();
		System.out.println(" ");
		
		System.out.println("---------------PROTOTYPE---------------");
		TestPatternFacade.testPrototype();
		System.out.println(" ");
		
		System.out.println("---------------DECORATOR---------------");
		TestPatternFacade.testDecorator();
		System.out.println(" ");
		
		System.out.println("---------------ADAPTER---------------");
		TestPatternFacade.testAdapter();
		System.out.println(" ");
		
		System.out.println("---------------PROXY---------------");
		TestPatternFacade.testProxy();
		
		System.out.println("---------------FLYWEIGHT---------------");
		TestPatternFacade.testFlyweight();
		System.out.println(" ");
		
		System.out.println("---------------COMPOSITE---------------");
		TestPatternFacade.testComposite();
		System.out.println(" ");
		
	}
}
