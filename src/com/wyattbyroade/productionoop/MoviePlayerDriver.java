package com.wyattbyroade.productionoop;

public class MoviePlayerDriver {
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
