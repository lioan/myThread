package cn.com.lioan.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TraditionalTimerTest {

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("bomber_1 bombing......");
            }
        }, 10000, 3000);

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Calendar.getInstance().get(Calendar.SECOND));
        }
    }
}
