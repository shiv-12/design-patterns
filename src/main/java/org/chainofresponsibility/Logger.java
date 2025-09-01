package org.chainofresponsibility;

import org.chainofresponsibility.handler.DebugHandler;
import org.chainofresponsibility.handler.DefaultHandler;
import org.chainofresponsibility.handler.ErrorHandler;
import org.chainofresponsibility.handler.LogHandler;

public class Logger {

    private final LogHandler logHandler;

    public Logger() {
        this.logHandler = createHandlerChain();
    }

    private LogHandler createHandlerChain() {
        LogHandler errorHandler = new ErrorHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler defaultHandler = new DefaultHandler();

        errorHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(defaultHandler);

        return errorHandler;
    }

    public void log(LogLevel level, String message) {
        logHandler.handle(level, message);
    }
}
