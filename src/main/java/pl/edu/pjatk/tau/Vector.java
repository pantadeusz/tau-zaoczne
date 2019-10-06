package pl.edu.pjatk.tau;

/**
 * Class implementing mathematical vector of any length
 */
public class Vector {
    public Vector() {

    }

    public Vector(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Vector should be of positive size");
    }
}
