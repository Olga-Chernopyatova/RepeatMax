package multimaxi;

import java.util.Arrays;

public class MultiMaxi {

	public static void main(String[] args) {
		String[] mult = "Lorem, ipsum, dolor, consectetur, eiusmod, tempor, incididunt, Lorem, Lorem, ipsum, dolor".split(" ");
		Arrays.sort(mult);

		String maxWord = "", word = "";
		int maxCount = 0, count = 1;

		for (String s : mult) {
		    if (s.equals(word)) {
		        count++;
		    } else {
		        if (count > maxCount) {
		            maxCount = count;
		            maxWord = word;
		        }
		        word = s;
		        count = 1;
		    }
		}

		if (count > maxCount) {
		    maxCount = count;
		    maxWord = word;
		}

		System.out.println("—амое повтор€ющеес€ слово: " + maxWord + " (встречаетс€ " + maxCount + " раз)");

	}

}
