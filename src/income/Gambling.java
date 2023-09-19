package income;

import application.IncomeController;

public class Gambling extends CategoryForIncome {

	public static int moneyGamblingT;
	
	public static int moneyGambling1;
	public static int moneyGambling2;
	public static int moneyGambling3;
	public static int moneyGambling4;
	public static int moneyGambling5;
	public static int moneyGambling6;
	public static int moneyGambling7;
	public static int moneyGambling8;
	public static int moneyGambling9;
	public static int moneyGambling10;
	public static int moneyGambling11;
	public static int moneyGambling12;
	
	public static int newMoneyGambling1;
	public static int newMoneyGambling2;
	public static int newMoneyGambling3;
	public static int newMoneyGambling4;
	public static int newMoneyGambling5;
	public static int newMoneyGambling6;
	public static int newMoneyGambling7;
	public static int newMoneyGambling8;
	public static int newMoneyGambling9;
	public static int newMoneyGambling10;
	public static int newMoneyGambling11;
	public static int newMoneyGambling12;
	
	
	public static int getTotalOfEachCategory() {
		moneyGamblingT = moneyGambling1 + moneyGambling2 + moneyGambling3 + moneyGambling4 + moneyGambling5 + moneyGambling6 + moneyGambling7 + moneyGambling8 + moneyGambling9 + moneyGambling10 + moneyGambling11 + moneyGambling12;
		return moneyGamblingT;
	}
	
	public static void addTotalOfMonth() {
		switch(IncomeController.month) 
		{
			case 1:
				newMoneyGambling1 = IncomeController.earn;
				moneyGambling1 += newMoneyGambling1;
				break;
			case 2:
				newMoneyGambling2 = IncomeController.earn;
				moneyGambling2 += newMoneyGambling2;
				break;
			case 3:
				newMoneyGambling3 = IncomeController.earn;
				moneyGambling3 += newMoneyGambling3;
				break;
			case 4:
				newMoneyGambling4 = IncomeController.earn;
				moneyGambling4 += newMoneyGambling4;
				break;
			case 5:
				newMoneyGambling5 = IncomeController.earn;
				moneyGambling5 += newMoneyGambling5;
				break;
			case 6:
				newMoneyGambling6 = IncomeController.earn;
				moneyGambling6 += newMoneyGambling6;
				break;
			case 7:
				newMoneyGambling7 = IncomeController.earn;
				moneyGambling7 += newMoneyGambling7;
				break;
			case 8:
				newMoneyGambling8 = IncomeController.earn;
				moneyGambling8 += newMoneyGambling8;
				break;	
			case 9:
				newMoneyGambling9 = IncomeController.earn;
				moneyGambling9 += newMoneyGambling9;
				break;	
			case 10:
				newMoneyGambling10 = IncomeController.earn;
				moneyGambling10 += newMoneyGambling10;
				break;	
			case 11:
				newMoneyGambling11 = IncomeController.earn;
				moneyGambling11 += newMoneyGambling11;
				break;	
			case 12:
				newMoneyGambling12 = IncomeController.earn;
				moneyGambling12 += newMoneyGambling12;
				break;	
			default:
				break;	
		}
	}
	
}
