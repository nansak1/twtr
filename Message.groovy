package seng

class Message {

    Account account
    String text
    static belongsTo = Account

    static constraints = {
    }
}
