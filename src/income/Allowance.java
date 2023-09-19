package income;

import application.IncomeController;

public class Allowance extends CategoryForIncome {

	public static int moneyAllowanceT;
	
	public static int moneyAllowance1;
	public static int moneyAllowance2;
	public static int moneyAllowance3;
	public static int moneyAllowance4;
	public static int moneyAllowance5;
	public static int moneyAllowance6;
	public static int moneyAllowance7;
	public static int moneyAllowance8;
	public static int moneyAllowance9;
	public static int moneyAllowance10;
	public static int moneyAllowance11;
	public static int moneyAllowance12;
	
	public static int newMoneyAllowance1;
	public static int newMoneyAllowance2;
	public static int newMoneyAllowance3;
	public static int newMoneyAllowance4;
	public static int newMoneyAllowance5;
	public static int newMoneyAllowance6;
	public static int newMoneyAllowance7;
	public static int newMoneyAllowance8;
	public static int newMoneyAllowance9;
	public static int newMoneyAllowance10;
	public static int newMoneyAllowance11;
	public static int newMoneyAllowance12;
	
	
	public static int getTotalOfEachCategory() {
		moneyAllowanceT = moneyAllowance1 + moneyAllowance2 + moneyAllowance3 + moneyAllowance4 + moneyAllowance5 + moneyAllowance6 + moneyAllowance7 + moneyAllowance8 + moneyAllowance9 + moneyAllowance10 + moneyAllowance11 + moneyAllowance12;
		return moneyAllowanceT;
	}
	
	public static void addTotalOfMonth() {
		switch(IncomeController.month) 
		{
			case 1:
				newMoneyAllowance1 = IncomeController.earn;
				moneyAllowance1 += newMoneyAllowance1;
				break;
			case 2:
				newMoneyAllowance2 = IncomeController.earn;
				moneyAllowance2 += newMoneyAllowance2;
				break;
			case 3:
				newMoneyAllowance3 = IncomeController.earn;
				moneyAllowance3 += newMoneyAllowance3;
				break;
			case 4:
				newMoneyAllowance4 = IncomeController.earn;
				moneyAllowance4 += newMoneyAllowance4;
				break;
			case 5:
				newMoneyAllowance5 = IncomeController.earn;
				moneyAllowance5 += newMoneyAllowance5;
				break;
			case 6:
				newMoneyAllowance6 = IncomeController.earn;
				moneyAllowance6 += newMoneyAllowance6;
				break;
			case 7:
				newMoneyAllowance7 = IncomeController.earn;
				moneyAllowance7 += newMoneyAllowance7;
				break;
			case 8:
				newMoneyAllowance8 = IncomeController.earn;
				moneyAllowance8 += newMoneyAllowance8;
				break;	
			case 9:
				newMoneyAllowance9 = IncomeController.earn;
				moneyAllowance9 += newMoneyAllowance9;
				break;	
			case 10:
				newMoneyAllowance10 = IncomeController.earn;
				moneyAllowance10 += newMoneyAllowance10;
				break;	
			case 11:
				newMoneyAllowance11 = IncomeController.earn;
				moneyAllowance11 += newMoneyAllowance11;
				break;	
			case 12:
				newMoneyAllowance12 = IncomeController.earn;
				moneyAllowance12 += newMoneyAllowance12;
				break;	
			default:
				break;	
		}
	}
	
}
