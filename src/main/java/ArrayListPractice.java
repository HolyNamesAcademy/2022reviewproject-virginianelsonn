import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Get the first element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The first element in the list.
     */
    public static int GetFirst(ArrayList<Integer> numbers) {
        return numbers.get(0);
    }

    /**
     * Get the third element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The third element in the list.
     */
    public static int GetThird(ArrayList<Integer> numbers) {
        return numbers.get(2);
    }

    /**
     * Get the last element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The last element in the list.
     */
    public static int GetLast(ArrayList<Integer> numbers) {
        return numbers.size()-1;
    }

    /**
     * Get the sum of all elements in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The sum of the elements in the list.
     */
    public static int GetSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Returns a string that contains all the numbers in the ArrayList
     * separated by one space.
     * <p>
     * For example, if numbers = {1, 4, 3, 2, 6}, your output should
     * be "1 4 3 2 6".
     * 
     * @param numbers List of numbers to search over.
     * @return A string representing the list.
     */
    public static String ConvertToString(ArrayList<Integer> numbers) {
StringBuilder numberList = new StringBuilder();
        for(int i = 0; i <numbers.size() - 1; i++)
            numberList.append(numbers.get(i)).append(" ");
        numberList.append(numbers.get(numbers.size() - 1)); return numberList.toString();
    }

    /**
     * Returns the largest element in the array
     * 
     * @param numbers List of numbers to search over.
     * @return The largest element in the list.
     */
    public static int GetMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for(Integer num: numbers)
        {
            if(num>max)
                max = num;
        }
        return max;
    }

    /**
     * Creates an array of continuous numbers represented by the range [first, last).
     * Include the first element, but not the last one.
     * If the first and last elements are the same, then the list should be empty.
     * If the last number is less than the first, then the list should also be empty.
     *
     * For example:
     *  CreateNumberArray(4, 8) returns {4, 5, 6, 7}
     *  CreateNumberArray(2, 2) returns {} (an empty list)
     * 
     * @param first The first number in the list (inclusive).
     * @param last The last number in the list (exclusive).
     * @return A list of all numbers between first and last.
     */
    public static ArrayList<Integer> CreateNumberArray(int first, int last) {
        ArrayList<Integer> newArray = new ArrayList<>();
        if (first == last)
            return newArray;
        if (last < first)
            return newArray;
        else
        {
            for (int i = first; i < last; i++) {
                int num = newArray.get(i);
                newArray.add(num);
            }
        return newArray;
        }
    }

    /**
     * Finds the first student whose favorite color is the one specified.
     *
     * @param students The list of students to search over.
     * @param color The favorite color the student must have.
     * @return The first student whose favorite color is the one specified.
     */
    public static Student GetFirstStudentWithFavoriteColor(ArrayList<Student> students, String color) {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).equals(color))
                return students.get(i);
        }
        return students.get(1);
    }

    /**
     * Gets the favorite color for a specified student.
     *
     * @param students The list of students to search over.
     * @param name The name of the student to look for.
     * @return The favorite color of the specified student.
     */
    public static String GetFavoriteColorOfStudent(ArrayList<Student> students, String name) {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).equals(name))
                return students.get(i).GetFavoriteColor();
        }
        return "Couldn't find student";
    }

    /**
     * Finds the tallest student.
     *
     * @param students The list of students to search over.
     * @return The tallest student in the list.
     */
    public static Student GetTallestStudent(ArrayList<Student> students) {
        int max = students.get(0).GetHeight();
        int index = 0;
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).GetHeight()>max){
                max = students.get(i).GetHeight();
                index = i;
            }
            return students.get(index);
        }
        return students.get(0);
    }

    /**
     *  Creates an array of Student objects using the information provided in via the parameters.
     * (names[0], heights[0] ...) are for the first student. (names[1], height[1]...)
     * are for the second student, etc.
     * 
     * @return List of Student objects.
     */
    public static ArrayList<Student> CreateStudentArray() {

        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a string that lists teams from a 2-D ArrayList. Each ArrayList in
     * the bigger ArrayList contains members of the team.
     * <p>
     * The expected output looks like this:
     * Team 1: Amy, Abby, Arnold
     * Team 2: Bob, Beatrice, Becky, Ben
     * Team 3: Claire
     * 
     * @return A string that lists the team number followed by each team.
     */
    public static String GetTeamsString() {

        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }

    /**
     * Finds the student with the given name, and updates their favorite color to the given color.
     *
     * @param students The list of students to search over.
     * @param name The name of the student whose favorite color should be updated.
     * @param newFavoriteColor The new favorite color of the student.
     */
    public static void UpdateFavoriteColor(ArrayList<Student> students, String name, String newFavoriteColor) {
        for(int i = 0; i<students.size(); i++)
        {
            if(students.get(i).GetName().equals(name)){
                students.get(i).SetFavoriteColor(newFavoriteColor);
            }
        }
    }

    /**
     * Create an ArrayList consisting of all students in the given grade level.
     *
     * @param students The list of students to search over.
     * @param gradeLevel The grade level the students should be in.
     * @return An ArrayList containing all the students in gradeLevel.
     */
    public static ArrayList<Student> GetStudentsInGradeLevel(ArrayList<Student> students, int gradeLevel) {
       ArrayList<Student> newArray = new ArrayList<Student>();
        for(int i = 0; i<students.size(); i++)
        {
            if(students.get(i).GetGradeLevel() == gradeLevel)
            {
                newArray.add(students.get(i));
            }
        }
        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }

    /**
     * Transfer money from one student to another.
     *
     * @param students A list of students.
     * @param fromStudentName The name of the student to transfer money from.
     * @param toStudentName The name of the student to transfer money to.
     * @param amount The amount of money to transfer.
     * @return true if the transfer was successful, i.e. the student to transfer money from
     *     had sufficient funds in their account. Otherwise, false.
     */
    public static boolean TransferMoney(ArrayList<Student> students, String fromStudentName, String toStudentName, double amount) {
        for(int i = 0; i<students.size(); i++)
        {
            if(students.get(i).GetName().equals(fromStudentName)) {
                if (students.get(i).GetBankAccount().GetBalance() < amount) {
                    students.get(i).GetBankAccount().Withdraw(amount);
                }

                if (students.get(i).GetName().equals(toStudentName)) {
                    students.get(i).GetBankAccount().Deposit(amount);
                    return true;
                }
            }
            return false;

        }

        // write your code above and remove the line below
        throw new UnsupportedOperationException();
    }

    /**
     * EXTRA CREDIT:
     * Increments everyone's grade level by one. If a student is in 12th grade, remove them from the array.
     *
     * @param students The list of students to advance to the next grade.
     */
    public static void UpdateGradeLevels(ArrayList<Student> students) {
        for(int i = 0; i<students.size(); i++)
        {
            if(students.get(i).GetGradeLevel() < 12)
            {
                int grade = students.get(i).GetGradeLevel();
                students.get(i).SetGradeLevel(grade++);
            }
            else
                students.remove(i);

        }
    }

    /**
     * EXTRA CREDIT:
     * Sort the array list by increasing grade level (all the 9th graders, then 10th graders, etc)
     * If there is a tie (aka 2 people in the same grade), the person whose name is first in the
     * alphabet should appear first.
     *
     * @param students The list of students to sort.
     */
    public static void SortByGradeAndName(ArrayList<Student> students) {
                for (int i = 0; i < students.size() - 1; i++)
                {
                    int index = i;
                    for (int j = i + 1; j < students.size(); j++){
                        if (students.get(j).GetGradeLevel() < students.get(index).GetGradeLevel()){
                            index = j;//searching for lowest index
                        }
                    }
                    int smallerNumber = students.get(index).GetGradeLevel();

                }
            }


    }

