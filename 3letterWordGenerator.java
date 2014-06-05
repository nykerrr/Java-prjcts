import java.util.Scanner;

public class _02_Generate3LetterWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	  String input = in.next();
  	char[] arr = input.toCharArray();
	  int numsOfLetters = arr.length;
  	for (int i = 0; i < arr.length; i++) {
	  	for (int j = 0; j < arr.length; j++) {
		  	for (int k = 0; k < arr.length; k++) {
  				System.out.printf("%s%s%s ", arr[i],arr[j],arr[k]);
  			}
		}
	 }
	}
}
