package com.wyattbyroade.productionoop;

import java.util.ArrayList;

/**
 * The class PlayerDriver serves as driver class for AudioPlayer and MoviePlayer classes.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class PlayerDriver {
  /**
   * The testPlayerControls method loops through an ArrayList to test the controls implemented in MultimediaControl interface.
   */
  public static void testPlayerControls() {
    ArrayList<MultimediaControl> controlledDevList;
    controlledDevList = new ArrayList<>();
    AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer moviePlayer1 = new MoviePlayer("iPod",new Screen("1920x1080",60,23),MonitorType.LED);

    controlledDevList.add(audioPlayer1);
    controlledDevList.add(moviePlayer1);

    for(MultimediaControl thisPlayer : controlledDevList) {
      thisPlayer.play();
      thisPlayer.stop();
      thisPlayer.next();
      thisPlayer.previous();
    }
  }

}
