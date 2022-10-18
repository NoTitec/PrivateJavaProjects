package add.dp.StrategyPattern;


public class Main {
	public static void main(String[] args) {
		MyHWInfo.printInfo();

		/*if (args.length != 2) {
			System.out.println("Usage: java Main randomseed1 randomseed2");
			System.out.println("Example: java Main 314 15");
			System.exit(0);
		}

		
		
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);*/

		int seed1=1;
		int seed2=2;

		//플레이어 2명 생성 , 1은 winningstrategy, 2는 probstrategy
		Player player1 = new Player("홍길동", new WinningStrategy(seed1));
		Player player2 = new Player("임꺽정", new ProbStrategy(seed2));

		//10번 가위바위보 수행
		for (int i = 0; i < 10; i++) {
			// 낼 가위바위보를 생성
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			//플레이어 1이 이긴경우
			if (nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			}
			//플레이어 2가 이긴경우
			else if (nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner:" + player2);
				player1.lose();
				player2.win();
			}
			//비긴경우
			else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}

		System.out.println("Total result:");
		System.out.println("" + player1);
		
		System.out.println("" + player2);
	}
}
