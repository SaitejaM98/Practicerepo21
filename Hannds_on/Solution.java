import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Student_marksRows = Integer.parseInt(s.next().trim());
		int Student_marksColumns = Integer.parseInt(s.next().trim());
		int[][] Student_marks = new int[Student_marksRows][Student_marksColumns];
		for (int i = 0; i < Student_marksRows; i++) {
			for (int j = 0; j < Student_marksColumns; j++) {
				Student_marks[i][j] = Integer.parseInt(s.next().trim());
			}
		}
		String[] result = Result.CalculateGrade(Student_marks);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}

class Result {
	public static String[] CalculateGrade(int[][] Student_marks) {
		int n = Student_marks.length;
		String result[] = new String[n];
		for (int i = 0; i < n; i++){
			float avg = 0;
			for (int j = 0; j < 5; j++) {
				avg += Student_marks[i][j];
				avg = avg / 5;
				if (avg >= 90) {
					result[i] = "A+";
				} else if (avg >= 80) {
					result[i] = "A";
				} else if (avg >= 70) {
					result[i] = "B";
				} else if (avg >= 60) {
					result[i] = "c";
				} else if (avg >= 50) {
					result[i] = "D";
				} else {
					result[i] = "F";
				}

			}
			
			//return result;
		}
		//return result;
		return result;
	}
}
