public class Shapemain
{
public static void displayCommonArea(Shape obj)
{
System.out.println("Area:"+obj.area);
}

public static void main(String args[])
{
Shapemain.displayCommonArea(new Rectangle(10,20));
}
}
}