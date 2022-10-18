package add.dp.ObserverPattern;

public class Main {
	public static void main(String[] args) {

		MyHWInfo.printInfo();
		NumberGenerator generator = new RandomNumberGenerator();//data subject
		
		
		Observer observer1 = new DigitObserver();//관찰자
		Observer observer2 = new GraphObserver();//관찰자
		
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		
		
		generator.execute();
		
	}
}
