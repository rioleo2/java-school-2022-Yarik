package src.ru.croc.task4.methods;

import java.util.Scanner;

public class PureCode {

    //insideLineComment

    /* insideBlockCommentNoNewLine */

    /* insideBlockComment
       insideBlockComment */

    enum State{CODE_WITHOUT_COMMENTS, INSIDE_LINE_COMMENT, INSIDE_BLOCK_COMMENT, INSIDE_BLOCK_COMMENT_NO_NEW_LINE};

    public static String cleanCode(String code){

        State state = State.CODE_WITHOUT_COMMENTS;

        Scanner codeS = new Scanner(code);
        String resultCode = "";
        codeS.useDelimiter("");

        while (codeS.hasNext()){
            String codeNextChar = codeS.next();
            switch (state){

                case CODE_WITHOUT_COMMENTS:
                    if (codeNextChar.equals("/") && codeS.hasNext()){
                        String codeSecondNextChar = codeS.next();
                        if (codeSecondNextChar.equals("/"))
                            state = State.INSIDE_LINE_COMMENT;
                        else if (codeSecondNextChar.equals("*")) {
                            state = State.INSIDE_BLOCK_COMMENT_NO_NEW_LINE;
                        }
                        else
                            resultCode += codeNextChar + codeSecondNextChar;
                    }
                    else
                        resultCode += codeNextChar;
                    break;

                case INSIDE_LINE_COMMENT:
                    if (codeNextChar.equals("\n")){
                        state = State.CODE_WITHOUT_COMMENTS;
                        resultCode += "\n";
                    }
                    break;

                case INSIDE_BLOCK_COMMENT_NO_NEW_LINE:
                    if (codeNextChar.equals("\n")) {
                        resultCode += "\n";
                        state = State.INSIDE_BLOCK_COMMENT;
                    }

                case INSIDE_BLOCK_COMMENT:
                    while (codeNextChar.equals("*") && codeS.hasNext()){
                        String codeSecondNextChar = codeS.next();
                        if (codeSecondNextChar.equals("/")){
                            state = State.CODE_WITHOUT_COMMENTS;
                            break;
                        }
                    }
            }
        }

        return resultCode;
    }
}