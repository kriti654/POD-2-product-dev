package com.sapient.store.service;

import java.util.List;

import com.sapient.store.entity.Store;
import com.sapient.store.exceptions.StoreException;

public interface IStoreService {
      public abstract Store getStoreById(Integer storeId) throws StoreException;
      public abstract List<Store> getStores() throws StoreException;
      public abstract Store addStore(Store store) throws StoreException;
      public abstract Store updateStore(Store store) throws StoreException;
      public abstract boolean deleteStore(Integer storeId) throws StoreException;
      public abstract List<Store> getByRegionId(Integer regionId) throws StoreException;
}


