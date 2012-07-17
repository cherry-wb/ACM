import java.util.*;

class Main {

    void run() {
        //Scanner in = new Scanner(System.in);
        MyReader in = new MyReader();

    }

    public static void main(String args[]) {
        new Main().run();
    }
    
    void debug(Object...x) {
        System.out.println(Arrays.deepToString(x));
    }
}

class MyReader {
    BufferedReader br = new BufferedReader (
            new InputStreamReader (System.in));
    StringTokenizer in;
    String next() throws Exception {
        while (in == null || !in.hasMoreTokens()) {
            in = new StringTokenizer(br.readLine());
        }
        return in.nextToken();
    }
    int nextInt() throws Exception {
        return Integer.parseInt(next());
    }
}
