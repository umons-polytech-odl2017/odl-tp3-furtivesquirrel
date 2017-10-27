package exo1;

import javax.swing.*;
import java.awt.*;
import java.awt.Point;

class SubPanel extends JPanel {
	private Drawable[] drawables;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Drawable drawable : drawables) {
			drawDrawable(drawable, g);
		}
	}

	private void drawDrawable(Drawable drawable, Graphics g) {
		java.awt.Point[] vertices = drawable.getVertices();
		for (int i = 1; i < vertices.length; ++i) {
			java.awt.Point currentVertex = vertices[i];
			java.awt.Point previousVertex = vertices[i - 1];
			drawLineBetweenVertices(previousVertex, currentVertex, g);
		}

		java.awt.Point lastVertex = vertices[vertices.length - 1];
		java.awt.Point firstVertex = vertices[0];
		drawLineBetweenVertices(lastVertex, firstVertex, g);
	}

	private void drawLineBetweenVertices(java.awt.Point vertex1, Point vertex2, Graphics g) {
		g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());
	}

	void draw(Drawable[] drawables) {
		this.drawables = drawables;
		this.repaint();
	}
}
