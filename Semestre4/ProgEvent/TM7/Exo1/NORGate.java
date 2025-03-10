import java.util.ArrayList;

public class NORGate
{
    boolean FirstInput;
    boolean SecondInput;
    boolean currentOutput;
    ArrayList<ValueListener> callbacks = new ArrayList();

    void addOutputListener (ValueListener callback)
    {
        this.callbacks.add(callback);
    }

    void removeOutputListener(ValueListener callback)
    {
        this.callbacks.remove(this.callbacks.size() - 1);
    }

    void setFirstInput(boolean value)
    {
        this.FirstInput = value;
    }

    void setSecondInput(boolean value)
    {
        this.SecondInput = value;
    }

    void updateOutput()
    {
        int i;
        boolean result;

        result = (!(this.FirstInput || this.SecondInput));
        if (result != currentOutput)
        {
            currentOutput = result;
            for(ValueListener listener: callbacks)
            {
                listener.onValueUpdate(result);
            }
        }
    }
}