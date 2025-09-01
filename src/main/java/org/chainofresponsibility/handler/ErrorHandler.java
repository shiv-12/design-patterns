package org.chainofresponsibility.handler;

import org.chainofresponsibility.LogLevel;

public class ErrorHandler extends LogHandler {

    @Override
    protected boolean canHandle(LogLevel level) {
        return LogLevel.ERROR.equals(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("ErrorHandler : " + message);
    }
}
