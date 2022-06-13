public class ThreadedWorkerWithLock extends Thread {
  private ResourcesExploiterWithLock rExp;

  public ThreadedWorkerWithLock(ResourcesExploiterWithLock rExploiter) {
    this.rExp = rExploiter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      rExp.exploit();
    }
  }
}
