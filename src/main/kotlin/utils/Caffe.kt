package utils

data class Caffe(
    val type: CaffeType
) {
    override fun toString(): String {
        return type.caffeName.plus(" is ready!")
    }
}
