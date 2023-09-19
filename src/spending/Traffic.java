package spending;

import application.SpendingController;

public class Traffic extends CategoryForSpending {

	public static int moneyTrafficT;
	
	public static int moneyTraffic1;
	public static int moneyTraffic2;
	public static int moneyTraffic3;
	public static int moneyTraffic4;
	public static int moneyTraffic5;
	public static int moneyTraffic6;
	public static int moneyTraffic7;
	public static int moneyTraffic8;
	public static int moneyTraffic9;
	public static int moneyTraffic10;
	public static int moneyTraffic11;
	public static int moneyTraffic12;
	
	public static int newMoneyTraffic1;
	public static int newMoneyTraffic2;
	public static int newMoneyTraffic3;
	public static int newMoneyTraffic4;
	public static int newMoneyTraffic5;
	public static int newMoneyTraffic6;
	public static int newMoneyTraffic7;
	public static int newMoneyTraffic8;
	public static int newMoneyTraffic9;
	public static int newMoneyTraffic10;
	public static int newMoneyTraffic11;
	public static int newMoneyTraffic12;
	
	
	public static int getTotalOfEachCategory() {
		moneyTrafficT = moneyTraffic1 + moneyTraffic2 + moneyTraffic3 + moneyTraffic4 + moneyTraffic5 + moneyTraffic6 + moneyTraffic7 + moneyTraffic8 + moneyTraffic9 + moneyTraffic10 + moneyTraffic11 + moneyTraffic12;
		return moneyTrafficT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyTraffic1 = SpendingController.cost;
				moneyTraffic1 += newMoneyTraffic1;
				break;
			case 2:
				newMoneyTraffic2 = SpendingController.cost;
				moneyTraffic2 += newMoneyTraffic2;
				break;
			case 3:
				newMoneyTraffic3 = SpendingController.cost;
				moneyTraffic3 += newMoneyTraffic3;
				break;
			case 4:
				newMoneyTraffic4 = SpendingController.cost;
				moneyTraffic4 += newMoneyTraffic4;
				break;
			case 5:
				newMoneyTraffic5 = SpendingController.cost;
				moneyTraffic5 += newMoneyTraffic5;
				break;
			case 6:
				newMoneyTraffic6 = SpendingController.cost;
				moneyTraffic6 += newMoneyTraffic6;
				break;
			case 7:
				newMoneyTraffic7 = SpendingController.cost;
				moneyTraffic7 += newMoneyTraffic7;
				break;
			case 8:
				newMoneyTraffic8 = SpendingController.cost;
				moneyTraffic8 += newMoneyTraffic8;
				break;	
			case 9:
				newMoneyTraffic9 = SpendingController.cost;
				moneyTraffic9 += newMoneyTraffic9;
				break;	
			case 10:
				newMoneyTraffic10 = SpendingController.cost;
				moneyTraffic10 += newMoneyTraffic10;
				break;	
			case 11:
				newMoneyTraffic11 = SpendingController.cost;
				moneyTraffic11 += newMoneyTraffic11;
				break;	
			case 12:
				newMoneyTraffic12 = SpendingController.cost;
				moneyTraffic12 += newMoneyTraffic12;
				break;	
			default:
				break;	
		}
	}
	
}
