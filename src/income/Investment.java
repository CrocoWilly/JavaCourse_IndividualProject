package income;

import application.IncomeController;

public class Investment extends CategoryForIncome {

	public static int moneyInvestT;
	
	public static int moneyInvest1;
	public static int moneyInvest2;
	public static int moneyInvest3;
	public static int moneyInvest4;
	public static int moneyInvest5;
	public static int moneyInvest6;
	public static int moneyInvest7;
	public static int moneyInvest8;
	public static int moneyInvest9;
	public static int moneyInvest10;
	public static int moneyInvest11;
	public static int moneyInvest12;
	
	public static int newMoneyInvest1;
	public static int newMoneyInvest2;
	public static int newMoneyInvest3;
	public static int newMoneyInvest4;
	public static int newMoneyInvest5;
	public static int newMoneyInvest6;
	public static int newMoneyInvest7;
	public static int newMoneyInvest8;
	public static int newMoneyInvest9;
	public static int newMoneyInvest10;
	public static int newMoneyInvest11;
	public static int newMoneyInvest12;
	
	
	public static int getTotalOfEachCategory() {
		moneyInvestT = moneyInvest1 + moneyInvest2 + moneyInvest3 + moneyInvest4 + moneyInvest5 + moneyInvest6 + moneyInvest7 + moneyInvest8 + moneyInvest9 + moneyInvest10 + moneyInvest11 + moneyInvest12;
		return moneyInvestT;
	}
	
	public static void addTotalOfMonth() {
		switch(IncomeController.month) 
		{
			case 1:
				newMoneyInvest1 = IncomeController.earn;
				moneyInvest1 += newMoneyInvest1;
				break;
			case 2:
				newMoneyInvest2 = IncomeController.earn;
				moneyInvest2 += newMoneyInvest2;
				break;
			case 3:
				newMoneyInvest3 = IncomeController.earn;
				moneyInvest3 += newMoneyInvest3;
				break;
			case 4:
				newMoneyInvest4 = IncomeController.earn;
				moneyInvest4 += newMoneyInvest4;
				break;
			case 5:
				newMoneyInvest5 = IncomeController.earn;
				moneyInvest5 += newMoneyInvest5;
				break;
			case 6:
				newMoneyInvest6 = IncomeController.earn;
				moneyInvest6 += newMoneyInvest6;
				break;
			case 7:
				newMoneyInvest7 = IncomeController.earn;
				moneyInvest7 += newMoneyInvest7;
				break;
			case 8:
				newMoneyInvest8 = IncomeController.earn;
				moneyInvest8 += newMoneyInvest8;
				break;	
			case 9:
				newMoneyInvest9 = IncomeController.earn;
				moneyInvest9 += newMoneyInvest9;
				break;	
			case 10:
				newMoneyInvest10 = IncomeController.earn;
				moneyInvest10 += newMoneyInvest10;
				break;	
			case 11:
				newMoneyInvest11 = IncomeController.earn;
				moneyInvest11 += newMoneyInvest11;
				break;	
			case 12:
				newMoneyInvest12 = IncomeController.earn;
				moneyInvest12 += newMoneyInvest12;
				break;	
			default:
				break;	
		}
	}
}
