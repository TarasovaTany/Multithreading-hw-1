class MyThread extends Thread {
    private final int timeout;

    public MyThread(ThreadGroup group, String name, int timeout) {
        super(group, name);
        this.timeout = timeout;
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
