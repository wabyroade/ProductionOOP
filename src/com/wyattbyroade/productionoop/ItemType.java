package com.wyattbyroade.productionoop;

/**
 * The ItemType is an enum-based type designed to categorize all Product subclasses
 * by four specific descriptions and codes.
 *
 * @author  Wyatt Byroade
 * @version 1.0
 * @since   2018-09-29
 */
public enum ItemType {
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");

  String code;

  ItemType(String code) {
    this.code = code;
  }

  String getCode() {
    return code;
  }
}
