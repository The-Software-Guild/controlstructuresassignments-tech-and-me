package controlstructure;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char ch = 'M';
		switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("The character is a vowel.");
				break;
			default:
				System.out.println("The character is not a vowel.");			
		}

	}

}
