package spending;

import application.SpendingController;

public class Clothes extends CategoryForSpending{

	public static int moneyClothesT = 0;
	
	public static int moneyClothes1 = 0;
	public static int moneyClothes2 = 0;
	public static int moneyClothes3 = 0;
	public static int moneyClothes4 = 0;
	public static int moneyClothes5 = 0;
	public static int moneyClothes6 = 0;
	public static int moneyClothes7 = 0;
	public static int moneyClothes8 = 0;
	public static int moneyClothes9 = 0;
	public static int moneyClothes10 = 0;
	public static int moneyClothes11 = 0;
	public static int moneyClothes12 = 0;
	
	public static int newMoneyClothes1 = 0;
	public static int newMoneyClothes2 = 0;
	public static int newMoneyClothes3 = 0;
	public static int newMoneyClothes4 = 0;
	public static int newMoneyClothes5 = 0;
	public static int newMoneyClothes6 = 0;
	public static int newMoneyClothes7 = 0;
	public static int newMoneyClothes8 = 0;
	public static int newMoneyClothes9 = 0;
	public static int newMoneyClothes10 = 0;
	public static int newMoneyClothes11 = 0;
	public static int newMoneyClothes12 = 0;
	
	
	public static int getTotalOfEachCategory() {
		moneyClothesT = moneyClothes1 + moneyClothes2 + moneyClothes3 + moneyClothes4 + moneyClothes5 + moneyClothes6 + moneyClothes7 + moneyClothes8 + moneyClothes9 + moneyClothes10 + moneyClothes11 + moneyClothes12; 
		return moneyClothesT;
	}
	
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyClothes1 = SpendingController.cost;
				moneyClothes1 += newMoneyClothes1;
				break;
			case 2:
				newMoneyClothes2 = SpendingController.cost;
				moneyClothes2 += newMoneyClothes2;
				break;
			case 3:
				newMoneyClothes3 = SpendingController.cost;
				moneyClothes3 += newMoneyClothes3;
				break;
			case 4:
				newMoneyClothes4 = SpendingController.cost;
				moneyClothes4 += newMoneyClothes4;
				break;
			case 5:
				newMoneyClothes5 = SpendingController.cost;
				moneyClothes5 += newMoneyClothes5;
				break;
			case 6:
				newMoneyClothes6 = SpendingController.cost;
				moneyClothes6 += newMoneyClothes6;
				break;
			case 7:
				newMoneyClothes7 = SpendingController.cost;
				moneyClothes7 += newMoneyClothes7;
				break;
			case 8:
				newMoneyClothes8 = SpendingController.cost;
				moneyClothes8 += newMoneyClothes8;
				break;	
			case 9:
				newMoneyClothes9 = SpendingController.cost;
				moneyClothes9 += newMoneyClothes9;
				break;	
			case 10:
				newMoneyClothes10 = SpendingController.cost;
				moneyClothes10 += newMoneyClothes10;
				break;	
			case 11:
				newMoneyClothes11 = SpendingController.cost;
				moneyClothes11 += newMoneyClothes11;
				break;	
			case 12:
				newMoneyClothes12 = SpendingController.cost;
				moneyClothes12 += newMoneyClothes12;
				break;	
			default:
				break;	
		}
	}

	
	/**public static void getTotalOfEachCategoryOfEachMonth() {
		
		
	}**/

	

}
