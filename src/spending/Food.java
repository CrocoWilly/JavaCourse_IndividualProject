package spending;

import application.SpendingController;

public class Food extends CategoryForSpending{
	
	public static int moneyFoodT = 0;
	
	public static int moneyFood1 = 0;
	public static int moneyFood2 = 0;
	public static int moneyFood3 = 0;
	public static int moneyFood4 = 0;
	public static int moneyFood5 = 0;
	public static int moneyFood6 = 0;
	public static int moneyFood7 = 0;
	public static int moneyFood8 = 0;
	public static int moneyFood9 = 0;
	public static int moneyFood10 = 0;
	public static int moneyFood11 = 0;
	public static int moneyFood12 = 0;
	
	public static int newMoneyFood1 = 0;
	public static int newMoneyFood2 = 0;
	public static int newMoneyFood3 = 0;
	public static int newMoneyFood4 = 0;
	public static int newMoneyFood5 = 0;
	public static int newMoneyFood6 = 0;
	public static int newMoneyFood7 = 0;
	public static int newMoneyFood8 = 0;
	public static int newMoneyFood9 = 0;
	public static int newMoneyFood10 = 0;
	public static int newMoneyFood11 = 0;
	public static int newMoneyFood12 = 0;
	
	
	public static int getTotalOfEachCategory() {
		moneyFoodT = moneyFood1 + moneyFood2 + moneyFood3 + moneyFood4 + moneyFood5 + moneyFood6 + moneyFood7 + moneyFood8 + moneyFood9 + moneyFood10 + moneyFood11 + moneyFood12;
		return moneyFoodT;
	}
	
	
	
	public static void addTotalOfMonth() {
		switch(SpendingController.month) 
		{
			case 1:
				newMoneyFood1 = SpendingController.cost;
				moneyFood1 += newMoneyFood1;
				break;
			case 2:
				newMoneyFood2 = SpendingController.cost;
				moneyFood2 += newMoneyFood2;
				break;
			case 3:
				newMoneyFood3 = SpendingController.cost;
				moneyFood3 += newMoneyFood3;
				break;
			case 4:
				newMoneyFood4 = SpendingController.cost;
				moneyFood4 += newMoneyFood4;
				break;
			case 5:
				newMoneyFood5 = SpendingController.cost;
				moneyFood5 += newMoneyFood5;
				break;
			case 6:
				newMoneyFood6 = SpendingController.cost;
				moneyFood6 += newMoneyFood6;
				break;
			case 7:
				newMoneyFood7 = SpendingController.cost;
				moneyFood7 += newMoneyFood7;
				break;
			case 8:
				newMoneyFood8 = SpendingController.cost;
				moneyFood8 += newMoneyFood8;
				break;	
			case 9:
				newMoneyFood9 = SpendingController.cost;
				moneyFood9 += newMoneyFood9;
				break;	
			case 10:
				newMoneyFood10 = SpendingController.cost;
				moneyFood10 += newMoneyFood10;
				break;	
			case 11:
				newMoneyFood11 = SpendingController.cost;
				moneyFood11 += newMoneyFood11;
				break;	
			case 12:
				newMoneyFood12 = SpendingController.cost;
				moneyFood12 += newMoneyFood12;
				break;	
			default:
				break;	
		}
	}

	
	/**public static void getTotalOfEachCategoryOfEachMonth() {
		if(SpendingController.month == 1)
			System.out.println(moneyFood1);
		else if(SpendingController.month == 2)
			System.out.println(moneyFood2);
		else if(SpendingController.month == 3)
			System.out.println(moneyFood3);
		else if(SpendingController.month == 4)
			System.out.println(moneyFood4);
		else if(SpendingController.month == 5)
			System.out.println(moneyFood5);
		else if(SpendingController.month == 6)
			System.out.println(moneyFood6);
		else if(SpendingController.month == 7)
			System.out.println(moneyFood7);
		else if(SpendingController.month == 8)
			System.out.println(moneyFood8);
		else if(SpendingController.month == 9)
			System.out.println(moneyFood9);
		else if(SpendingController.month == 10)
			System.out.println(moneyFood10);
		else if(SpendingController.month == 11)
			System.out.println(moneyFood11);
		else if(SpendingController.month == 12)
			System.out.println(moneyFood12);
		else {}
	}**/

	
	
}
