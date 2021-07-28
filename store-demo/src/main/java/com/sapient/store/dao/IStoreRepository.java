package com.sapient.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.store.entity.Store;

public interface IStoreRepository extends JpaRepository<Store, Integer> {
	
	List<Store> findByRegionId(Integer regionId);
}
