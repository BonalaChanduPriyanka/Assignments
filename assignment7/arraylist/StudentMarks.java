package assignment7.arraylist;

import java.util.*;

public class StudentMarks {

	public static void main(String[] args) {
		List<Float> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students");
		Integer n = sc.nextInt();
		System.out.println("enter marks");
		for (int i = 0; i < n; i++) {
			Float input = sc.nextFloat();
			list.add(input);
		}

		if (list.size() == 0) {
			System.out.println("No average.");

		}

		else {
			double total = 0;

			System.out.println("Highest marks : " + Collections.max(list));
			for (double element : list) {
				total = total + element;
			}
			double average = total / list.size();;
			// list.size();
			System.out.println("Average marks : " + average);
			System.out.println("Marks :"+"1-"+ list.get(0)+"\t2-"+list.get(1)+"\t3-"+list.get(2)+"\t4-"+list.get(3));
			System.out.println("3rd student marks : " + list.get(2));
			Collections.sort(list); 
			System.out.println("Sorted : " + list);
		}
	}

}
