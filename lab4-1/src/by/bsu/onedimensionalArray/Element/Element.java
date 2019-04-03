package by.bsu.onedimensionalArray.Element;

import java.util.Objects;

public class Element {
    protected int n;
    protected int min ;
    protected int max ;


    public static int[] Generate(int[] x, int n, int min, int max){
        for (int i = 0; i<n; i++){
            x[i] = Random(min,max);
        }
        return x;
    }

    public static int Random(int min, int max){
        return (min + (int)(Math.random() * max));
    }

    public Element(int n, int min, int max) {
        this.n = n;
        this.min = min;
        this.max = max;
    }

    public Element() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return n == element.n &&
                min == element.min &&
                max == element.max;
    }

    @Override
    public int hashCode() {

        return Objects.hash(n, min, max);
    }

    @Override
    public String toString() {
        return "Element{" +
                "n=" + n +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
