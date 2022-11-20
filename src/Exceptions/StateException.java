package Exceptions;

public class StateException extends Exception{
    public StateException(String message, Throwable err){
        super(message,err);
    }
}
