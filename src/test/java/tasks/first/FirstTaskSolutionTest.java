package tasks.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FirstTaskSolutionTest {

    FirstTask solution = new FirstTaskSolution();

    @Test
    void bracketsValidation_valid1(){
        String testString = "({[]})";
        assertTrue(solution.validateBrackets(testString));
    }

    @Test
    void bracketsValidation_valid2(){
        String testString = "";
        assertTrue(solution.validateBrackets(testString));
    }

    @Test
    void bracketsValidation_invalid1(){
        String testString = "sfds(ddfs{)fsdfs";
        assertFalse(solution.validateBrackets(testString));
    }

    @Test
    void bracketsValidation_invalid2(){
        String testString = "sfds(ddfs{){fsdfs";
        assertFalse(solution.validateBrackets(testString));
    }

}