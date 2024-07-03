package org.firstinspires.ftc.teamcode.util_lib.inputs.buttonControllers;

import org.firstinspires.ftc.teamcode.libs.brightonCollege.inputs.Inputs;

/**
 * A button class that returns some processed inputs, and prevents querying the same data on the same tick (and causing bugs)
 */
public abstract class ButtonController<T> {
    protected int lastTick;
    protected T lastValue;

    public ButtonController(){
        lastTick = Inputs.getTick();
    }

    /**
     * Get the processed data from the button
     * @return Any processed data, depending on the type of ButtonController
     */
    public T getValue() {
        int currentTick = Inputs.getTick();
        if (currentTick == lastTick) return lastValue;
        lastValue = processTick();
        lastTick = currentTick;
        return lastValue;
    }

    /**
     * This function may be called up to once per tick. Determines whether the button is activated.
     */
    protected abstract T processTick();
}
