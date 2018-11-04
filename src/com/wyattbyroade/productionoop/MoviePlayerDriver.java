package com.wyattbyroade.productionoop;

/**
 * The class MoviePlayer is used to create objects with screens that implement MultimediaControl methods.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class MoviePlayerDriver {

  /**
   * The testMoviePlayer method instantiates and tests some methods of a MoviePlayer object.
   */
  public static void testMoviePlayer() {
    MoviePlayer movPlayer1 = new MoviePlayer("iPad",new Screen("1920x1080",60,
            23), MonitorType.LED);
    movPlayer1.play();
    movPlayer1.stop();
    movPlayer1.next();
    movPlayer1.previous();

    System.out.println(movPlayer1);
  }
}
