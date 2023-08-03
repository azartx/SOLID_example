package ocp.badexample

class OCPViolationAuthenticationService {
    fun auth(authentication: OCPViolationAuthentication, authInfo: OCPViolationAuthInfo) {
        when (authentication) {
            OCPViolationAuthentication.EMAIL -> {
                authByEmail(authInfo.email)
            }
            OCPViolationAuthentication.ANON -> {
                authAsAnon()
            }
            OCPViolationAuthentication.PHONE -> {
                authByPhone(authInfo.phone)
            }
        }
    }

    private fun authByEmail(email: String) {
        // auth using email
    }

    private fun authByPhone(phone: String) {
        // auth using phone
    }

    private fun authAsAnon() {
        // auth as anon
    }
}
