import org.testng.annotations.Test;

public class WarmUp1Tests extends WarmUp1{
    @Test
    public void testWithData1() {
        String actualWord = missingChar("kitten", 4);
        String expectedWord = "kittn";
        if (actualWord.equals(expectedWord)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    @Test
    public void testWithData2() {
        String actualWord = missingChar("kitten", 1);
        String expectedWord = "ktten";
        if (actualWord.equals(expectedWord)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    @Test
    public void testWithData3() {
        String actualWord = missingChar("kitten", 0);
        String expectedWord = "itten";
        if (actualWord.equals(expectedWord)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
