package pl.edu.pjatk.tau;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.CoreMatchers.*;

// import pl.edu.pjatk.tau.Vector;

@RunWith(JUnit4.class)
public class VectorTest {

    @Test
    public void vectorIsImplementedTest() {
        assertNotNull(new Vector());
    }

    @Test
    public void vectorConstructorCanAcceptNumberOfDimensionsTest() {
        assertNotNull(new Vector(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void vectorConstructorShouldAcceptOnlyPositiveNumberOfDimensionsTest() {
        new Vector(-6);
    }

    @Test
    public void vectorConstructorCanCreateEmptyVectorTest() {
        Vector v = new Vector();
        assertNotNull(v.v);
    }
    @Test
    public void vectorConstructorCanCreateNotEmptyVectorWithCorrectContainerTest() {
        Vector v = new Vector(10);
        assertNotNull(v.v);
        assertEquals(10, v.v.size());
    }

    @Test
    public void toStringGivesCorrectStringTest() {
        Vector v = new Vector(2);
        v.v.set(0,1.0);
        v.v.set(1,2.0);
        assertThat(v.toString(),
                both(containsString("("))
                        .and(containsString(")")));
        assertThat(v.toString(),
                both(containsString("1.0"))
                        .and(containsString("2.0")));
    }

}
