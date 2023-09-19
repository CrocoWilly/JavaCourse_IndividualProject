package income;

import application.IncomeController;

public class Wage extends CategoryForIncome {

	public static int moneyWageT;
	
	public static int moneyWage1;
	public static int moneyWage2;
	public static int moneyWage3;
	public static int moneyWage4;
	public static int moneyWage5;
	public static int moneyWage6;
	public static int moneyWage7;
	public static int moneyWage8;
	public static int moneyWage9;
	public static int moneyWage10;
	public static int moneyWage11;
	public static int moneyWage12;
	
	public static int newMoneyWage1;
	public static int newMoneyWage2;
	public static int newMoneyWage3;
	public static int newMoneyWage4;
	public static int newMoneyWage5;
	public static int newMoneyWage6;
	public static int newMoneyWage7;
	public static int newMoneyWage8;
	public static int newMoneyWage9;
	public static int newMoneyWage10;
	public static int newMoneyWage11;
	public static int newMoneyWage12;
	
	
	public static int getTotalOfEachCategory() {
		moneyWageT = moneyWage1 + moneyWage2 + moneyWage3 + moneyWage4 + moneyWage5 + moneyWage6 + moneyWage7 + moneyWage8 + moneyWage9 + moneyWage10 + moneyWage11 + moneyWage12;
		return moneyWageT;
	}
	
	public static void addTotalOfMonth() {
		switch(IncomeController.month) 
		{
			case 1:
				newMoneyWage1 = IncomeController.earn;
				moneyWage1 += newMoneyWage1;
				break;
			case 2:
				newMoneyWage2 = IncomeController.earn;
				moneyWage2 += newMoneyWage2;
				break;
			case 3:
				newMoneyWage3 = IncomeController.earn;
				moneyWage3 += newMoneyWage3;
				break;
			case 4:
				newMoneyWage4 = IncomeController.earn;
				moneyWage4 += newMoneyWage4;
				break;
			case 5:
				newMoneyWage5 = IncomeController.earn;
				moneyWage5 += newMoneyWage5;
				break;
			case 6:
				newMoneyWage6 = IncomeController.earn;
				moneyWage6 += newMoneyWage6;
				break;
			case 7:
				newMoneyWage7 = IncomeController.earn;
				moneyWage7 += newMoneyWage7;
				break;
			case 8:
				newMoneyWage8 = IncomeController.earn;
				moneyWage8 += newMoneyWage8;
				break;	
			case 9:
				newMoneyWage9 = IncomeController.earn;
				moneyWage9 += newMoneyWage9;
				break;	
			case 10:
				newMoneyWage10 = IncomeController.earn;
				moneyWage10 += newMoneyWage10;
				break;	
			case 11:
				newMoneyWage11 = IncomeController.earn;
				moneyWage11 += newMoneyWage11;
				break;	
			case 12:
				newMoneyWage12 = IncomeController.earn;
				moneyWage12 += newMoneyWage12;
				break;	
			default:
				break;	
		}
	}
}
