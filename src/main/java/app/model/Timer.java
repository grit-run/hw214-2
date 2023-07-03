package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    public Timer() {
        this.nanoTime = nanoTime;
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {

        return nanoTime;
    }
}
