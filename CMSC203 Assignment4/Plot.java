
public class Plot {
	
	private int x, y, width, depth;
	
	Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	Plot(Plot otherPlot)
	{
		this.x = otherPlot.getX();
		this.y = otherPlot.getY();
		this.width = otherPlot.getWidth();
		this.depth = otherPlot.getDepth();
	}
	
	public Boolean overlaps(Plot plot)

	{

		boolean flag;

		int fullX = this.x + width;

		int fullY = this.y + depth;

		int x2 = plot.getX();

		int y2 = plot.getY();

		int x2Full = plot.getX() + plot.getWidth();

		int y2Full = plot.getY() + getDepth();
		

		if(this.x >= x2 || this.x <= x2Full || fullY >= y2 || this.y <= y2Full)

			flag = true;

		else

		flag = false;
		
		return flag;

	}
	
	public boolean encompasses(Plot plot)
	{
		boolean flag = false;
		int x2 = plot.getX() + plot.getWidth();
		int y2 = plot.getY() + plot.getDepth();
		
		if(plot.getX() >= 0 && plot.getX() <= 10 && x2 >= 0  && x2 <= 10)
		{
			if(plot.getY() >= 0 && plot.getY() <= 10 && y2 >= 0 && y2 <= 10)
			{
				flag = true;
			}
		}
		return flag;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	@Override 
	public String toString()
	{
		return this.x + "," + this.y + "," + this.width + "," +  this.depth;
	}
	
}
