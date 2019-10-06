package pl.edu.pjatk.tau;

import java.util.ArrayList;

/**
 * Class implementing mathematical vector of any length
 */
public class Vector {
    protected ArrayList<Double> v;

    public Vector() {
        this(0);
    }

    public Vector(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Vector should be of positive size");
        v = new ArrayList<Double>();
        for (int i = 0; i < size; i++) v.add(0.0);
    }

    @Override
    public String toString() {
        String result = "(";
        for (int i = 0; i < v.size(); i++) {
            result = result + (i==0?v.get(i):(", "+v.get(i)));
        }
        return result + ")";
    }
}
