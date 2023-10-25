package app.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    // membuat lebih dari satu constructor (harus akses contructor default nya)
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public String sayHello() {
        return this.username;
    }
    
}
