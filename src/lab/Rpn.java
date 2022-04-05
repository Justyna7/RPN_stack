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
        char a = '0';
        char b = '1';
        char c = '9';
        int aa = a;
        int bb = b;
        int cc = c;
        System.out.println(""+ aa+ " "+ bb+ " " + cc + " ");
        for (int i = 0; i<l; i++){
            String s1 = s.substring(i, i+1);
            //System.out.println(""+ i + " " + s.charAt(i)+ " " + (!s1.equals(" ")));
            if (!s1.equals(" ")){
                this.stos.push(s1);
            }

        System.out.println(""+ this.s + " " + this.stos.peek());
        }
        return Character.getNumericValue(this.stos.peek().charAt(0));
    }

}