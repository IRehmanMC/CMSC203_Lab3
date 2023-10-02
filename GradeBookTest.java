import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;
    
	@BeforeEach
	void setUp() throws Exception {
        gradeBook1 = new GradeBook(5);
        gradeBook1.addScore(90);
        gradeBook1.addScore(80);
        gradeBook1.addScore(70);
        
        gradeBook2 = new GradeBook(5);
        gradeBook2.addScore(60);
        gradeBook2.addScore(50);
        gradeBook2.addScore(40);
	}

	@AfterEach
	void tearDown() throws Exception {
	    gradeBook1 = null;
	    gradeBook2 = null;
	}

	@Test
	void testAddScore() {
		GradeBook gradeBook1;
		gradeBook1 = new GradeBook(3);
		gradeBook1.addScore(90);
		gradeBook1.addScore(85);
		gradeBook1.addScore(78);
	    int[] expectedScores = {90, 85, 78};
	    String[] parts = gradeBook1.toString().split(" ");
        int[] intArray = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            intArray[i] = Integer.parseInt(parts[i]);
        }
	    assertArrayEquals(expectedScores, intArray);
	    int expectedSize = 3;
	    assertEquals(expectedSize, gradeBook1.getScoreSize());
	}

	@Test
	void testSum() {
		GradeBook gradeBook1;
		gradeBook1 = new GradeBook(3);
		gradeBook1.addScore(90);
	    gradeBook1.addScore(85);
	    gradeBook1.addScore(78);
	    int expectedSum = 90 + 85 + 78; 
	    assertEquals(expectedSum, gradeBook1.sum());
	}

	@Test
	void testMinimum() {
		GradeBook gradeBook1;
		gradeBook1 = new GradeBook(3);
		gradeBook1.addScore(90);
	    gradeBook1.addScore(85);
	    gradeBook1.addScore(78);
	    int expectedMinimum = 78;
	    assertEquals(expectedMinimum, gradeBook1.minimum());
	}

	@Test
	void testFinalScore() {
		GradeBook gradeBook1;
		gradeBook1 = new GradeBook(3);
		assertEquals(0, gradeBook1.finalScore());
		gradeBook1.addScore(90);
	    gradeBook1.addScore(85);
	    gradeBook1.addScore(78);
	    assertEquals(175, gradeBook1.finalScore());
	    gradeBook1.addScore(95);
	    assertEquals(185, gradeBook1.finalScore());
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
