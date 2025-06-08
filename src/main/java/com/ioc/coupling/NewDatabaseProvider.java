package com.ioc.coupling;

public class NewDatabaseProvider extends UserDatabaseProvider {

    @Override
    public String getUserDetails() {
        return "New Database in Action";
    }
}
