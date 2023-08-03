package dip.goodexample

class DIPNotificationService {
    fun sendNotification(notification: DIPNotification, message: String) {
        notification.sendNotification(message)
    }
}
