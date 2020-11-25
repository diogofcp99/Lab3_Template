package pt.pa.model;

import java.util.List;

public interface Statistic {

    /**
     * Calculates the defined operation.
     *
     * @param grades student grades
     * @return the result for a specific algorithm.
     */
    double compute(List<StudentGrade> grades);
}
