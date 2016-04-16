package com.acadgild.session.five;

public class Triangle extends Rectangle{
	float area;

	Triangle(int v, int u) {
		super(u, v);
	}

	float getTriangle() {
		area = (float) length / 2 * length * breadth;
		return (area);
	}

}
