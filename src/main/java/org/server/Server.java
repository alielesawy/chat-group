package org.server;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ServerSocket;



public class Server {

    private static final int PORT = 9001;

    static Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) throws Exception {
        logger.info("The chat server is running.");
        ServerSocket listener = new ServerSocket(PORT);

        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            listener.close();
        }
    }

}
