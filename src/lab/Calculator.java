package lab;

public class Calculator {
    private Operator[] calculations = new Operator[3];
    public Calculator(){
        this.calculations[0] = new Add();
        this.calculations[1] = new Substract();
        this.calculations[2] = new Multiply();
    }
    public int calculate(String s, String a, String b) throws Exception {
       for (Operator x : this.calculations) {
           if (x.supports(s)) {
               return x.calculate(a, b);
           }
       }
       throw new Exception("Niepoprawny operator");
    }
}
