import java.io.*;

public class StubInput {

    String input;

    public String getUserInput(String input) throws IOException {
        InputStream stdin=System.in;
        ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        this.input=reader.readLine();
        System.setIn(stdin);
        return this.input;
    }
}