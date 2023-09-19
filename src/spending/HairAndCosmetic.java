package spending;

import application.SpendingController;

public class HairAndCosmetic extends CategoryForSpending{
	
	public static int moneyHairT;
	
	public static int moneyHair1;
	public static int moneyHair2;
	public static int moneyHair3;
	public static int moneyHair4;
	public static int moneyHair5;
	public static int moneyHair6;
	public static int moneyHair7;
	public static int moneyHair8;
	public static int moneyHair9;
	public static int moneyHair10;
	public static int moneyHair11;
	public static int moneyHair12;
	
	public static int newMoneyHair1;
	public static int newMoneyHair2;
	public static int newMoneyHair3;
	public static int newMoneyHair4;
	public static int newMoneyHair5;
	public static int newMoneyHair6;
	public static int newMoneyHair7;
	public static int newMoneyHair8;
	public static int newMoneyHair9;
	public static int newMoneyHair10;
	public static int newMoneyHair11;
	public static int newMoneyHair12;
	
	
	public static int getTotalOfEachCategory() {
		moneyHairT = moneyHair1 + moneyHair2 + moneyHair3 + moneyHair4 + moneyHair5 + moneyHair6 + moneyHair7 + moneyHair8 + moneyHair9 + moneyHair10 + moneyHair11 + moneyHair12;
		return moneyHairT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyHair1 = SpendingController.cost;
				moneyHair1 += newMoneyHair1;
				break;
			case 2:
				newMoneyHair2 = SpendingController.cost;
				moneyHair2 += newMoneyHair2;
				break;
			case 3:
				newMoneyHair3 = SpendingController.cost;
				moneyHair3 += newMoneyHair3;
				break;
			case 4:
				newMoneyHair4 = SpendingController.cost;
				moneyHair4 += newMoneyHair4;
				break;
			case 5:
				newMoneyHair5 = SpendingController.cost;
				moneyHair5 += newMoneyHair5;
				break;
			case 6:
				newMoneyHair6 = SpendingController.cost;
				moneyHair6 += newMoneyHair6;
				break;
			case 7:
				newMoneyHair7 = SpendingController.cost;
				moneyHair7 += newMoneyHair7;
				break;
			case 8:
				newMoneyHair8 = SpendingController.cost;
				moneyHair8 += newMoneyHair8;
				break;	
			case 9:
				newMoneyHair9 = SpendingController.cost;
				moneyHair9 += newMoneyHair9;
				break;	
			case 10:
				newMoneyHair10 = SpendingController.cost;
				moneyHair10 += newMoneyHair10;
				break;	
			case 11:
				newMoneyHair11 = SpendingController.cost;
				moneyHair11 += newMoneyHair11;
				break;	
			case 12:
				newMoneyHair12 = SpendingController.cost;
				moneyHair12 += newMoneyHair12;
				break;	
			default:
				break;	
		}
	}
	
}
