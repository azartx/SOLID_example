package dip.bedexample

class DIPViolationNotificationService {
    fun sendNotification(message: String) {
        DIPViolationEmailNotification().sendNotification(message)
    }
}
