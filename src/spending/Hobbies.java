package spending;

import application.SpendingController;

public class Hobbies extends CategoryForSpending{

	public static int moneyHobbiesT;
	
	public static int moneyHobbies1;
	public static int moneyHobbies2;
	public static int moneyHobbies3;
	public static int moneyHobbies4;
	public static int moneyHobbies5;
	public static int moneyHobbies6;
	public static int moneyHobbies7;
	public static int moneyHobbies8;
	public static int moneyHobbies9;
	public static int moneyHobbies10;
	public static int moneyHobbies11;
	public static int moneyHobbies12;
	
	public static int newMoneyHobbies1;
	public static int newMoneyHobbies2;
	public static int newMoneyHobbies3;
	public static int newMoneyHobbies4;
	public static int newMoneyHobbies5;
	public static int newMoneyHobbies6;
	public static int newMoneyHobbies7;
	public static int newMoneyHobbies8;
	public static int newMoneyHobbies9;
	public static int newMoneyHobbies10;
	public static int newMoneyHobbies11;
	public static int newMoneyHobbies12;
	
	
	public static int getTotalOfEachCategory() {
		moneyHobbiesT = moneyHobbies1 + moneyHobbies2 + moneyHobbies3 + moneyHobbies4 + moneyHobbies5 + moneyHobbies6 + moneyHobbies7 + moneyHobbies8 + moneyHobbies9 + moneyHobbies10 + moneyHobbies11 + moneyHobbies12;
		return moneyHobbiesT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyHobbies1 = SpendingController.cost;
				moneyHobbies1 += newMoneyHobbies1;
				break;
			case 2:
				newMoneyHobbies2 = SpendingController.cost;
				moneyHobbies2 += newMoneyHobbies2;
				break;
			case 3:
				newMoneyHobbies3 = SpendingController.cost;
				moneyHobbies3 += newMoneyHobbies3;
				break;
			case 4:
				newMoneyHobbies4 = SpendingController.cost;
				moneyHobbies4 += newMoneyHobbies4;
				break;
			case 5:
				newMoneyHobbies5 = SpendingController.cost;
				moneyHobbies5 += newMoneyHobbies5;
				break;
			case 6:
				newMoneyHobbies6 = SpendingController.cost;
				moneyHobbies6 += newMoneyHobbies6;
				break;
			case 7:
				newMoneyHobbies7 = SpendingController.cost;
				moneyHobbies7 += newMoneyHobbies7;
				break;
			case 8:
				newMoneyHobbies8 = SpendingController.cost;
				moneyHobbies8 += newMoneyHobbies8;
				break;	
			case 9:
				newMoneyHobbies9 = SpendingController.cost;
				moneyHobbies9 += newMoneyHobbies9;
				break;	
			case 10:
				newMoneyHobbies10 = SpendingController.cost;
				moneyHobbies10 += newMoneyHobbies10;
				break;	
			case 11:
				newMoneyHobbies11 = SpendingController.cost;
				moneyHobbies11 += newMoneyHobbies11;
				break;	
			case 12:
				newMoneyHobbies12 = SpendingController.cost;
				moneyHobbies12 += newMoneyHobbies12;
				break;	
			default:
				break;	
		}
	}
	
}
