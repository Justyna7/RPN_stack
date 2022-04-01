/* Przygotuj testy jednostkowe dla klasy Stack. */

package lab;
import org.junit.*; //
import static org.junit.Assert.assertEquals;//

public class StackTest {
    @Test
    public void testEmpty() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        // Assert
        assertEquals("sut.len()", 0, sut.len());
    }
    @Test
    public void testAddOne() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        // Assert
        assertEquals("sut.push(\"ala\")", "ala", sut.peek());
    }
    @Test
    public void testAddOne2() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        // Assert
        assertEquals("sut.push(\"ala\")", 1, sut.len());
    }
    @Test
    public void testAddOne3() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        sut.push("zosia");
        // Assert
        assertEquals("sut.all()", "ala", sut.all()[0]);
    }
    @Test
    public void testAddOne4() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        sut.push("zosia");
        // Assert
        assertEquals("sut.all()", "zosia", sut.all()[1]);
    }
    @Test
    public void testTakeOne() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        // Assert
        assertEquals("sut.pop()", "ala", sut.pop());
    }
    @Test
    public void testTakeOne2() {
        // Arrange
        // sut = System Under Test
        Stack sut = new Stack();
        // Act
        sut.push("ala");
        sut.push("xxxx");
        sut.pop();
        // Assert
        assertEquals("sut.pop()", 1, sut.len());
    }
}