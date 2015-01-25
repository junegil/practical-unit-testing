package com.practicalunittesting.chapter5.phone;

import com.google.common.collect.Lists;

import java.util.List;

public class Client {

  private final List<Phone> phones = Lists.newArrayList();

  public void addPhone(Phone phone) {
    phones.add(phone);
  }

  public boolean hasMobile() {
    for (Phone phone : phones) {
      if (phone.isMobile())
        return true;
    }
    return false;
  }
}
