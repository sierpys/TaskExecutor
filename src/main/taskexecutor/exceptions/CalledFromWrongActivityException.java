package main.taskexecutor.exceptions;

public class CalledFromWrongActivityException extends IllegalArgumentException{
    private static final long serialVersionUID = 8605520050495516787L;
    public CalledFromWrongActivityException(String message){
	super(message);
    }
}