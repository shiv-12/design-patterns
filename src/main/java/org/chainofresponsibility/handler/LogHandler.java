package org.chainofresponsibility.handler;

import org.chainofresponsibility.LogLevel;

public abstract class LogHandler {
    private LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(LogLevel level, String message) {
        if (canHandle(level)) {
            writeMessage(message);
        } else {
            nextHandler.handle(level, message);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void writeMessage(String message);
}
