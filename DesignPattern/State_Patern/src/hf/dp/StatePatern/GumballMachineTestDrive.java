package hf.dp.StatePatern;

public class GumballMachineTestDrive {

	public static void main(String[] args) {

		MyHWInfo.printInfo();
		//머신생성할때 모든 상태 초기화하고 상품개수랑 최초상태는 상품이 1개이상이면 noQuarterState로 변경
		//모든 상태는 머신을 인자로줘서 머신의 상태변경 메소드와 상태들을 이용가능하게 함

		GumballMachine gumballMachine = 
			new GumballMachine(10);

		//현재 머신정보를 출력한다
		System.out.println(gumballMachine);

		//noQuarter의 insertQuarter호출 하여 동전넣음 출력하고 머신상태를 hasquarter로 변경
		gumballMachine.insertQuarter();
		// 레버돌려서 만약 랜덤수 0~9 중 0이나오고 상품이 2개이상이면 Winnerstate로 변경하고 아니면 soldstate로 변경하고 상품내보내기메소드를 실행한다
		//SoldState면 공 1개 내보내고 상품이 다떨어졌으면 soldout상태로 아니면 noquarter상태로 변경한다
		//WinnerState면 1개 내보내고 상품이 떨어졌으면 soldout상태로 아니면 1개 더 내보내고 이겼다는 문구를 출력한뒤 상품이 없으면 soldout상태로 아니면 noquarter상태로 변경한다
		gumballMachine.turnCrank();
		//noQuarter의 insertQuarter호출 하여 동전넣음 출력하고 머신상태를 hasquarter로 변경
		gumballMachine.insertQuarter();
		// 레버돌려서 만약 랜덤수 0~9 중 0이나오고 상품이 2개이상이면 Winnerstate로 변경하고 아니면 soldstate로 변경하고 상품내보내기메소드를 실행한다
		//SoldState면 공 1개 내보내고 상품이 다떨어졌으면 soldout상태로 아니면 noquarter상태로 변경한다
		//WinnerState면 1개 내보내고 상품이 떨어졌으면 soldout상태로 아니면 1개 더 내보내고 이겼다는 문구를 출력한뒤 상품이 없으면 soldout상태로 아니면 noquarter상태로 변경한다
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
