package ProjetoTrempoCerto;
import java.util.Timer;
import java.util.TimerTask;

public class ContadorTimer {
    private int interval;
    public static int tempoIncial;
    private Timer timer;

    public ContadorTimer(int seconds){
        this.interval = seconds;
        tempoIncial = seconds;
        this.timer = new Timer();
    }

    public void start(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                setInterval();
                if (interval <= 0){
                    reset();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }


    // retorna tempo do intervalo
    public int getInterval(){
        return interval;
    }

    private int setInterval(){
        return --interval;
    }

    private void reset(){
        interval = tempoIncial;
    }

    public int getTempoIncial() {
        return tempoIncial;
    }

    public void setTempoIncial(int tempoIncial) {
        ContadorTimer.tempoIncial = tempoIncial;
    }


}
