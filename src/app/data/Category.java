package app.data;

public class Category {
    // Encapsulation
    private String id;
    private Boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if ( id != null) {
            this.id = id;
        }
    }

    public Boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
