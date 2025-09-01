package org.chainofresponsibility.handler;

import org.chainofresponsibility.LogLevel;

public class DefaultHandler extends LogHandler {

    @Override
    protected boolean canHandle(LogLevel level) {
        return true;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("DefaultHandler : " + message);
    }
}
