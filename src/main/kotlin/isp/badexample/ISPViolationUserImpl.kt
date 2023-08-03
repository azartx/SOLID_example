package isp.badexample

class ISPViolationUserImpl : ISPViolationUser {
    override fun getName(): String {
        return "ISP Violation User"
    }

    override fun removeUser(): Boolean {
        return true
    }

    override fun getEmail(): String {
        return "Some email"
    }

    override fun updateRole(newRole: String) {

    }
}