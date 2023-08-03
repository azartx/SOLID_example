package dip

import dip.bedexample.DIPViolationNotificationService
import dip.goodexample.DIPEmailNotification
import dip.goodexample.DIPNotification
import dip.goodexample.DIPNotificationService
import dip.goodexample.DIPSmsNotification

/**
 * Dependency Inversion Principle
 *
 * The Dependency Inversion Principle states that the most flexible systems are those in
 * which code dependencies refer only to abstractions, not to concretions.
 */
fun main(args: Array<String>) {
    println("Bad example: you must send only email notifications.")
    println("Important think is that Notification service depends on EmailNotification dependency\n")
    badExample()
    println("Good example: you should use any types of notifications which you implements.")
    println("And your Notification service is depends only on abstraction")
    goodExample()
}

private fun badExample() {
    val notificationService = DIPViolationNotificationService()
    notificationService.sendNotification("Some message. Send via email and only email")
}

private fun goodExample() {
    val notificationService = DIPNotificationService()
    val emailNotification: DIPNotification = DIPEmailNotification()
    val smsNotification: DIPNotification = DIPSmsNotification()
    val message = "Some message which send via email and via sms"

    notificationService.sendNotification(emailNotification, message)
    notificationService.sendNotification(smsNotification, message)
}
