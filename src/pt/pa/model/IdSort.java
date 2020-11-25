package pt.pa.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdSort implements GradeSorting{

    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list, new SortbyId());
    }

    class SortbyId implements Comparator<StudentGrade>
    {

        @Override
        public int compare(StudentGrade a, StudentGrade b){

            return a.getId().compareTo(b.getId());
        }

    }
}