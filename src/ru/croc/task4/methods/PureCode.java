package src.ru.croc.task4.methods;

import java.util.Scanner;

public class PureCode {

    //insideLineComment

    /* insideBlockCommentNoNewLine */

    /* insideBlockComment
       insideBlockComment */

    enum State{codeWithoutComments, insideLineComment, insideBlockComment, insideBlockCommentNoNewLine};

    public static String cleanCode(String code){

        State state = State.codeWithoutComments;

        Scanner codeS = new Scanner(code);
        String resultCode = "";
        codeS.useDelimiter("");

        while (codeS.hasNext()){
            String codeNextChar = codeS.next();
            switch (state){

                case codeWithoutComments:
                    if (codeNextChar.equals("/") && codeS.hasNext()){
                        String codeSecondNextChar = codeS.next();
                        if (codeSecondNextChar.equals("/"))
                            state = State.insideLineComment;
                        else if (codeSecondNextChar.equals("*")) {
                            state = State.insideBlockCommentNoNewLine;
                        }
                        else
                            resultCode += codeNextChar + codeSecondNextChar;
                    }
                    else
                        resultCode += codeNextChar;
                    break;

                case insideLineComment:
                    if (codeNextChar.equals("\n")){
                        state = State.codeWithoutComments;
                        resultCode += "\n";
                    }
                    break;

                case insideBlockCommentNoNewLine:
                    if (codeNextChar.equals("\n")) {
                        resultCode += "\n";
                        state = State.insideBlockComment;
                    }

                case insideBlockComment:
                    while (codeNextChar.equals("*") && codeS.hasNext()){
                        String codeSecondNextChar = codeS.next();
                        if (codeSecondNextChar.equals("/")){
                            state = State.codeWithoutComments;
                            break;
                        }
                    }
            }
        }

        return resultCode;
    }
}