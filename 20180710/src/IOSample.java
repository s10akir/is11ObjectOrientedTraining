import java.io.*;

/**
 * @author Akira Shinohara
 * @since 2018.07.10
 */
public class IOSample {
    public static void main(String[] args) {
        new MyClass().mainProc();
    }
}


class MyClass {
    //InputStream is = System.in;
    InputStream is;

    {
        try {
            is = new FileInputStream("/data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);

    OutputStream os = System.out;
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);

    String buf;


    void mainProc() {
        try {
            while (!(buf = br.readLine()).matches("^#exit$")) {
//            while (true) {
                bw.write(buf);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}