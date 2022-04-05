package lab;

import java.lang.String;

public class Rpn {
    private final String s;
    private Stack stos = new Stack();
    public Rpn(String s){
        this.s = s;
    }
    public String printRpn(){
        return this.s;
    }
    public int compute(){
        int l = this.s.length();
//        char a = '0';
//        char b = '1';
//        char c = '9';
//        int aa = a;
//        int bb = b;
//        int cc = c;
       // System.out.println(""+ aa+ " "+ bb+ " " + cc + " ");
        int l2 = 0;
        String liczba = "";
        for (int i = 0; i<l; i++){
            String s1 = s.substring(i, i+1);
            //System.out.println(""+ i + " " + s.charAt(i)+ " " + (!s1.equals(" ")));
            if (!s1.equals(" ")){
                this.stos.push(s1);
                l2 = l2 +1;
            }
        System.out.println(""+ this.s + " " + this.stos.peek());
        }
        boolean t = true;
        while (t){
            String s1 = this.stos.pop();
            switch (s1){
                case "+":
                    int a = Character.getNumericValue(this.stos.pop().charAt(0));
                    int b = Character.getNumericValue(this.stos.pop().charAt(0));
                    //System.out.println(""+ a + " " + b+ " " + (a+b));
                    this.stos.push(""+(a + b));
                    System.out.println(""+ a + " " + b+ " " + (a+b) + " " + this.stos.peek()+ " "+ Character.getNumericValue(this.stos.peek().charAt(0)));
                    t = false;
                    break;
                case "-":
                    int a_ = Character.getNumericValue(this.stos.pop().charAt(0));
                    int b_ = Character.getNumericValue(this.stos.pop().charAt(0));
                    this.stos.push(""+(b_-a_));
                    t = false;
                    break;
                case "*":
                    int a2 = Character.getNumericValue(this.stos.pop().charAt(0));
                    int b2 = Character.getNumericValue(this.stos.pop().charAt(0));
                    this.stos.push(""+(a2*b2));
                    t = false;
                    break;
                default:
                    this.stos.push(s1);
                    t = false;
            }
            //System.out.println(""+ this.s + " " + this.stos.peek());
        }
        return Integer.parseInt(String.valueOf(this.stos.peek()));
    }

}