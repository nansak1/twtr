package seng

class Account {
    String accountHandle
    String fullName
    String emailAddress
    String accountPassword

    static hasMany=[msg: Message,followers:Account,following:Account]

    static constraints = {
        accountHandle nullable:false, blank:false, unique:true
        fullName nullable:false, blank:false
        emailAddress nullable:false, blank:false, unique:true, email:true
        accountPassword nullable:false, blank:false, size:8..16,matches:"^.(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*\$"


    }

}
