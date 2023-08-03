package ocp.goodexample.authenticators

import ocp.goodexample.OCPAuthenticator

class AnonAuthenticator : OCPAuthenticator {
    override fun authenticate() {
        // auth as anon
    }
}