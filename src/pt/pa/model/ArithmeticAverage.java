package pt.pa.model;

import java.util.List;

public class ArithmeticAverage implements Statistic{

    /**
     * Calculates the defined operation.
     *
     * @param grades student grades
     * @return the result for a specific algorithm.
     */
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades == null) return -1;
        double sum =  0;

        for(StudentGrade grade : grades) {
            sum += grade.getGrade();
        }   

        return sum/grades.size();
    }

    @Override
    public String toString(){
        return "Média: ";
    }
}
