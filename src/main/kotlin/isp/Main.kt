package isp

import isp.badexample.ISPViolationUser
import isp.badexample.ISPViolationUserImpl
import isp.goodexample.ISPUserManager
import isp.goodexample.ISPUserManagerImpl

/**
 * Interface Segregation Principle
 *
 * Software designers should avoid depending on the things they don’t use.
 */
fun main(args: Array<String>) {
    println("Bad example: we have one user interface with different methods")
    launchBadExample()

    println("Good example: we have two different interfaces. First is managing users, working with remote, the second is work with user object")
    launchGoodExample()
}

private fun launchBadExample() {
    val user: ISPViolationUser = ISPViolationUserImpl()
    user.updateRole("Admin")
    val userEmail = user.getEmail()
    println("User email is $userEmail")
}

private fun launchGoodExample() {
    val userManager: ISPUserManager = ISPUserManagerImpl()
    val user = userManager.getUser(1)
    val userEmail = user.getEmail()
    println("User email is $userEmail")
    userManager.removeUser(user)
}
