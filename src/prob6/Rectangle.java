package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return (width+height)*2;
	}
	public void resize(double s){
		width = width * s; 
		height = height * s; 
	}
}
