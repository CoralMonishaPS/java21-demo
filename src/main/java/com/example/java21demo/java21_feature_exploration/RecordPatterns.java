package com.example.java21demo.java21_feature_exploration;

public class RecordPatterns {
    public static void main(String[] args) {
        //Rest API Response
        record UserResponse(String name, String email, String role) {
        }

        UserResponse response = new UserResponse("Alice", "alice@hotmail.com", "Admin");
        if (response instanceof UserResponse(String name, String email, String role)) {
            System.out.println(name + " :Name " + email + " :Email " + role + " :role");

        }
        //Parsing Complex Datastructures: Nested Records
        record Address(String city, String state) {
        }
        record User(String name, Address address) {
        }

        User user = new User("Bob", new Address("Seattle", "WA"));
        if (user instanceof User(String name, Address(String city, String state))) {
            System.out.println("Name: " + name + " City:" + city + " State: " + state);
        }

        //Pattern matching in switch statements: Routing request

        record HttpRequest(String method, String path) {
        }
        HttpRequest request = new HttpRequest("GET", "/users");
        switch (request) {
            //record pattern in java 21 is a preview feature
            //case HttpRequest("GET", "/users") -> System.out.println("Fetching users");
            //case HttpRequest("POST","/users")->System.out.println("Creating users");
            default -> System.out.println("Unhandled request");
        }

        //Unit Testing
        //assertions are disabled by default, can be enabled by providing -ea in VM configs
        record Transaction(String id,double amount,String status){}
        Transaction transaction=new Transaction("tx123",500.0,"PENDING");
        assert transaction instanceof Transaction(String id,double amount,String status) && "tx123".equals(id) && 500.0==(amount):"Assertion failed";
    }
}
