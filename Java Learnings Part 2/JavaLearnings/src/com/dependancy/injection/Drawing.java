package com.dependancy.injection;


//this class performs loose coupling between Shape & Triangle,Square

public class Drawing {
	
	private Shape shape;

	public Shape getShape() {
		return this.shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape(){
		this.shape.draw();
	}

}
