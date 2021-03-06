/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class27;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testMerge(){
        int[] ReverseSorted ={20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(App.mergeSort(ReverseSorted)));
    }
    @Test
    public void testMerge1(){
        int[] ReverseSorted ={5, 12, 7, 5, 5, 7};
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(App.mergeSort(ReverseSorted)));
    }
    @Test
    public void testMerge2(){
        int[] ReverseSorted ={2, 3, 5, 7, 13, 11};
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(App.mergeSort(ReverseSorted)));
    }
}
