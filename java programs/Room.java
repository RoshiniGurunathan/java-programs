public class Room
 {
	public static void main(String args[])
	 {
	Room obj=new Room();
	obj.width=10;
	obj.height=20;
	obj.length=10;
	
	double volume;
	volume=obj.width*obj.height*obj.length;
	System.out.println("Volume:" +volume);
	}
}
