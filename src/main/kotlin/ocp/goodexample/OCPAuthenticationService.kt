package ocp.goodexample

class OCPAuthenticationService {
    fun authenticate(authenticator: OCPAuthenticator) {
        // do some auth logic
        authenticator.authenticate()
    }
}
