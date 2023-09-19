package spending;

import application.SpendingController;

public class Gathering extends CategoryForSpending {
	
	public static int moneyGatheringT;
	
	public static int moneyGathering1;
	public static int moneyGathering2;
	public static int moneyGathering3;
	public static int moneyGathering4;
	public static int moneyGathering5;
	public static int moneyGathering6;
	public static int moneyGathering7;
	public static int moneyGathering8;
	public static int moneyGathering9;
	public static int moneyGathering10;
	public static int moneyGathering11;
	public static int moneyGathering12;
	
	public static int newMoneyGathering1;
	public static int newMoneyGathering2;
	public static int newMoneyGathering3;
	public static int newMoneyGathering4;
	public static int newMoneyGathering5;
	public static int newMoneyGathering6;
	public static int newMoneyGathering7;
	public static int newMoneyGathering8;
	public static int newMoneyGathering9;
	public static int newMoneyGathering10;
	public static int newMoneyGathering11;
	public static int newMoneyGathering12;
	
	
	public static int getTotalOfEachCategory() {
		moneyGatheringT = moneyGathering1 + moneyGathering2 + moneyGathering3 + moneyGathering4 + moneyGathering5 + moneyGathering6 + moneyGathering7 + moneyGathering8 + moneyGathering9 + moneyGathering10 + moneyGathering11 + moneyGathering12;
		return moneyGatheringT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyGathering1 = SpendingController.cost;
				moneyGathering1 += newMoneyGathering1;
				break;
			case 2:
				newMoneyGathering2 = SpendingController.cost;
				moneyGathering2 += newMoneyGathering2;
				break;
			case 3:
				newMoneyGathering3 = SpendingController.cost;
				moneyGathering3 += newMoneyGathering3;
				break;
			case 4:
				newMoneyGathering4 = SpendingController.cost;
				moneyGathering4 += newMoneyGathering4;
				break;
			case 5:
				newMoneyGathering5 = SpendingController.cost;
				moneyGathering5 += newMoneyGathering5;
				break;
			case 6:
				newMoneyGathering6 = SpendingController.cost;
				moneyGathering6 += newMoneyGathering6;
				break;
			case 7:
				newMoneyGathering7 = SpendingController.cost;
				moneyGathering7 += newMoneyGathering7;
				break;
			case 8:
				newMoneyGathering8 = SpendingController.cost;
				moneyGathering8 += newMoneyGathering8;
				break;	
			case 9:
				newMoneyGathering9 = SpendingController.cost;
				moneyGathering9 += newMoneyGathering9;
				break;	
			case 10:
				newMoneyGathering10 = SpendingController.cost;
				moneyGathering10 += newMoneyGathering10;
				break;	
			case 11:
				newMoneyGathering11 = SpendingController.cost;
				moneyGathering11 += newMoneyGathering11;
				break;	
			case 12:
				newMoneyGathering12 = SpendingController.cost;
				moneyGathering12 += newMoneyGathering12;
				break;	
			default:
				break;	
		}
	}
	
}
