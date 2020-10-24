package OOP4;


import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Expression {
    String Data;
    char[] DataChar;

    public void getString(){
        try {
            File myObj = new File("OOP4\\one_expression.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                this.Data = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        this.DataChar = Data.toCharArray();
    }

    public void getString3(String s) throws FileNotFoundException {

        this.Data = s;
        this.DataChar = Data.toCharArray();

    }


   public boolean check(){
        int j = Data.length();
        Stack<Character> stack = new Stack<>();
        if(j==0)
            return false;
       System.out.printf("\n" + Data+"\n");
        int i, b;
        if(DataChar[0]>='1' && DataChar[0] <='9' || DataChar[1]=='.' || DataChar[2] == ' ') b=3; else b =0;

        for(i=b;i<j;i++){

            if(isOpen(DataChar[i])){
                if(!stack.isEmpty() && isNumber(stack.peek())){
                    return false;
                }
                stack.push(DataChar[i]);
            }else if(isNumber(DataChar[i])){
                stack.push(DataChar[i]);}
                else if(isSpace(DataChar[i])){
                    stack.push(DataChar[i]);
            }else if(isOp(DataChar[i])){
           //     if(stack.isEmpty() || !isNumber(stack.peek())){
            //        return false;
             //    }
                stack.push(DataChar[i]);

            }else if(isChar(DataChar[i])){
                stack.push(DataChar[i]);}
            else if(isClose(DataChar[i])){
              // if(stack.isEmpty() || !isNumber(stack.peek())){
             //      return false;
            //    }


                while(!stack.isEmpty()){
                    char temp=stack.pop();
                    if(isOpen(temp)){
                        if(doMatch(temp,DataChar[i])){
                            break;
                        }else{
                            return false;//unexpected open
                        }
                    }else{
                        if(stack.isEmpty()){
                            return false;
                        }
                    }
                }
                stack.push('1');
            }else{ //unexpected char
                return false;
            }
        }
        if(!stack.isEmpty() && !isNumber(stack.peek())) {
            return false;
        }
      while(!stack.isEmpty()){
              if(isOpen(stack.pop()))return false;
    }
       stack.clear();

        return true;
    }



    private static boolean isOpen(char c) {
        if(c=='(' || c=='[')return true;
        return false;
    }

    private static boolean isNumber(char c) {
        if(c>='0' && c<='9')return true;
        return false;
    }

    private static boolean isOp(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/')return true;
        return false;
    }

    private static boolean isClose(char c) {
        if(c==')' || c==']')return true;
        return false;
    }

    private static boolean doMatch(char temp, char c) {
        if((temp=='(' && c==')')||(temp=='[' && c==']'))return true;
        return false;
    }

    private static boolean isChar(char c) {
        if(c>='A' && c<='z')return true;
        return false;
    }

    private static boolean isSpace(char c){
        if(c==' ') return true;
        return false;
    }

}
