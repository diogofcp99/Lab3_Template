package pt.pa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSort implements GradeSorting{
    @Override
    public void sort(List<StudentGrade> list) {
        Collections.sort(list,new SortbyName());
    }

    class SortbyName implements Comparator<StudentGrade>
    {
        // Used for sorting in ascending order of
        @Override
        public int compare(StudentGrade a, StudentGrade b)
        {
            return a.getName().compareToIgnoreCase(b.getName());
        }

    }
}