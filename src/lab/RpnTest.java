package lab;
import org.junit.*;

import static org.junit.Assert.*;

public class RpnTest {
    @Test
    public void testPrintRpn() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("1 3 +");
        // Act
        // Assert
        assertEquals("sut.printRpn()", "1 3 +", sut.printRpn());
    }
    @Test
    public void testReturnInt() throws Exception{
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("1");
        // Act
        // Assert

        assertEquals("sut.compute()", 1, sut.compute());
    }
    @Test
    public void testadd1and3() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("1 3 +");
        // Act
        // Assert

        assertEquals("sut.compute()", 4, sut.compute());
    }
    @Test
    public void test3minus1() throws Exception  {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("3 1 -");
        // Act
        // Assert
        assertEquals("sut.compute()", 2, sut.compute());
    }
    @Test
    public void test3razy4() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("3 4 *");
        // Act
        // Assert
        assertEquals("sut.compute()", 12, sut.compute());
    }
    @Test
    public void testLongNumbers() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 -");
        // Act
        // Assert
        assertEquals("sut.compute()", 8, sut.compute());
    }
    @Test
    public void testLongNumbers2() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("32");
        // Act
        // Assert
        assertEquals("sut.compute()", 32, sut.compute());
    }
    @Test
    public void testMultipleOperations() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 - 5 +");
        // Act
        // Assert
        assertEquals("sut.compute()", 13, sut.compute());
    }
    @Test
    public void testMultipleOperations2() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 - 5 2 * +");
        // Act
        // Assert
        assertEquals("sut.compute()", 18, sut.compute());
    }
    @Test
    public void testMultipleOperations3() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("20 5 7 + -");
        // Act
        // Assert
        assertEquals("sut.compute()", 8, sut.compute());
    }
    @Test
    public void testMultipleOperations4() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("2 12 4 - * 5 +");
        // Act
        // Assert
        assertEquals("sut.compute()", 21, sut.compute());
    }
    @Test
    public void testUnsupportedOperation() throws Exception {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("2 12 4 - / 5 +");
        Exception exception = assertThrows(Exception.class, sut::compute);
        String expectedMessage = "Niepoprawny operator";
        String actualMessage = exception.getMessage();
        // Act
        // Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }
}