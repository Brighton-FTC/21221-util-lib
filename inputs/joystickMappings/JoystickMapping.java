package org.firstinspires.ftc.teamcode.libs.brightonCollege.inputs.joystickMappings;

/**
 * A function ({@link #_map}) that transforms the gamepad coordinate. Useful for making drivetrains respond more sensitively to user inputs at different positions.
 */
public abstract class JoystickMapping {
    public double map(double input){
        return Math.signum(input) * _map(Math.abs(input));
    }
    /**
     * Map a value 0-1 to a scaled speed value 0-1
     * @param input
     * @return
     */
    protected abstract double _map(double input);
}
