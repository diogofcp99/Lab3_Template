package pt.pa.model;

import java.util.List;

public class LowerGrade implements Statistic {
    /**
     * Calculates the defined operation.
     *
     * @param grades student grades
     * @return the result for a specific algorithm.
     */
    @Override
    public double compute(List<StudentGrade> grades) {
        if(grades == null) return -1;

        int value = 20;

        for(StudentGrade grade : grades){
            if(value > grade.getGrade()){
               value = grade.getGrade();
            }
        }

        return value;
    }

    @Override
    public String toString(){
        return "Nota mais baixa: ";
    }
}
