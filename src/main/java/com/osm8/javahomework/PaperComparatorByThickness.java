package com.osm8.javahomework;

import java.util.Comparator;

public class PaperComparatorByThickness implements Comparator<Paper> {

    @Override
    public int compare(Paper o1, Paper o2) {
        return Double.compare(o1.thickness, o2.thickness);
    }
}
