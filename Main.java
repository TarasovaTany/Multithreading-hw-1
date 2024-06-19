public class Main {
    public static void main(String[] args) throws InterruptedException {
        final ThreadGroup mainGroup = new ThreadGroup("main group");

        System.out.println("Создаю потоки...");

        Thread thread1 = new MyThread(mainGroup, "Поток 1", 1000);
        Thread thread2 = new MyThread(mainGroup, "Поток 2", 1500);
        Thread thread3 = new MyThread(mainGroup, "Поток 3", 1900);
        Thread thread4 = new MyThread(mainGroup, "Поток 4", 2000);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
