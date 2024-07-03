package org.firstinspires.ftc.teamcode.libs.brightonCollege.inputs;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.Gamepad;

/**
 * This is a container for the gamepads ({@link GamepadEx}). Two gamepads can be connected to the Driver Station, {@link #gamepad1} and {@link #gamepad2}, but in practise only {@link #gamepad1} is used.
 */
public class Inputs {
    public static GamepadEx gamepad1;
    public static GamepadEx gamepad2;

    private static int tick;

    /**
     * Save the gamepads in this container
     * @param _gamepad1 The first gamepad
     * @param _gamepad2 The second gamepad
     */
    public static void init(GamepadEx _gamepad1, GamepadEx _gamepad2){
        gamepad1 = _gamepad1;
        gamepad2 = _gamepad2;
        tick = 0;
    }

    /**
     * Runs each tick to keep track of the number of ticks so far
     */
    public static void tick(){
        tick += 1;
    }

    /**
     * Get the number of ticks so far - useful for keeping track of time periods
     * @return The number of ticks since the OpMode started
     */
    public static int getTick() {
        return tick;
    }
}


