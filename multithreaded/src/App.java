public class App {
    public static void main(String[] args) throws Exception {
        ResourceExploiter resoure = new ResourceExploiter(0);
        ResourcesExploiterWithLock rWL = new ResourcesExploiterWithLock(0);
        // ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resoure);
        // ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resoure);
        // ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resoure);
        // ThreadedWorkerWithSync worker1 = new ThreadedWorkerWithSync(resoure);
        // ThreadedWorkerWithSync worker2 = new ThreadedWorkerWithSync(resoure);
        // ThreadedWorkerWithSync worker3 = new ThreadedWorkerWithSync(resoure);
        ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(rWL);
        ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(rWL);
        ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(rWL);
        worker1.start();
        worker2.start();
        worker3.start();

        worker1.join();
        worker2.join();
        worker3.join();
        System.out.println(rWL.getRsc());
    }
}
