package ocp.goodexample.authenticators

import ocp.goodexample.OCPAuthenticator

class PhoneAuthenticator(phone: String) : OCPAuthenticator {
    override fun authenticate() {
        // auth by phone
    }
}