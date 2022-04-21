package thej.elytrabot.utils;

public class TimerUtil {

    public long ms;

    public void reset() {
        this.ms = System.currentTimeMillis();
    }

    public boolean hasPassed(int ms) {
        return System.currentTimeMillis() - this.ms >= ms;
    }
}
