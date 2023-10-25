package app.data;

public class SocialMedia {
    final void login(String username, String password)
    {
        // isi method
    }
}

final class Facebook extends SocialMedia{
    public void login(String username, String password)
    {
        
    }
}

// error (tidak bisa di extends kalo udah final)
// public class FakeFacebook extends Facebook{

// }
