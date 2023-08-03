package lsp.badexample

class LSPViolationSimpleUser : LSPViolationUser {

    var username: String = "Simple Username"; private set

    override fun updateUsername(newUsername: String) {
        username = newUsername
    }

    override fun updateEmail(newEmail: String) {
        throw NotImplementedError("Simple user has no access to change username")
    }

    override fun toString(): String {
        return "User fields:\n$username"
    }
}