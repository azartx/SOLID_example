package lsp.goodexample

class LSPUserImpl : LSPUser {

    var username: String = "Simple User"; private set

    override fun updateUsername(newUsername: String) {
        username = newUsername
    }

    override fun toString(): String {
        return "Simple User fields:\n$username"
    }
}