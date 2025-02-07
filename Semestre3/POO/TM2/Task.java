
/**
 * Décrivez votre classe Task ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Task
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String task_name;
    public long time;
    private boolean done;
    
    public Task(long day, long hour, long minute, long second)
    {
        long total_second;

        total_second = second + 60 * minute + 60 * 60 * hour + 60 * 60 * 24;
        this.time = System.nanoTime() + total_second;
    }
    
    public boolean time_out()
    {
        if (System.nanoTime() <= this.time)
            return (false);
        return (true);
    }
    
    public void set_as_finished()
    {
        this.done = true;
    }

}
