package ocp

import ocp.badexample.OCPViolationAuthInfo
import ocp.badexample.OCPViolationAuthentication
import ocp.badexample.OCPViolationAuthenticationService
import ocp.goodexample.OCPAuthenticationService
import ocp.goodexample.OCPAuthenticator
import ocp.goodexample.authenticators.AnonAuthenticator
import ocp.goodexample.authenticators.EmailAuthenticator
import ocp.goodexample.authenticators.PhoneAuthenticator

/**
 * Open/Closed Principle
 *
 * Software systems should be easy to change, they must be designed to allow the behavior of those systems
 * to be changed by adding new code, rather than changing the existing code.
 */
fun main(args: Array<String>) {
    println("*****Bad example*****")
    println("We can use this realisation, but if in future we would be need to extend out auth types - then we would must to edit AuthService.")
    println("*****Good example*****")
    println("Good example: in this case if we wont to update our auth types - we only need to implement Authenticator interface and update the UI")

    val types = AuthTypes.entries
    print("Insert one of the following auth types (${types.joinToString()}): ")
    val input = readlnOrNull()?.let { inp -> AuthTypes.entries.find { it.name.equals(inp, true) } } ?: run {
        println("\nIncorrect input. You must insert one of the following types: email, phone, anon")
        throw IllegalArgumentException()
    }

    badExample(input)
    goodExample(input)
}

private fun goodExample(input: AuthTypes) {
    val authService = OCPAuthenticationService()
    val authenticator: OCPAuthenticator = when (input) {
        AuthTypes.ANON -> AnonAuthenticator()
        AuthTypes.EMAIL -> EmailAuthenticator("demouser@gmail.com")
        AuthTypes.PHONE -> PhoneAuthenticator("+000000000")
    }
    authService.authenticate(authenticator)

    println("Bad auth success\n")
}

private fun badExample(input: AuthTypes) {
    val authService = OCPViolationAuthenticationService()
    when (input) {
        AuthTypes.ANON -> authService.auth(OCPViolationAuthentication.ANON, OCPViolationAuthInfo(anon = true))
        AuthTypes.EMAIL -> authService.auth(OCPViolationAuthentication.EMAIL, OCPViolationAuthInfo(email = "demouser@gmail.com"))
        AuthTypes.PHONE -> authService.auth(OCPViolationAuthentication.PHONE, OCPViolationAuthInfo(phone = "+000000000"))
    }

    println("Good auth success\n")
}
