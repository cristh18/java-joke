package com.cristhian.gradle.jokes.test;

import com.cristhian.gradle.jokes.JokerGenerate;
import org.junit.Test;

public class JokerTest {
    @Test
    public void test() {
        JokerGenerate joker = new JokerGenerate();
        assert joker.getJoker().length() != 0;
    }
}