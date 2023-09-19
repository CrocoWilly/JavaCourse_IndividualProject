package spending;

import application.SpendingController;

public class Health extends CategoryForSpending {
	
	public static int moneyHealthT;
	
	public static int moneyHealth1;
	public static int moneyHealth2;
	public static int moneyHealth3;
	public static int moneyHealth4;
	public static int moneyHealth5;
	public static int moneyHealth6;
	public static int moneyHealth7;
	public static int moneyHealth8;
	public static int moneyHealth9;
	public static int moneyHealth10;
	public static int moneyHealth11;
	public static int moneyHealth12;
	
	public static int newMoneyHealth1;
	public static int newMoneyHealth2;
	public static int newMoneyHealth3;
	public static int newMoneyHealth4;
	public static int newMoneyHealth5;
	public static int newMoneyHealth6;
	public static int newMoneyHealth7;
	public static int newMoneyHealth8;
	public static int newMoneyHealth9;
	public static int newMoneyHealth10;
	public static int newMoneyHealth11;
	public static int newMoneyHealth12;
	
	
	public static int getTotalOfEachCategory() {
		moneyHealthT = moneyHealth1 + moneyHealth2 + moneyHealth3 + moneyHealth4 + moneyHealth5 + moneyHealth6 + moneyHealth7 + moneyHealth8 + moneyHealth9 + moneyHealth10 + moneyHealth11 + moneyHealth12;
		return moneyHealthT;
	}
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyHealth1 = SpendingController.cost;
				moneyHealth1 += newMoneyHealth1;
				break;
			case 2:
				newMoneyHealth2 = SpendingController.cost;
				moneyHealth2 += newMoneyHealth2;
				break;
			case 3:
				newMoneyHealth3 = SpendingController.cost;
				moneyHealth3 += newMoneyHealth3;
				break;
			case 4:
				newMoneyHealth4 = SpendingController.cost;
				moneyHealth4 += newMoneyHealth4;
				break;
			case 5:
				newMoneyHealth5 = SpendingController.cost;
				moneyHealth5 += newMoneyHealth5;
				break;
			case 6:
				newMoneyHealth6 = SpendingController.cost;
				moneyHealth6 += newMoneyHealth6;
				break;
			case 7:
				newMoneyHealth7 = SpendingController.cost;
				moneyHealth7 += newMoneyHealth7;
				break;
			case 8:
				newMoneyHealth8 = SpendingController.cost;
				moneyHealth8 += newMoneyHealth8;
				break;	
			case 9:
				newMoneyHealth9 = SpendingController.cost;
				moneyHealth9 += newMoneyHealth9;
				break;	
			case 10:
				newMoneyHealth10 = SpendingController.cost;
				moneyHealth10 += newMoneyHealth10;
				break;	
			case 11:
				newMoneyHealth11 = SpendingController.cost;
				moneyHealth11 += newMoneyHealth11;
				break;	
			case 12:
				newMoneyHealth12 = SpendingController.cost;
				moneyHealth12 += newMoneyHealth12;
				break;	
			default:
				break;	
		}
	}
	
}
