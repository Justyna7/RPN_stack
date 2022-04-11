package lab;

import java.util.Objects;

public class Add extends Operator{
    @Override
    public boolean supports (String s){
        return Objects.equals(s, "+");
    }
    @Override
    public int calculate(String a, String b){
        int a2 = Integer.parseInt(String.valueOf(a));
        int b2 = Integer.parseInt(String.valueOf(b));
        return a2 + b2;
    }
}
