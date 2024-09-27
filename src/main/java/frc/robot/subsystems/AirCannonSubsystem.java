// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsBase;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class AirCannonSubsystem extends SubsystemBase {

  private final Solenoid solenoid;
  public final Trigger isOn;

  /** Creates a new AirCannonSubsystem. */
  public AirCannonSubsystem(int channel, PneumaticsBase modual) {
    solenoid = modual.makeSolenoid(channel);
    isOn = new Trigger(solenoid::get);
    setName("AirCannon Channel#" + channel);
  }

  private void on(){
    solenoid.set(true);
  }
    private void off(){
    solenoid.set(false);
  }

  public Command openValve(){
    return runOnce(this::on)
    .withName("OPEN VALVE");
  }

  public Command closeValve(){
    return runOnce(this::off)
    .withName("CLOSE VALVE");
  }

  }
