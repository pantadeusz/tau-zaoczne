package pl.edu.pjatk.tau;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
}
