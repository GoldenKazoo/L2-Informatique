import java.util.swing;
import java.util.ArrayList;
public interface Callback
{
    void run();
}

public class Clock
{
    long time;
    ArrayList<Callback> list = new ArrayList();

    Clock (long time)
    {
        this.time = time;
    }

    void addListener(Callback callback)
    {
        list.add(callback);
    }

    void removeListener(Callback callback)
    {
        list.remove(index);
    }

    void start()
    {
        int i;

        i = 0;
        while(i)
        {
            this.list.add(callback);
        }
    }
}

class Data { public int i = 0; }
public class Test1 {
public static void main(String[] args) throws InterruptedException {
var clock = new Clock(500);
var data = new Data();
clock.addListener(() -> {
data.i++;
System.out.println(data.i);
});
clock.start();
}
}