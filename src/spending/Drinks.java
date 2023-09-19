package spending;

import application.SpendingController;

public class Drinks extends CategoryForSpending{
	
	public static int moneyDrinksT;
	
	public static int moneyDrinks1;
	public static int moneyDrinks2;
	public static int moneyDrinks3;
	public static int moneyDrinks4;
	public static int moneyDrinks5;
	public static int moneyDrinks6;
	public static int moneyDrinks7;
	public static int moneyDrinks8;
	public static int moneyDrinks9;
	public static int moneyDrinks10;
	public static int moneyDrinks11;
	public static int moneyDrinks12;
	
	public static int newMoneyDrinks1;
	public static int newMoneyDrinks2;
	public static int newMoneyDrinks3;
	public static int newMoneyDrinks4;
	public static int newMoneyDrinks5;
	public static int newMoneyDrinks6;
	public static int newMoneyDrinks7;
	public static int newMoneyDrinks8;
	public static int newMoneyDrinks9;
	public static int newMoneyDrinks10;
	public static int newMoneyDrinks11;
	public static int newMoneyDrinks12;
	
	
	public static int getTotalOfEachCategory() {
		moneyDrinksT = moneyDrinks1 + moneyDrinks2 + moneyDrinks3 + moneyDrinks4 + moneyDrinks5 + moneyDrinks6 + moneyDrinks7 + moneyDrinks8 + moneyDrinks9 + moneyDrinks10 + moneyDrinks11 + moneyDrinks12;
		return moneyDrinksT;
	}

	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyDrinks1 = SpendingController.cost;
				moneyDrinks1 += newMoneyDrinks1;
				break;
			case 2:
				newMoneyDrinks2 = SpendingController.cost;
				moneyDrinks2 += newMoneyDrinks2;
				break;
			case 3:
				newMoneyDrinks3 = SpendingController.cost;
				moneyDrinks3 += newMoneyDrinks3;
				break;
			case 4:
				newMoneyDrinks4 = SpendingController.cost;
				moneyDrinks4 += newMoneyDrinks4;
				break;
			case 5:
				newMoneyDrinks5 = SpendingController.cost;
				moneyDrinks5 += newMoneyDrinks5;
				break;
			case 6:
				newMoneyDrinks6 = SpendingController.cost;
				moneyDrinks6 += newMoneyDrinks6;
				break;
			case 7:
				newMoneyDrinks7 = SpendingController.cost;
				moneyDrinks7 += newMoneyDrinks7;
				break;
			case 8:
				newMoneyDrinks8 = SpendingController.cost;
				moneyDrinks8 += newMoneyDrinks8;
				break;	
			case 9:
				newMoneyDrinks9 = SpendingController.cost;
				moneyDrinks9 += newMoneyDrinks9;
				break;	
			case 10:
				newMoneyDrinks10 = SpendingController.cost;
				moneyDrinks10 += newMoneyDrinks10;
				break;	
			case 11:
				newMoneyDrinks11 = SpendingController.cost;
				moneyDrinks11 += newMoneyDrinks11;
				break;	
			case 12:
				newMoneyDrinks12 = SpendingController.cost;
				moneyDrinks12 += newMoneyDrinks12;
				break;	
			default:
				break;	
		}
		
	}


}
