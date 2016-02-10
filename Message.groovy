package seng

class Message {


    String msgText
    Date dateCreated
    static hasOne = [acc: Account]

    static constraints = {
        msgText nullable: false, size:1..40, blank: false
    }
}


