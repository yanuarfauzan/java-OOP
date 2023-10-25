package app.data;

public class Country {
    // Static inner class
    private String name; 

    public String getName()
    {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static class City{
        private String name;

        public String getName()
        {
            return this.name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }
}
