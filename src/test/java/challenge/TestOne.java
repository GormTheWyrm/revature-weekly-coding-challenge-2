package challenge;
import challenge.ProblemOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOne {


    @Test
    public void Test1(){
        int result = ProblemOne.lengthFinder("cat", "at");
        assertEquals(2, result);
        System.out.println("test 1 passed");
    }
    @Test
    public void Test2(){
        int result = ProblemOne.lengthFinder("wilkins", "kin");
        assertEquals(3, result);
        System.out.println("test 2 passed");
    }
    @Test
    public void Test3(){
        int result = ProblemOne.lengthFinder("shin", "shennanigans");
        assertEquals(2, result);
        System.out.println("test 3 passed");
    }
    @Test
    public void Test4(){
        int result = ProblemOne.lengthFinder("oni", "continental");
        assertEquals(2, result);
        System.out.println("test 4 passed");
    }
    @Test
    public void Test5(){
        int result = ProblemOne.lengthFinder("on", "mice");
        assertEquals(0, result);
        System.out.println("test 5 passed");
    }
    @Test
    public void Test6(){ //capitals
        int result = ProblemOne.lengthFinder("con", "Continental");
        assertEquals(2, result);
        System.out.println("test 6 passed");
        //may need to change test case depending on whether capitals should matter
        //currently not accounting for capitols
    }
    @Test
    public void Test7(){ //multiple instances in one word
        int result = ProblemOne.lengthFinder("ass", "assassin");
        assertEquals(3, result);
        System.out.println("test 7 passed");
        //may need to change test case depending on wheter capitals should matter
    }
    @Test
    public void Test8(){ //larger instance later
        int result = ProblemOne.lengthFinder("truth", "tru crimes a seeker of truth and fact");
        assertEquals(5, result);
        System.out.println("test 8 passed");
        //may need to change test case depending on wheter capitals should matter
    }


}
