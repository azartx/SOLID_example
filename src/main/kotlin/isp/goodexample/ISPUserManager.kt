package isp.goodexample

interface ISPUserManager {
    fun removeUser(user: ISPUser): Boolean
    fun updateRole(user: ISPUser, newRole: String)
    fun getUser(userId: Int): ISPUser
}
