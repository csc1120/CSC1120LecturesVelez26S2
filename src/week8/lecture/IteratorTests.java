package week8.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week8.prep.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTests {
    private List<String> actual;
    private List<String> empty;
    private List<String> expected;
    private String toTest = "array";

    @BeforeEach
    public void setup(){
        if(toTest.equals("array")){
            actual = new MyArrayList<>();
            empty = new MyArrayList<>();
        }
        expected = new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));
        for(String s:expected){
            actual.add(s);
        }
    }
    private void compareList(List<String> expected,
                             List<String> toTest,
                             String msg){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i<toTest.size(); i++){
            temp.add(toTest.get(i));
        }
        Assertions.assertEquals(expected, temp, msg);
    }
}
