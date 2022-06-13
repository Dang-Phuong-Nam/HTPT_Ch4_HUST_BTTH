public class ThreadedWorkerWithSync extends Thread {
  private ResourceExploiter rExp;

  public ThreadedWorkerWithSync(ResourceExploiter rExploiter) {
    this.rExp = rExploiter;
  }

  @Override
  public void run() {
    synchronized (rExp) {
      for (int i = 0; i < 1000; i++) {
        rExp.exploit();
      }
    }
  }
}
