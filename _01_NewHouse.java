
public class _03_NewHouse {
	public static void newPrinter(String in, int lenght) {
		for (int i = 0; i < lenght; i++) {
			 System.out.print(in);
		}
		
		}
	public static void main(String[] args){
		
		int n = 7;
		String star = "*";
		String dash = "-";
		String pipe = "|";
		int roof = n/2 + 1;
		int starWay = 1;
		for (int i = 0; i < roof; i++) {
			newPrinter(dash, n/2 -i);
			newPrinter(star, starWay);
			starWay+=2;
			newPrinter(dash, n/2 -i);
			System.out.println();
		}	
		for (int i = 0; i < n; i++) {
			newPrinter(pipe, 1);
			newPrinter(star, n-2);
			newPrinter(pipe, 1);
			System.out.println();
		}
	}
}
		
