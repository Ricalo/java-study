package com.ricalo.dabble;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Map;
import com.google.common.collect.Maps;

class Fibonacci {
  Map<Integer, Long> memory;

  public Fibonacci() {
    memory = Maps.newHashMap();
  }

  public long calculate(@NonNull int input) {
    if (input == 0) {
      return 0;
    } else if (input == 1) {
      return 1;
    } else if (memory.containsKey(input)) {
      return memory.get(input);
    } else {
      Long returnValue = calculate(input - 2) + calculate(input - 1);
      memory.put(input, returnValue);
      return returnValue;
    }
  }
}
