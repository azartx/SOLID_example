package ocp.badexample

data class OCPViolationAuthInfo(
    val email: String = "",
    val phone: String = "",
    val anon: Boolean = false
)