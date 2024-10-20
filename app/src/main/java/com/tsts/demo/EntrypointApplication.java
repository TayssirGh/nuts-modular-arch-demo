package com.tsts.demo;

import net.thevpc.nuts.NApplication;
import net.thevpc.nuts.NSession;
import net.thevpc.nuts.io.NPrintStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class EntrypointApplication implements NApplication {
    public static void main(String[] args) {
        SpringApplication.run(EntrypointApplication.class, args);
    }
    @Override
    public void run(NSession session) {
        NPrintStream out = session.out();
        out.println("Let's get it started \uD83D\uDE80\uD83D\uDE80");
    }

}
