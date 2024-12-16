package com.example.java21demo.java21_feature_exploration;

public class PatternMatchingInSwitchBefore {
    public static void main(String[] args) {
        Object object=1;
        if(object instanceof String){
            String string=(String) object;
            System.out.println(string+".(String) ");
        }
        if(object instanceof Integer){
            Integer integer=(Integer) object;
            System.out.println(integer+".(Integer)");
        }else System.out.println("Unknown");
    }

}
