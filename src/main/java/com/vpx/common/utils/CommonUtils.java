package com.vpx.common.utils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.stream.Stream;

/** @author PalMurugan C */
public class CommonUtils {

  public static Stream<?> collectionAsStream(Collection<?> collection) {
    return CollectionUtils.emptyIfNull(collection).stream();
  }
}
