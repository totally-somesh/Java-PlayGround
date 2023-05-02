package Testing;

import java.util.ArrayList;

public class TestAL {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<Integer> Numbers = new ArrayList<>();
		ArrayList<String> Strings = new ArrayList<>();
		ArrayList<Character> Characters = new ArrayList<>();

		int[] Data1 = { 2, 8, 90, -54 };
		String[] Data2 = { "Virat Kohli", "M S Dhoni", "R Jadeja", "Hardik Pandya" };
		Character[] Data3 = { 'A', 'B', 'C', 'D' };

		for (int I : Data1) {
			Numbers.add(I);
		}

		for (String S : Data2) {
			Strings.add(S);
		}

		for (char C : Data3) {
			Characters.add(C);
		}

		System.out.println(" | Numbers   ( ArrayList ) : " + Numbers);
		System.out.println(" | Strings   ( ArrayList ) : " + Strings);
		System.out.println(" | Charcters ( ArrayList ) : " + Characters);

	}

}
