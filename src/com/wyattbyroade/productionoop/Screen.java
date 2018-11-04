package com.wyattbyroade.productionoop;

/**
 * The class Screen is used to create objects to hold technical data about part of a manufactured electronic device.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class Screen implements ScreenSpec {
  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Instantiates a new Screen.
   *
   * @param resolution   the resolution
   * @param refreshrate  the refreshrate
   * @param responsetime the responsetime
   */
  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  /**
   * Used to return the resolution to calling method
   *
   * @return String representing resolution of screen object
   */
  @Override
  public String getResolution() {
    return resolution;
  }

  /**
   * Used to return the refresh rate to calling method
   *
   * @return int representing refresh rate of screen object
   */
  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  /**
   * Used to return the response time to calling method
   *
   * @return int representing response time of screen object
   */
  @Override
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * Returns String representation of this object to calling method
   *
   * @return String representation of resolution, refresh rate and response time, separated by newlines
   */
  public String toString() {
    return "Resolution : " + resolution + "\n"
            + "Refresh Rate : " + refreshrate + "\n"
            + "Response Time : " + responsetime;
  }
}
