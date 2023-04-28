public class TestTryCatch {
    public static void m() //solleva una IllegalStateException
    {
        throw new IllegalStateException("non dovevi chiamarmi");
    }

    public static void main(String[] args) {
        try {
            m();//otteniamo una IllegalStateException: prossima riga saltata
            System.out.println("Impossibile! ho la risposta di m()");
        } catch (RuntimeException e) {
            //Questa clausola scatta perche'
            //RuntimeException include IllegalStateException
            System.out.println("catturata IllegalStateException):\n" + e);
        } catch (Exception e) {
            //Questo catch verrebbe raggiunto da
            //eccezioni diverse da IllegalStateException
            System.out.println
                    ("catturata eccezione (non IllegalStateException):\n" + e);
        } finally {
            //qui volendo posso aggiungere una clausola
            //che sara' eseguita sia che arriviamo da try che da un catch
            System.out.println("\n...posto per la clausola finale...\n");
        }
    }
}
