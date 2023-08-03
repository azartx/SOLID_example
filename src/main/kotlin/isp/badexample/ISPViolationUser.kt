package isp.badexample

interface ISPViolationUser {
    fun getName(): String
    fun removeUser(): Boolean
    fun getEmail(): String
    fun updateRole(newRole: String)
}
