import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class PracticeProblemTest {

    // --- 1. createIntArray() ---

    @Test
    @DisplayName("createIntArray: Check values and length")
    void createIntArrayTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Method method = testClass.getDeclaredMethod("createIntArray");
            int[] result = (int[]) method.invoke(null);
            int[] expected = {1, 2, 3, 4, 5};
            assertArrayEquals(expected, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 2. createArray() ---

    @Test
    @DisplayName("createArray: Set 1 (Standard Strings)")
    void createArrayTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String.class, String.class, String.class };
            Method method = testClass.getDeclaredMethod("createArray", cArg);
            String[] expected = {"A", "B", "C", "D"};
            assertArrayEquals(expected, (String[]) method.invoke(null, "A", "B", "C", "D"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("createArray: Set 2 (Randomized Strings)")
    void createArrayTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String.class, String.class, String.class };
            Method method = testClass.getDeclaredMethod("createArray", cArg);
            String[] expected = {"Apple", "Banana", "Cherry", "Dragonfruit"};
            assertArrayEquals(expected, (String[]) method.invoke(null, "Apple", "Banana", "Cherry", "Dragonfruit"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 4. getElement() ---

    @Test
    @DisplayName("getElement: Check first index (0)")
    void getElementTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, String[].class };
            Method method = testClass.getDeclaredMethod("getElement", cArg);
            String[] arr = {"Red", "Blue", "Green"};
            assertEquals("Red", (String) method.invoke(null, 0, (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getElement: Check middle index")
    void getElementTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, String[].class };
            Method method = testClass.getDeclaredMethod("getElement", cArg);
            String[] arr = {"Dog", "Cat", "Bird", "Fish"};
            assertEquals("Bird", (String) method.invoke(null, 2, (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getElement: Check last index")
    void getElementTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, String[].class };
            Method method = testClass.getDeclaredMethod("getElement", cArg);
            String[] arr = {"One", "Two"};
            assertEquals("Two", (String) method.invoke(null, 1, (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 5. replaceElement() ---

    @Test
    @DisplayName("replaceElement: Replace first element")
    void replaceElementTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, double.class, double[].class };
            Method method = testClass.getDeclaredMethod("replaceElement", cArg);
            double[] arr = {1.5, 2.5, 3.5};
            method.invoke(null, 0, 9.9, arr);
            assertEquals(9.9, arr[0], 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("replaceElement: Replace middle element")
    void replaceElementTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, double.class, double[].class };
            Method method = testClass.getDeclaredMethod("replaceElement", cArg);
            double[] arr = {10.0, 20.0, 30.0, 40.0};
            method.invoke(null, 2, 77.7, arr);
            assertEquals(77.7, arr[2], 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("replaceElement: Replace last element")
    void replaceElementTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, double.class, double[].class };
            Method method = testClass.getDeclaredMethod("replaceElement", cArg);
            double[] arr = {0.1, 0.2};
            method.invoke(null, 1, 5.5, arr);
            assertEquals(5.5, arr[1], 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}
