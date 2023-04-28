import java.io.*; //per le IOException

public class TestError {
    public static void m()
    //Error e' non controllato, non devo scrivere throws
    {
        throw new Error("error");
    }

    public static void m2() throws IOException
    //IOException e' controllato, devo scrivere throws
    {
        throw new IOException("io exception");
    }

    public static void m3()
    //RuntimeException e' non controllata, non devo scrivere throws
    {
        throw new RuntimeException("runtime exception");
    }

    public static void main(String[] args) {
        try {
            m();
            m2();
            m3();
        } catch (Throwable e) //catturo tutti gli errori o eccezioni
        {
            System.out.println("Captured: " + e);
        }
    }
}
