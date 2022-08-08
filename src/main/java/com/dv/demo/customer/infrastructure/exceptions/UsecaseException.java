package com.dv.demo.customer.infrastructure.exceptions;

public class UsecaseException extends Exception{
    public UsecaseException(Exception aException){super(aException.getMessage());}
    public UsecaseException(String aMessage){super(aMessage);}
    public UsecaseException(String aMessage, Throwable aException){super(aMessage, aException);}

}
