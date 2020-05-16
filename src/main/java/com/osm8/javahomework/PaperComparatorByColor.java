package com.osm8.javahomework;

import java.util.Comparator;

public class PaperComparatorByColor implements Comparator<Paper> {
    @Override
    public int compare(Paper o1, Paper o2) {
        return o1.color.compareTo(o2.color);
    }
}
