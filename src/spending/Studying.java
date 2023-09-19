package spending;

import application.SpendingController;

public class Studying extends CategoryForSpending {

	public static int moneyStudyingT;
	
	public static int moneyStudying1;
	public static int moneyStudying2;
	public static int moneyStudying3;
	public static int moneyStudying4;
	public static int moneyStudying5;
	public static int moneyStudying6;
	public static int moneyStudying7;
	public static int moneyStudying8;
	public static int moneyStudying9;
	public static int moneyStudying10;
	public static int moneyStudying11;
	public static int moneyStudying12;
	
	public static int newMoneyStudying1;
	public static int newMoneyStudying2;
	public static int newMoneyStudying3;
	public static int newMoneyStudying4;
	public static int newMoneyStudying5;
	public static int newMoneyStudying6;
	public static int newMoneyStudying7;
	public static int newMoneyStudying8;
	public static int newMoneyStudying9;
	public static int newMoneyStudying10;
	public static int newMoneyStudying11;
	public static int newMoneyStudying12;
	
	
	public static int getTotalOfEachCategory() {
		moneyStudyingT = moneyStudying1 + moneyStudying2 + moneyStudying3 + moneyStudying4 + moneyStudying5 + moneyStudying6 + moneyStudying7 + moneyStudying8 + moneyStudying9 + moneyStudying10 + moneyStudying11 + moneyStudying12;
		return moneyStudyingT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyStudying1 = SpendingController.cost;
				moneyStudying1 += newMoneyStudying1;
				break;
			case 2:
				newMoneyStudying2 = SpendingController.cost;
				moneyStudying2 += newMoneyStudying2;
				break;
			case 3:
				newMoneyStudying3 = SpendingController.cost;
				moneyStudying3 += newMoneyStudying3;
				break;
			case 4:
				newMoneyStudying4 = SpendingController.cost;
				moneyStudying4 += newMoneyStudying4;
				break;
			case 5:
				newMoneyStudying5 = SpendingController.cost;
				moneyStudying5 += newMoneyStudying5;
				break;
			case 6:
				newMoneyStudying6 = SpendingController.cost;
				moneyStudying6 += newMoneyStudying6;
				break;
			case 7:
				newMoneyStudying7 = SpendingController.cost;
				moneyStudying7 += newMoneyStudying7;
				break;
			case 8:
				newMoneyStudying8 = SpendingController.cost;
				moneyStudying8 += newMoneyStudying8;
				break;	
			case 9:
				newMoneyStudying9 = SpendingController.cost;
				moneyStudying9 += newMoneyStudying9;
				break;	
			case 10:
				newMoneyStudying10 = SpendingController.cost;
				moneyStudying10 += newMoneyStudying10;
				break;	
			case 11:
				newMoneyStudying11 = SpendingController.cost;
				moneyStudying11 += newMoneyStudying11;
				break;	
			case 12:
				newMoneyStudying12 = SpendingController.cost;
				moneyStudying12 += newMoneyStudying12;
				break;	
			default:
				break;	
		}
	}
	
}
