package org.firstinspires.ftc.teamcode.util_lib.inputs.buttonControllers;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.button.Button;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

/**
 * A pair of buttons used to change a double (floating-point) number by incrementing/decrementing it
 */
public class IncrementButtonController extends ButtonController<Double> {

    public double value;
    public double step;
    private final Button incrementButton;
    private final Button decrementButton;

    /**
     * Create an IncrementButtonController from button names ({@link GamepadKeys.Button})
     * @param gamepad The gamepad
     * @param incrementButton The button name used to increment the value
     * @param decrementButton The button name used to decrement the value
     * @param initialValue The initial value of the number
     * @param step How much to increment/decrement the number by on each press
     */
    public IncrementButtonController(GamepadEx gamepad, GamepadKeys.Button incrementButton, GamepadKeys.Button decrementButton, double initialValue, double step) {
        this(gamepad.getGamepadButton(incrementButton), gamepad.getGamepadButton(decrementButton), initialValue, step);

    }

    /**
     * Create an IncrementButtonController from {@link Button} instances
     * @param incrementButton The button used to increment the value
     * @param decrementButton The button used to decrement the value
     * @param initialValue The initial value of the number
     * @param step How much to increment/decrement the number by on each press
     */
    public IncrementButtonController(Button incrementButton, Button decrementButton, double initialValue, double step) {
        this.incrementButton = incrementButton;
        this.decrementButton = decrementButton;
        this.value = initialValue;
        this.step = step;

        // Add events - TODO: Test
        incrementButton.whenPressed(new InstantCommand(() -> {
            this.value += step;
        }));
        decrementButton.whenPressed(new InstantCommand(() -> {
            this.value += step;
        }));
    }

    /**
     * Get the value of the number which has been edited
     * @return a double floating-point number
     */
    @Override
    protected Double processTick() {
        return value;
    }
}
