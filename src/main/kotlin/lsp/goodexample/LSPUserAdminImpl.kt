package lsp.goodexample

class LSPUserAdminImpl : LSPUserAdmin {
    var username: String = "Simple User"; private set
    var email: String = "user.email@gmail.com"; private set

    override fun updateEmail(newEmail: String) {
        email = newEmail
    }

    override fun updateUsername(newUsername: String) {
        username = newUsername
    }

    override fun toString(): String {
        return "User admin fields:\n$username\n$email"
    }
}