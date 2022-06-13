public class ThreadedWorkerWithoutSync extends Thread {
  private ResourceExploiter rExp;

  public ThreadedWorkerWithoutSync(ResourceExploiter rExploiter) {
    this.rExp = rExploiter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      rExp.exploit();
    }
  }

}
