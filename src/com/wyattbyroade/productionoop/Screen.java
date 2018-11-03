package com.wyattbyroade.productionoop;

public class Screen implements ScreenSpec {
  private String resolution;
  private int refreshrate;
  private int responsetime;

  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }

  public String toString() {
    return "Resolution : " + resolution + "\n"
            + "Refresh Rate : " + refreshrate + "\n"
            + "Response Time : " + responsetime;
  }
}
