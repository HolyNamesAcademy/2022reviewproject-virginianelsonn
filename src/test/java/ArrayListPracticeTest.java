import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.*;

public class ArrayListPracticeTest {

    @Test
    public void GetFirst() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        int expected = 5;

        // Act
        int actual = ArrayListPractice.GetFirst(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetThird() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        int expected = 3;

        // Act
        int actual = ArrayListPractice.GetThird(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetLast() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        int expected = 10;

        // Act
        int actual = ArrayListPractice.GetLast(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetSum() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        int expected = 82;

        // Act
        int actual = ArrayListPractice.GetSum(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToString() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        String expected = "5 18 3 2 6 7 9 22 10";

        // Act
        String actual = ArrayListPractice.ConvertToString(numbers);

        // Assert
        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    public void GetMax() {
        // Arrange
        ArrayList<Integer> numbers = ArrayListPracticeMain.CreateIntegerArrayList();
        int expected = 22;

        // Act
        int actual = ArrayListPractice.GetMax(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateNumberArray() {
        // Arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(9, 10, 11, 12, 13, 14));

        // Act
        ArrayList<Integer> actual = ArrayListPractice.CreateNumberArray(9, 15);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateNumberArrayEmpty() {
        // Arrange
        ArrayList<Integer> expected = new ArrayList<>();

        // Act
        ArrayList<Integer> actual = ArrayListPractice.CreateNumberArray(13, 13);

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void GetFirstStudentWithFavoriteColor() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();
        Student expectedStudent = students.get(2);

        // Act
        Student actualStudent = ArrayListPractice.GetFirstStudentWithFavoriteColor(students, "yellow");

        // Assert
        assertEquals(expectedStudent, actualStudent);
    }

    @Test
    public void GetFavoriteColor() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();
        String expected = "purple";

        // Act
        String actual = ArrayListPractice.GetFavoriteColorOfStudent(students, "Daniel");

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetTallestStudent() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();
        Student expected = students.get(4);

        // Act
        Student actual = ArrayListPractice.GetTallestStudent(students);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateStudentArray() {
        // Arrange
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hannah", "Matthew", "Emma", "Andrew", "Ashley"));
        ArrayList<Integer> heights = new ArrayList<>(Arrays.asList(72, 66, 63, 70, 64));
        ArrayList<Integer> gradeLevels = new ArrayList<>(Arrays.asList(10, 10, 12, 11, 12));
        ArrayList<String> favoriteColors =  new ArrayList<>(Arrays.asList("yellow", "green", "orange", "green", "pink"));
        ArrayList<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
                new BankAccount("Hannah", 200),
                new BankAccount("Matthew", 250),
                new BankAccount("Emma", 186),
                new BankAccount("Andrew", 90),
                new BankAccount("Ashley", 80)
        ));

        // Act
        ArrayList<Student> students = ArrayListPractice.CreateStudentArray();

        // Assert
        ArrayList<Student> expected = new ArrayList<>(
                Arrays.asList(
                        new Student("Hannah", 72, 10, "yellow", new BankAccount("Hannah", 200)),
                        new Student("Matthew", 66, 10, "green", new BankAccount("Matthew", 250)),
                        new Student("Emma", 63, 12, "orange", new BankAccount("Emma", 186)),
                        new Student("Andrew", 70, 11, "green", new BankAccount("Andrew", 90)),
                        new Student("Ashley", 64, 12, "pink", new BankAccount("Ashley", 80))
                ));

        assertEquals(expected, students);
    }

    @Test
    public void GetTeamsString() {
        // Arrange
        ArrayList<ArrayList<Student>> teams = new ArrayList<>();
        teams.add(ArrayListPracticeMain.CreateStudentArrayListNoBankAccount(new String[]{"Emily", "Madison"}));
        teams.add(ArrayListPracticeMain.CreateStudentArrayListNoBankAccount(new String[]{"Jessica", "Joshua", "Daniel"}));
        teams.add(ArrayListPracticeMain.CreateStudentArrayListNoBankAccount(new String[]{"Michael"}));

        String expected =
               "Team 1: Emily, Madison\n" +
               "Team 2: Jessica, Joshua, Daniel\n" +
               "Team 3: Michael\n";

        // Act
        String actual = ArrayListPractice.GetTeamsString();

        // Assert
        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    public void UpdateFavoriteColor() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();

        // Act
        ArrayListPractice.UpdateFavoriteColor(students, "Jessica", "brown");

        // Assert
        assertEquals("brown", students.get(2).GetFavoriteColor());
    }

    @Test
    public void GetStudentsInGradeLevel() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayListNoBankAccount();

        // Act
        ArrayList<Student> output = ArrayListPractice.GetStudentsInGradeLevel(students, 11);

        // Assert
        assertEquals(students.get(0), output.get(0));
        assertEquals(students.get(2), output.get(1));
    }

    @Test
    public void TransferMoneySuccess() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Madison", 30);

        // Assert
        assertEquals(20, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertEquals(140, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertTrue(output);
    }

    @Test
    public void TransferMoneyFailure() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Madison", 80);

        // Assert
        assertEquals(50, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertEquals(110, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertFalse(output);
    }

    @Test
    public void TransferMoneyNegativeAmount() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Madison", -10);

        // Assert
        assertEquals(50, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertEquals(110, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertFalse(output);
    }

    @Test
    public void TransferMoneyNonExistentStudent() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Joe", "Madison", 10);

        // Assert
        assertEquals(110, students.get(5).GetBankAccount().GetBalance(), 0.1);
        assertFalse(output);
    }

    @Test
    public void TransferMoneyNonExistentStudent2() {
        // Arrange
        ArrayList<Student> students = ArrayListPracticeMain.CreateStudentArrayList();

        // Act
        boolean output = ArrayListPractice.TransferMoney(students, "Michael", "Joe", 10);

        // Assert
        assertEquals(50, students.get(3).GetBankAccount().GetBalance(), 0.1);
        assertFalse(output);
    }
}
