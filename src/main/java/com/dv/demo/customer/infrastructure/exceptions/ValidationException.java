package com.dv.demo.customer.infrastructure.exceptions;

public class ValidationException extends Exception{
    public ValidationException(Exception aException){super(aException.getMessage());}
    public ValidationException(String aMessage){super(aMessage);}
    public ValidationException(String aMessage, Throwable aException){super(aMessage, aException);}

}
