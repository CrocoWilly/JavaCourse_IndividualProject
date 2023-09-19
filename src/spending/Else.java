package spending;

import application.SpendingController;

public class Else extends CategoryForSpending {

	public static int moneyElseT;
	
	public static int moneyElse1;
	public static int moneyElse2;
	public static int moneyElse3;
	public static int moneyElse4;
	public static int moneyElse5;
	public static int moneyElse6;
	public static int moneyElse7;
	public static int moneyElse8;
	public static int moneyElse9;
	public static int moneyElse10;
	public static int moneyElse11;
	public static int moneyElse12;
	
	public static int newMoneyElse1;
	public static int newMoneyElse2;
	public static int newMoneyElse3;
	public static int newMoneyElse4;
	public static int newMoneyElse5;
	public static int newMoneyElse6;
	public static int newMoneyElse7;
	public static int newMoneyElse8;
	public static int newMoneyElse9;
	public static int newMoneyElse10;
	public static int newMoneyElse11;
	public static int newMoneyElse12;
	
	
	public static int getTotalOfEachCategory() {
		moneyElseT = moneyElse1 + moneyElse2 + moneyElse3 + moneyElse4 + moneyElse5 + moneyElse6 + moneyElse7 + moneyElse8 + moneyElse9 + moneyElse10 + moneyElse11 + moneyElse12;
		return moneyElseT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyElse1 = SpendingController.cost;
				moneyElse1 += newMoneyElse1;
				break;
			case 2:
				newMoneyElse2 = SpendingController.cost;
				moneyElse2 += newMoneyElse2;
				break;
			case 3:
				newMoneyElse3 = SpendingController.cost;
				moneyElse3 += newMoneyElse3;
				break;
			case 4:
				newMoneyElse4 = SpendingController.cost;
				moneyElse4 += newMoneyElse4;
				break;
			case 5:
				newMoneyElse5 = SpendingController.cost;
				moneyElse5 += newMoneyElse5;
				break;
			case 6:
				newMoneyElse6 = SpendingController.cost;
				moneyElse6 += newMoneyElse6;
				break;
			case 7:
				newMoneyElse7 = SpendingController.cost;
				moneyElse7 += newMoneyElse7;
				break;
			case 8:
				newMoneyElse8 = SpendingController.cost;
				moneyElse8 += newMoneyElse8;
				break;	
			case 9:
				newMoneyElse9 = SpendingController.cost;
				moneyElse9 += newMoneyElse9;
				break;	
			case 10:
				newMoneyElse10 = SpendingController.cost;
				moneyElse10 += newMoneyElse10;
				break;	
			case 11:
				newMoneyElse11 = SpendingController.cost;
				moneyElse11 += newMoneyElse11;
				break;	
			case 12:
				newMoneyElse12 = SpendingController.cost;
				moneyElse12 += newMoneyElse12;
				break;	
			default:
				break;	
		}
	}
}
