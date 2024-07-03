package org.firstinspires.ftc.teamcode.util_lib.inputs.buttonControllers;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.button.Button;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

/**
 * A set of buttons that can change between states when pressed - each button represents a state.
 */
public class StateSelectorButtonController extends ButtonController<Integer> {
    private final Button[] buttons;

    private int state = 0;

    /**
     * Create a StateSelectorButtonController from an array of {@link Button}s
     * @param buttons the array of buttons, with the first representing state 0, second for state 1, etc.
     */
    public StateSelectorButtonController(Button[] buttons) {
        this.buttons = buttons;

        // Add events
        for (int i = 0; i < buttons.length; i++) {
            int finalI = i; // So no change for each button
            buttons[i].whenPressed(new InstantCommand(() -> {
                this.state = finalI;
            }));
        }

    }

    /**
     * Get the numerical value of the current state
     * @return the state, with its value corresponding to the index of the button last pressed
     */
    @Override
    protected Integer processTick() {
        return state;
    }
}
