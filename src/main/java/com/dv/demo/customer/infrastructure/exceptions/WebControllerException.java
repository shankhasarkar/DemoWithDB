package com.dv.demo.customer.infrastructure.exceptions;

public class WebControllerException extends Exception{
    public WebControllerException(Exception aException){super(aException.getMessage());}
    public WebControllerException(String aMessage){super(aMessage);}
    public WebControllerException(String aMessage, Throwable aException){super(aMessage, aException);}

}
