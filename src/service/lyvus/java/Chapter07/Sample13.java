package service.lyvus.java.Chapter07;

public class Sample13 extends Thread {
  public void run() {
    System.out.println("Thread run");
  }

  public static void main(String[] args) {
    Sample13 sample13 = new Sample13();
    sample13.start();
  }
}
