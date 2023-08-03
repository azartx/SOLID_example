package isp.goodexample

interface ISPUser {
    val id: Int
    var role: String

    fun getName(): String
    fun getEmail(): String
}
