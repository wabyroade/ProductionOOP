package com.wyattbyroade.productionoop;

/**
 * The ScreenSpec interface sets up methods that must be implemented for all screen objects.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public interface ScreenSpec {
  String getResolution();
  int getRefreshRate();
  int getResponseTime();
}
