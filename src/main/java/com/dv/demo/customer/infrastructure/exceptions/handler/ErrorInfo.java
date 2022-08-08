package com.dv.demo.customer.infrastructure.exceptions.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorInfo {
    private final String url;
    private final String ex;
}
