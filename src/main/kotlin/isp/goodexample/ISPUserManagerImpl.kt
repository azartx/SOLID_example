package isp.goodexample

class ISPUserManagerImpl : ISPUserManager {
    override fun removeUser(user: ISPUser): Boolean {
        // repository.removeUser()
        return true
    }

    override fun updateRole(user: ISPUser, newRole: String) {
        // repository.updateUserRole(user.id, newRole)
    }

    override fun getUser(userId: Int): ISPUser {
        return ISPUserImpl()
    }
}
