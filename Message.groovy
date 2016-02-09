package seng

class Message {

    Account myAcc
    String msgText
    static belongsTo = [acc: Account]

    static constraints = {
        msgText nullable: false, size:1..40, blank: false
    }
}


