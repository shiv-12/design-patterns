package org.chainofresponsibility.handler;

import org.chainofresponsibility.LogLevel;

public class DebugHandler extends LogHandler {

    @Override
   protected boolean canHandle(LogLevel level) {
        return LogLevel.DEBUG.equals(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("DebugHandler : " + message);
    }
}
