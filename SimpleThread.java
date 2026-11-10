public class SimpleThread {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            System.out.println("Hello from the background thread! Name: " + Thread.currentThread().getName());
        });
        myThread.start();
        System.out.println("Hello from the main thread! Name: " + Thread.currentThread().getName());
    }
}
