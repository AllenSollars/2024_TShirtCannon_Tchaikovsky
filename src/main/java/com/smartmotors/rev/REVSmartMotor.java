package com.smartmotors.rev;

import com.control.position.PositionProfileType;
import com.control.velocity.VelocityProfileType;
import com.smartmotors.FeedforwardType;
import com.smartmotors.InputType;
import com.smartmotors.SmartMotor;

public class REVSmartMotor extends SmartMotor {


    @Override
    public double getPosition() {
        return 0;
    }

    @Override
    public double getVelocity() {
        return 0;
    }

    @Override
    public void setPosition(double position) {

    }

    @Override
    public void accept(double position, PositionProfileType profileType, InputType inputType) {

    }

    @Override
    public void accept(double velocity, VelocityProfileType profileType, InputType inputType) {

    }

    @Override
    public void accept(double rawInput, InputType inputType) {

    }
}