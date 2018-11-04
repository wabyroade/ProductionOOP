package com.wyattbyroade.productionoop;

/**
 * The ItemType is an enum-based type designed to categorize all Product subclasses
 * by four specific descriptions and codes.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  String code;

  ItemType(String code) {
    this.code = code;
  }

  String getCode() {
    return code;
  }
}
