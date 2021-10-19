class Box
{
	int length;
	int breadth;
	int height;
	
	Box(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	void setDim(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
	
}

public class oopsDemo {

	public static void main(String[] args) {
		
		Box whiteBox = new Box (4,5,6);
		System.out.println(whiteBox.volume());
		whiteBox.setDim(5, 6, 7);
		System.out.println(whiteBox.volume());
		
		whiteBox = null;
		
		Box blackBox = new Box (6,7,8);
		System.out.println(blackBox.volume());
		blackBox.setDim(7, 8, 9);
		System.out.println(blackBox.volume());
	}

}
