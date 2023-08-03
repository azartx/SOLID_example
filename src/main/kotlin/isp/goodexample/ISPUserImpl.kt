package isp.goodexample

class ISPUserImpl : ISPUser {
    override val id: Int = 1
    override var role: String = "Admin"

    override fun getName(): String {
        return "Some username"
    }

    override fun getEmail(): String {
        return "Some email"
    }
}
