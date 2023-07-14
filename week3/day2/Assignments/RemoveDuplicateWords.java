package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");

		for (String a : split) {
			System.out.println("The splitted value : " +a);
		}

		Set<String> set = new LinkedHashSet<String>();
		for (String each : split) {
			set.add(each);
		}

		System.out.println("The unique words are in array :" + set);
		String removeDuplicates = String.join(" ", set);
		System.out.println("Unique words in string : " +removeDuplicates);

	}
}

