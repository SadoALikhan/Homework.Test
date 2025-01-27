package exceptions;

public class DivideByZeroException extends IllegalArgumentException{

    public DivideByZeroException(String s) {
        super(s);
    }
}
