package com.osm8.javahomework;

public class Paper implements Comparable<Paper>{
    public String color;
    public double thickness;

    public Paper(String color, double thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paper paper = (Paper) o;

        if (Double.compare(paper.thickness, thickness) != 0) return false;
        return color.equals(paper.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        temp = Double.doubleToLongBits(thickness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int compareTo(Paper o) {
        return Double.compare(o.thickness, this.thickness);
    }
}
