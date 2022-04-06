package lab;
import org.junit.*;
import static org.junit.Assert.assertEquals;

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
    public void testReturnInt() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("1");
        // Act
        // Assert
        assertEquals("sut.compute()", 1, sut.compute());
    }
    @Test
    public void testadd1and3() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("1 3 +");
        // Act
        // Assert
        assertEquals("sut.compute()", 4, sut.compute());
    }
    @Test
    public void test3minus1() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("3 1 -");
        // Act
        // Assert
        assertEquals("sut.compute()", 2, sut.compute());
    }
    @Test
    public void test3razy4() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("3 4 *");
        // Act
        // Assert
        assertEquals("sut.compute()", 12, sut.compute());
    }
    @Test
    public void testLongNumbers() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 -");
        // Act
        // Assert
        assertEquals("sut.compute()", 8, sut.compute());
    }
    @Test
    public void testLongNumbers2() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("32");
        // Act
        // Assert
        assertEquals("sut.compute()", 32, sut.compute());
    }
    @Test
    public void testMultipleOperations() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 - 5 +");
        // Act
        // Assert
        assertEquals("sut.compute()", 13, sut.compute());
    }
    @Test
    public void testMultipleOperations2() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("12 4 - 5 2 * +");
        // Act
        // Assert
        assertEquals("sut.compute()", 18, sut.compute());
    }
    @Test
    public void testMultipleOperations3() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("20 5 7 + -");
        // Act
        // Assert
        assertEquals("sut.compute()", 8, sut.compute());
    }
    @Test
    public void testMultipleOperations4() {
        // Arrange
        // sut = System Under Test
        Rpn sut = new Rpn("2 12 4 - * 5 +");
        // Act
        // Assert
        assertEquals("sut.compute()", 21, sut.compute());
    }

}