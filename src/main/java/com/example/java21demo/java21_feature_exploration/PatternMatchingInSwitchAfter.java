package com.example.java21demo.java21_feature_exploration;
/**
 * Represents importance of pattern matching in switch.
 *
 * @author Coral Monisha P S
 * @version 1.0
 * @since 2024
 * Benefits:
 * auto casting
 * no boilerplate codes
 */
public class PatternMatchingInSwitchAfter {
    public static void main(String[] args) {
        Object object=false;
        switch (object){
            case String s->System.out.println("String");
            case Integer integer->System.out.println("Integer");
            default -> System.out.println("Unknown");
        }
    }
}
