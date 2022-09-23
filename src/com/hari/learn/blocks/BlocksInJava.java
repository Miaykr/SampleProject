package com.hari.learn.blocks;

public class BlocksInJava {

    //Instance is nothing but Object
    //static block
    static {
        System.out.println("static block, It will be executed only once");
    }

    public static void main(String[] args) {

        display();
        BlocksInJava blocksInJava = new BlocksInJava();
        BlocksInJava blocksInJava2 = new BlocksInJava();
        BlocksInJava blocksInJava3 = blocksInJava2;

        System.out.println(blocksInJava == blocksInJava2); // always == performs address comparison
        System.out.println(blocksInJava.hashCode());
        System.out.println(blocksInJava2.hashCode());
        System.out.println(blocksInJava3.hashCode());
        System.out.println("blocksInJava == blocksInJava2" + (blocksInJava2 == blocksInJava3));
        System.out.println("blocksInJava.equals(blocksInJava2)" + (blocksInJava2.equals(blocksInJava3)));
        System.out.println(blocksInJava.equals(blocksInJava2));
    }

    //methods
    static void display() {
        System.out.println("This is display().");
    }

    //instantiation block
    {
        System.out.println("This instantiation block");
    }

    void show() {
        System.out.println("This is show().");
    }
}
