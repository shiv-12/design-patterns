package org.chainofresponsibility;

public class Tester {
    public static void main(String[] args) {

        Logger logger = new Logger();

        logger.log(LogLevel.ERROR, "DB CONNECTION FAILED!");

        logger.log(LogLevel.DEBUG, "Test Debug Exception!");

        logger.log(LogLevel.INFO, "Test Info Exception");

    }
}


/*

Core Idea of Chain of Responsibility
Each handler in the chain decides whether it can process the request.
If it can, it handles it.
If it cannot, it forwards the request to the next handler in the chain.

*/