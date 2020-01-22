/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//引入馬達控制
import edu.wpi.first.wpilibj.Joystick;
//引入搖桿
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static WPI_VictorSPX Leftmotor;
  public static WPI_VictorSPX Rightmotor;
  public static Joystick Driver;
  public double x;
  public double y;
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
  
  Leftmotor = new WPI_VictorSPX(0);
  Rightmotor = new WPI_VictorSPX(1);

  Driver = new Joystick(0); 
  double y = 0;
  double x = 0; 
    }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    x = Driver.getY()
    while (Driver.getRawButtonPressed(1)) (y++);

    if (y=＝1) {Leftmotor.set(ControlMode.Percentage, ＋x)}
             {Rightmotor.set(ControlMode.Percentage, ＋x)}; 


    else if（y=＝2） {Leftmotor.set(ControlMode.Percentage, -x)}
                {Rightmotor.set(ControlMode.Percentage, -x)};

    else if（y=＝3） {Leftmotor.set(ControlMode.Percentage, +x)}
                {Rightmotor.set(ControlMode.Percentage, -x)};
  
  SmartDashboard.putNumber("x",x);
  SmartDashboard.putNumber("y",y);

  }

  

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
