package com.wyattbyroade.productionoop;

/**
 * The class MoviePlayer is used to create objects with screens that implement MultimediaControl methods.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class MoviePlayer extends Product implements MultimediaControl {
//  Create a toString method that calls the product toString, displays the monitor and the screen details.

  private Screen screen;
  private MonitorType monitorType;

  /**
   * Instantiates a new Movie player.
   *
   * @param nameInput   the name input
   * @param screenParam the screen param
   * @param monitorType the monitor type
   */
  MoviePlayer(String nameInput, Screen screenParam, MonitorType monitorType) {
    super(nameInput);
    screen = screenParam;
//    not sure if this is necessary
    this.monitorType = monitorType;
  }

  /**
   * Outputs "Playing" to console
   */
  @Override
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Outputs "Stopping" to console
   */
  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Outputs "Previous" to console
   */
  @Override
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Outputs "Next" to console
   */
  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * Returns String representation of this object to calling method
   *
   * @return String representation of super class as well as MonitorType to console
   */
  public String toString() {
    return super.toString() + "\n"
            + screen.toString() + "\n"
            + "Monitor Type : " + monitorType.toString();
  }
}
