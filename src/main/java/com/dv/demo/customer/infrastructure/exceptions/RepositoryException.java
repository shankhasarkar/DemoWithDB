package com.dv.demo.customer.infrastructure.exceptions;

public class RepositoryException extends Exception{
    public RepositoryException(Exception aException){super(aException.getMessage());}
    public RepositoryException(String aMessage){super(aMessage);}
    public RepositoryException(String aMessage, Throwable aException){super(aMessage, aException);}

}
