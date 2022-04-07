package lab;

import java.lang.String;

public class Rpn {
    private final String s;
    private final Stack stos = new Stack();
    public Rpn(String s){
        this.s = s;
    }
    public String printRpn(){
        return this.s;
    }
    private void calc(String c){
        int a = Integer.parseInt(String.valueOf(this.stos.pop()));
        int b = Integer.parseInt(String.valueOf(this.stos.pop()));
        switch (c){
            case "+" -> this.stos.push("" + (a + b));
            case "-" -> this.stos.push("" + (b - a));
            case "*" -> this.stos.push("" + (a * b));
        }
    }
    public int compute(){
        int l = this.s.length();
        StringBuilder liczba = new StringBuilder();
        for (int i = 0; i<l; i++){
            String s1 = s.substring(i, i+1);
            switch (s1){
                case " ":
                    if (!liczba.toString().equals("")){
                        this.stos.push(liczba.toString());
                        liczba = new StringBuilder();
                    }
                    break;
                case "+":
                case "-":
                case "*":
                    this.calc(s1);
                    break;
                default:
                    liczba.append(s1);
            }
        }
        if (!liczba.toString().equals("")){this.stos.push(liczba.toString());}
        return Integer.parseInt(String.valueOf(this.stos.peek()));
    }

}