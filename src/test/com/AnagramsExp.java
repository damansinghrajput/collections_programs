package test.com;

import java.util.Arrays;

public class AnagramsExp {
	private String str1;
	private String str2;
	
	
	
	public boolean areAnagrams(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return false;

		}

		String name1 = str1.toLowerCase();
		String name2 = str2.toLowerCase();

		if (name1.length() != name2.length()) {

			return false;

		}

		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		for (int i = 0; i < str1.length(); i++) {

			if (char1[i] == char2[i]) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) {
		AnagramsExp run = new AnagramsExp();

		System.out.println(run.areAnagrams("and", ""));

	}

}
