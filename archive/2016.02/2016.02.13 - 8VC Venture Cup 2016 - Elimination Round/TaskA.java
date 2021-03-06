package net.egork;

import net.egork.collections.map.Counter;
import net.egork.generated.collections.pair.IntIntPair;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import static net.egork.io.IOUtils.*;
import static net.egork.misc.MiscUtils.*;
import static net.egork.misc.ArrayUtils.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[] path = readCharArray(in, n);
        Counter<IntIntPair> counter = new Counter<>();
        counter.add(new IntIntPair(0, 0));
        int x = 0;
        int y = 0;
        long answer = 0;
        for (char c : path) {
            switch (c) {
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            }
            IntIntPair key = new IntIntPair(x, y);
            answer += counter.get(key);
            counter.add(key);
        }
        out.printLine(answer);
    }
}
