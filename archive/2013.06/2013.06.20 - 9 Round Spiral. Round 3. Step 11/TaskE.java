package net.egork;

import net.egork.geometry.Point;
import net.egork.geometry.Polygon;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskE {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		Point point = Point.readPoint(in);
		Point[] points = new Point[count];
		for (int i = 0; i < count; i++) {
			points[i] = Point.readPoint(in);
		}
		out.printLine(new Polygon(points).contains(point) ? "YES" : "NO");
	}
}
