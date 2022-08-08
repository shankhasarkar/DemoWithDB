package com.dv.demo.customer.infrastructure.exceptions;

public class ServiceException extends Exception{
    public ServiceException(Exception aException){super(aException.getMessage());}
    public ServiceException(String aMessage){super(aMessage);}
    public ServiceException(String aMessage, Throwable aException){super(aMessage, aException);}

}
