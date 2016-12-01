package transformer;

import java.awt.Graphics2D;

import shapes.GShape;

public class GResizer extends GTransformer {
	public GResizer(GShape shape) {
		super(shape);
	}
	public void initTransforming(int x, int y, Graphics2D g2D) {
		this.getShape().setPoint(x, y);
		this.getShape().draw(g2D);
	}
	public void keepTransforming(int x, int y, Graphics2D g2D) {
		this.getShape().draw(g2D);
		this.getShape().resize(x, y);
		this.getShape().draw(g2D);
	}
	public void finishTransforming(int x, int y, Graphics2D g2D) {
	}
	public void continueTransforming(int x, int y, Graphics2D g2D) {
	}

}
