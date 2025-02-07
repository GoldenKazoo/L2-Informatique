import java.util.ArrayList;
import java.lang.Object;

public class TodoLIst
{
    private ArrayList<Task> todolist = new ArrayList<>();
    
    public TodoLIst()
    {
        
    }

    public void add(Task new_task)
    {
        todolist.add(new_task);
    }
    
    public void time_left()
    {
        int i;
        long hours_left;
        
        i = 0;
        while (i < todolist.size())
        {
            if (todolist.get(i).time >= System.nanoTime())
            {
                hours_left = (todolist.get(i).time) / (3600000000000L);
                System.out.println("Time left :" + hours_left + "hours");
            }
            i++;
        }
    }
}
