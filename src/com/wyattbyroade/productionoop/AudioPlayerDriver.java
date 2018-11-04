package com.wyattbyroade.productionoop;

/**
 * The AudioPlayerDriver class is used to instantiate and test AudioPlayer objects.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer testPlayer1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer testPlayer2 = new AudioPlayer("Walkman", "WAV");
    testPlayer1.play();
    testPlayer1.stop();
    testPlayer1.next();
    testPlayer1.previous();
    System.out.println(testPlayer1);
    System.out.println(testPlayer2);
  }
}
