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
    private void calc(String c) throws Exception {
        String A = this.stos.pop();
        String B = this.stos.pop();
        Calculator x = new Calculator();
        this.stos.push(String.valueOf(x.calculate(c,A,B)));

    }
    public int compute() throws Exception {
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
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    liczba.append(s1);
                    break;
                default:
                    this.calc(s1);
            }
        }
        if (!liczba.toString().equals("")){this.stos.push(liczba.toString());}
        return Integer.parseInt(String.valueOf(this.stos.peek()));
    }

}