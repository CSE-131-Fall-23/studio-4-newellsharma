package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);

		StdDraw.rectangle(0.5, 0.5, 0.4, 0.2);
		StdDraw.setPenColor(143,0,0);

		StdDraw.filledCircle(0.5, 0.5, 0.1);
	}
}