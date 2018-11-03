package com.wyattbyroade.productionoop;

public class MoviePlayer extends Product implements MultimediaControl {
//  Create a toString method that calls the product toString, displays the monitor and the screen details.

  private Screen screen;
  private MonitorType monitorType;

  MoviePlayer(String nameInput, Screen screenParam, MonitorType monitorType) {
    super(nameInput);
    screen = screenParam;
//    not sure if this is necessary
    this.monitorType = monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  public String toString() {
    return super.toString() + "\n"
            + screen.toString() + "\n"
            + "Monitor Type : " + monitorType.toString();
  }
}
