public class Rectangle extends Shape{
    @Override
    int getCorner()
    {
        return 4;
    }

    int getParentConrner()
    {
        // Keyword super (field dan method) 
        return super.getCorner();
    }
}
