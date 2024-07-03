package org.firstinspires.ftc.teamcode.libs.brightonCollege.inputs.joystickMappings;

public class SquareMapping extends JoystickMapping{
    @Override
    public double _map(double input) {
        return input * input;
    }
}
