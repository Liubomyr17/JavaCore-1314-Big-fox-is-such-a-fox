package com.company;

/*

1314 Big fox is such a fox
1. Fix the BigFox class so that the program compiles.

Requirements:
1. The Animal interface must be implemented in the Fox class.
2. Only one method (getName) must be implemented in the Fox class.
3. The getColor method must be declared in the Animal interface.
4. The BigFox class must be a descendant of the Fox class.


 */

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox{
        @Override
        public Color getColor() {
            return Color.GRAY;
        }
    }

}



