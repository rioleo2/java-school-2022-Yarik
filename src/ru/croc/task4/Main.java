package src.ru.croc.task4;

import src.ru.croc.task4.methods.PureCode;

public class Main {

    public static void main(String[] args){


        String code = PureCode.cleanCode("/*\n" +
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n");

        System.out.println(code);
    }

}
