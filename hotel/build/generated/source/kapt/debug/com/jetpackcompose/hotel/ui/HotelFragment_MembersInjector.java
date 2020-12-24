// Generated by Dagger (https://google.github.io/dagger).
package com.jetpackcompose.hotel.ui;

import com.jetpackcompose.core.HotelService;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class HotelFragment_MembersInjector implements MembersInjector<HotelFragment> {
  private final Provider<HotelService> serviceProvider;

  public HotelFragment_MembersInjector(Provider<HotelService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public static MembersInjector<HotelFragment> create(Provider<HotelService> serviceProvider) {
    return new HotelFragment_MembersInjector(serviceProvider);
  }

  @Override
  public void injectMembers(HotelFragment instance) {
    injectService(instance, serviceProvider.get());
  }

  public static void injectService(HotelFragment instance, HotelService service) {
    instance.service = service;
  }
}
