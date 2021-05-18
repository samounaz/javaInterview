package test.java;

import java.util.List;
import org.junit.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import main.java.Interview;

public class InterviewTest {

    @Test
    public  void partitionTest(){
        int[]arr = {1,2,3,4,5};
        int len = 3;
        List result = Interview.partition(arr, len);
        assertEquals(result.size(), 2);
        int[] array = {4,5};
        assertThat(result.get(1), equalTo(array));

    }
}
