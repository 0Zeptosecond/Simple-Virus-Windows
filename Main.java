import java.awt.*;
import java.awt.event.KeyEvent;

class Main {
  public static void main(String[] args) throws AWTException {
    Robot robot = new Robot();

    while (true) {
      robot.mouseMove(0, 0);

      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      robot.keyRelease(KeyEvent.VK_BACK_SPACE);

      robot.keyPress(KeyEvent.VK_ESCAPE);
      robot.keyRelease(KeyEvent.VK_ESCAPE);

      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_F4);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_F4);

      Thread.sleep(20);
    }
  }
}
