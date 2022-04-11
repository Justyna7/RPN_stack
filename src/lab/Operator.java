package lab;

public abstract class Operator implements Operation{
    @Override
    public abstract boolean supports (String s);
    @Override
    public abstract int calculate(String a, String b);
}
