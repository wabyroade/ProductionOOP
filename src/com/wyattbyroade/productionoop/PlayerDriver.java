package com.wyattbyroade.productionoop;

import java.util.ArrayList;

public class PlayerDriver {
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
