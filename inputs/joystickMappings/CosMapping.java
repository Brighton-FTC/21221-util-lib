package org.firstinspires.ftc.teamcode.libs.brightonCollege.inputs.joystickMappings;

public class CosMapping extends JoystickMapping{
    @Override
    protected double _map(double input){
        return 0.5 * (1.0 - Math.cos(input * Math.PI));
    }
}
