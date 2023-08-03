package srp.goodexample

import kotlin.random.Random

class EasyWorkService : Workable {
    override fun doWork(robot: SRPRobot): Boolean {
        // easy work implementation
        return Random.nextBoolean()
    }
}
