package spending;

import application.SpendingController;

public class DailySupplies extends CategoryForSpending{

	public static int moneyDailyT;
	
	public static int moneyDaily1;
	public static int moneyDaily2;
	public static int moneyDaily3;
	public static int moneyDaily4;
	public static int moneyDaily5;
	public static int moneyDaily6;
	public static int moneyDaily7;
	public static int moneyDaily8;
	public static int moneyDaily9;
	public static int moneyDaily10;
	public static int moneyDaily11;
	public static int moneyDaily12;
	
	public static int newMoneyDaily1;
	public static int newMoneyDaily2;
	public static int newMoneyDaily3;
	public static int newMoneyDaily4;
	public static int newMoneyDaily5;
	public static int newMoneyDaily6;
	public static int newMoneyDaily7;
	public static int newMoneyDaily8;
	public static int newMoneyDaily9;
	public static int newMoneyDaily10;
	public static int newMoneyDaily11;
	public static int newMoneyDaily12;
	
	
	public static int getTotalOfEachCategory() {
		moneyDailyT = moneyDaily1 + moneyDaily2 + moneyDaily3 + moneyDaily4 + moneyDaily5 + moneyDaily6 + moneyDaily7 + moneyDaily8 + moneyDaily9 + moneyDaily10 + moneyDaily11 + moneyDaily12;
		return moneyDailyT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyDaily1 = SpendingController.cost;
				moneyDaily1 += newMoneyDaily1;
				break;
			case 2:
				newMoneyDaily2 = SpendingController.cost;
				moneyDaily2 += newMoneyDaily2;
				break;
			case 3:
				newMoneyDaily3 = SpendingController.cost;
				moneyDaily3 += newMoneyDaily3;
				break;
			case 4:
				newMoneyDaily4 = SpendingController.cost;
				moneyDaily4 += newMoneyDaily4;
				break;
			case 5:
				newMoneyDaily5 = SpendingController.cost;
				moneyDaily5 += newMoneyDaily5;
				break;
			case 6:
				newMoneyDaily6 = SpendingController.cost;
				moneyDaily6 += newMoneyDaily6;
				break;
			case 7:
				newMoneyDaily7 = SpendingController.cost;
				moneyDaily7 += newMoneyDaily7;
				break;
			case 8:
				newMoneyDaily8 = SpendingController.cost;
				moneyDaily8 += newMoneyDaily8;
				break;	
			case 9:
				newMoneyDaily9 = SpendingController.cost;
				moneyDaily9 += newMoneyDaily9;
				break;	
			case 10:
				newMoneyDaily10 = SpendingController.cost;
				moneyDaily10 += newMoneyDaily10;
				break;	
			case 11:
				newMoneyDaily11 = SpendingController.cost;
				moneyDaily11 += newMoneyDaily11;
				break;	
			case 12:
				newMoneyDaily12 = SpendingController.cost;
				moneyDaily12 += newMoneyDaily12;
				break;	
			default:
				break;	
		}
	}
	
	
}
