package lsp

import lsp.badexample.LSPViolationSimpleUser
import lsp.goodexample.LSPUserAdminImpl
import lsp.goodexample.LSPUserImpl

/**
 * Liskov Substitution Principle
 *
 * To build a software system from interchangeable parts, those parts must adhere
 * to a contract that allows those parts to be substituted one for another.
 */
fun main(args: Array<String>) {
    println("Bad solution: use interface with some methods which implementation is not need")
    try {
        LSPViolationSimpleUser().apply {
            println("LSPViolationSimpleUser - New user is created. About:\n$this")
            println("Changing user data...")
            updateEmail("someemail@gmail.com")
        }
    } catch (e: NotImplementedError) {
        println("Update user email result: ${e.message}\n")
    }

    println(
        "Good solution: Instead of putting all methods into one interface we should split it on"
            .plus("two interfaces for simple user and admin user. Admin user interface is extended version of simple user")
    )
    LSPUserImpl().apply {
        println("LSPUserImpl - New user is created. About:\n$this")
        println("Changing user data...")
        updateUsername("Some new name for simple user")
        println("User data changed successfully:\n$this\n")
    }
    LSPUserAdminImpl().apply {
        println("LSPUserAdminImpl - New user is created. About:\n$this")
        println("Changing user data...")
        updateUsername("Some new name for simple user")
        updateEmail("new.email@gmail.com")
        println("User data changed successfully:\n$this")
    }
}