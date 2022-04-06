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
//        char a1 = '0';
//        char b1 = '1';
//        char c1 = '9';
//        int aa = a1;
//        int bb = b1;
//        int cc = c1;
//       System.out.println(""+ aa+ " "+ bb+ " " + cc + " ");//0:48, 9:57
        int l2 = 0;
        String liczba = "";
        for (int i = 0; i<l; i++){
            String s1 = s.substring(i, i+1);
            //System.out.println(""+ i + " " + s.charAt(i)+ " " + (!s1.equals(" ")));
            switch (s1){
                case " ":
                    if (!liczba.equals("")){
                        this.stos.push(liczba);
                        liczba = "";
                    }
                    break;
                default:
                    liczba = liczba+s1;
            }

//            if (!s1.equals(" ")){
//
//                this.stos.push(s1);
//                l2 = l2 +1;
//            }
        System.out.println(""+ this.s + " " + this.stos.peek()+" "+liczba);
        }
        this.stos.push(liczba);
        boolean t = true;
        while (t){
            String s1 = this.stos.pop();
            switch (s1){
                case "+":
                    int a = Integer.parseInt(String.valueOf(this.stos.pop()));
                    int b = Integer.parseInt(String.valueOf(this.stos.pop()));
                    //System.out.println(""+ a + " " + b+ " " + (a+b));
                    this.stos.push(""+(a + b));
                    System.out.println(""+ a + " " + b+ " " + (a+b) + " " + this.stos.peek()+ " "+ Character.getNumericValue(this.stos.peek().charAt(0)));
                    t = false;
                    break;
                case "-":
                    int a_ = Integer.parseInt(String.valueOf(this.stos.pop()));
                    int b_ = Integer.parseInt(String.valueOf(this.stos.pop()));
                    this.stos.push(""+(b_-a_));
                    t = false;
                    break;
                case "*":
                    int a2 = Integer.parseInt(String.valueOf(this.stos.pop()));//Character.getNumericValue(
                    int b2 = Integer.parseInt(String.valueOf(this.stos.pop()));
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