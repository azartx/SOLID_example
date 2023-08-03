package srp.goodexample

import kotlin.random.Random

class HardWorkService : Workable {
    override fun doWork(robot: SRPRobot): Boolean {
        // hard work implementation
        return Random.nextBoolean()
    }
}
