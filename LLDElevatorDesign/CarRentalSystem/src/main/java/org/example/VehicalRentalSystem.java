package org.example;

import java.util.List;

public class VehicalRentalSystem {

  List<Store> storeList;
  List<User> userList;

  VehicalRentalSystem(List<Store> stores, List<User> users) {

    this.storeList = stores;
    this.userList = users;
  }


  public Store getStore(Location location){

    //based on location, we will filter out the Store from storeList.
    return storeList.get(0);
  }

}
