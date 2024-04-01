package com.example.actualapp.userRelated;

public class Friend {

    private String username;
    private String id;
    private String email;

    private Friend(String username, String id, String email){
        this.username = username;
        this.id  = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }


    public static class FriendBuilder {
        private String username;
        private String id;
        private String email;

        public FriendBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public FriendBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public FriendBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public Friend Build(){
            return new Friend(username, id, email);
        }

    }

}
