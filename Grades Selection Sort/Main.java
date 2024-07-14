import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[][] studentTable = {
                {"Sarah", "90"},
                {"James", "86"},
                {"Tom", "74"},
                {"Jane", "79"},
                {"Sally", "95"},
                {"John", "93"},
                {"Jack", "64"},
                {"Julie", "53"},
                {"Yasmin", "80"},
                {"Frank", "61"}
        };

        selectionSort(studentTable);

        System.out.println("\nSorted Table (A-F):");
        displayTable(studentTable);

        printLetterGrade(studentTable);
    }

    // display table method
    private static void displayTable(String[][] table) {
        for (String[] row : table) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    // selecion sort in descending
    private static void selectionSort(String[][] table) {
        int n = table.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                int currentGrade = Integer.parseInt(table[j][1]);
                int maxGrade = Integer.parseInt(table[maxIndex][1]);

                if (currentGrade > maxGrade) {
                    maxIndex = j;
                }
            }

            String[] temp = table[i];
            table[i] = table[maxIndex];
            table[maxIndex] = temp;
        }
    }


    // number grade with their respective letter grade
    private static String letterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    private static void printLetterGrade(String[][] table) {
        Map<String, Integer> gradeCount = new HashMap<>();

        gradeCount.put("A", 0);
        gradeCount.put("B", 0);
        gradeCount.put("C", 0);
        gradeCount.put("D", 0);
        gradeCount.put("F", 0);

        for (String[] row : table) {
            int grade = Integer.parseInt(row[1]);
            String letterGrade = letterGrade(grade);
            gradeCount.put(letterGrade, gradeCount.get(letterGrade) + 1);
        }

        System.out.println("\nNumber of Each Letter Grade (A-F):");
        StringBuilder result = new StringBuilder();
        for (String grade : new String[]{"A", "B", "C", "D", "F"}) {
            result.append(gradeCount.get(grade));
        }
        System.out.println(result.toString());
    }
}


