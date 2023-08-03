package srp.badexample

import utils.Caffe
import utils.CaffeType
import utils.RobotOS
import kotlin.random.Random

/**
 * Robot with too many responsibilities
 */
class SRPViolationRobot(
    val os: RobotOS,
    val name: String
) {
    fun doHardWork(): Boolean {
        return Random.nextBoolean()
    }

    fun makeCaffeToOwner(caffeType: CaffeType): Caffe {
        return Caffe(caffeType)
    }
}
