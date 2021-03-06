package net.egork;

import net.egork.collections.intcollection.IntHashSet;
import net.egork.collections.intcollection.IntSet;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class AliceAndBobRevisited {
	int[][] result = new int[21][21];

	{
		ArrayUtils.fill(result, -1);
	}

    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int rowCount = in.readInt();
		int columnCount = in.readInt();
		if (solve(rowCount, columnCount) == 0) {
			out.printLine("Bob");
		} else {
			out.printLine("Alice");
		}
    }

	private int solve(int rowCount, int columnCount) {
		if (result[rowCount][columnCount] != -1) {
			return result[rowCount][columnCount];
		}
		if (rowCount == 0 || columnCount == 0) {
			return result[rowCount][columnCount] = 0;
		}
		IntSet possible = new IntHashSet();
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				possible.add(solve(i, j) ^ solve(i, columnCount - j - 1) ^ solve(rowCount - i - 1, j) ^
					solve(rowCount - i - 1, columnCount - j - 1));
			}
		}
		for (int i = 0; ; i++) {
			if (!possible.contains(i)) {
				return result[rowCount][columnCount] = i;
			}
		}
	}
}
