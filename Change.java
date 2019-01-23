
public class Change {

	public static void main(String[] args) {
		Change i = new Change();
		for (double n = 0; n <= 1; n = n + .01){
			System.out.println(Math.round((n*100)));
			System.out.println(i.coins(n));
		}
	}
	
	public int coins(double change) {
		change = Math.round((change*100));
		double tempChange = change;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		while (tempChange >= 25) {
			tempChange = tempChange - 25;
			quarters = quarters + 1;
		}
		while (tempChange >= 10) {
			tempChange = tempChange - 10;
			dimes = dimes + 1;
		}
		while (tempChange >= 5) {
			tempChange = tempChange - 5;
			nickels = nickels + 1;
		}
		while (tempChange >= 1){
			tempChange = tempChange - 1;
			pennies = pennies + 1;
		}
		return quarters + dimes + nickels + pennies;
	}
}
