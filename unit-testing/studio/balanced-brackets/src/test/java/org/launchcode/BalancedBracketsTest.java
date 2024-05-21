package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // These strings have balanced brackets:
    //  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "LaunchCode", "", "[]"

    @Test
    public void haveBalancedBracketsInTheEnds() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void haveBalancedBracketsMiddleAndEnd() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void haveBalancedBracketsAtTheStart() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void haveBalancedBracketsNoBrackets() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void haveBalancedBracketsNoBracketsAndNoText() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void haveBalancedBracketsAndNoOtherText() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // While these strings do not have balanced brackets:
    //   "[LaunchCode", "Launch]Code[", "[", "]", "][", [Launch]Code]

    @Test
    public void DoesNotHaveBalancedBracketsNoEnd() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void DoesNotHaveBalancedBracketsReverseOrder() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void DoesNotHaveBalancedBracketsOnlyStart() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void DoesNotHaveBalancedBracketsOnlyEnd() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void DoesNotHaveBalancedBracketsReverseOrderNoText() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void DoesNotHaveBalancedBracketsBalancedThenOpen() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }




}