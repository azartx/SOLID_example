package ocp.goodexample.authenticators

import ocp.goodexample.OCPAuthenticator

class EmailAuthenticator(email: String) : OCPAuthenticator {
    override fun authenticate() {
        // auth by email
    }
}