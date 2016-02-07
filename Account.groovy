package seng

class Account {

    String handle
    String email
    String password
    String name
    static hasMany = [messages:Message]


    static constraints = {
        handle nullable: false unique
        email nullable: false unique
        password nullable: false
        name: nullable: false

    }
}
