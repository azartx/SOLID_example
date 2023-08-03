package srp

import srp.badexample.SRPViolationRobot
import srp.goodexample.EasyWorkService
import srp.goodexample.HardWorkService
import srp.goodexample.SRPRobot
import srp.goodexample.Workable
import utils.RobotOS

/**
 * Single Responsibility
 *
 * A module should have one, and only one reason to change.
 */
fun main(args: Array<String>) {
    println("\n********Bad Example********\n")
    launchBadExample()
    println("\n*******Good Example*******\n")
    launchGoodExample()
}

private fun launchGoodExample() {
    val robot = SRPRobot(
        os = RobotOS.ULTRAOS,
        name = "SRP Robot"
    )

    // two services with own doWork realisation
    val hardWorkService: Workable = HardWorkService()
    val easyWorkService: Workable = EasyWorkService()

    // do easy work
    val easyWorkResult = easyWorkService.doWork(robot)

    // do hard work
    val hardWorkResult = hardWorkService.doWork(robot)

    println("Easy work result: $easyWorkResult")
    println("Hard work result: $hardWorkResult")
}

private fun launchBadExample() {
    // in this example robot has too many responsibilities
    val robot = SRPViolationRobot(
        os = RobotOS.ULTRAOS,
        name = "SRP Robot"
    )

    // do easy work - could not be success because we wanted to do an easy work
    val easyWorkResult = robot.doHardWork()

    // do hard work
    val hardWorkResult = robot.doHardWork()

    println("Easy work result: $easyWorkResult. Its could ne wrong result because we do easy work by hardWork function")
    println("Hard work result: $hardWorkResult")
}
