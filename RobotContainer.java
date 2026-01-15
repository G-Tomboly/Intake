package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;

public class RobotContainer {

    private final SparkMax motor1 =
        new SparkMax(Constants.Motores.motor1Intake, MotorType.kBrushless);
    
    private final SparkMax motor2 =
        new SparkMax(Constants.Motores.motor2Intake, MotorType.kBrushless);

    private final MotorSubsystem motorSubsystem =
      new MotorSubsystem(motor1, motor2);

    private final Joystick joystick =
        new Joystick(Constants.Joystick.joystickPort);

    public RobotContainer() {

        motorSubsystem.setDefaultCommand(
            new RunCommand(() -> {
                if (joystick.getRawButton(2)) {
                    motorSubsystem.run(Constants.Motores.velocidade);
                } else {
                    motorSubsystem.stop();
                }
            }, motorSubsystem)
        );
    }

    public Command getAutonomousCommand() {
        throw new UnsupportedOperationException("Unimplemented method 'getAutonomousCommand'");
    }
}
