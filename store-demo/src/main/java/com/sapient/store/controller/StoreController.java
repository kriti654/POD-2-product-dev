package com.sapient.store.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.sapient.store.entity.Store;
import com.sapient.store.exceptions.StoreException;
import com.sapient.store.service.IStoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
@Api
public class StoreController {
 
 @Autowired
 private IStoreService storeService;
    
	@ApiOperation(
			value = "Find Store By ID",
			consumes = "Store ID",
			produces = "Store object",
			response = Store.class,
			tags = "findByStoreId",
			notes = "http://localhost:8081/rvy/v1/store/1"
			)
	@GetMapping("/store/{storeId}")
	public ResponseEntity<Store> findStoreById(@PathVariable("storeId") 
	                                           Integer storeId){
		try {
			return new ResponseEntity<>(
					 storeService.getStoreById(storeId)
					,HttpStatus.OK);
		} catch(StoreException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
	}
	
	@ApiOperation(value = "Add Store",
			consumes = "Store object",
			produces = "Store object",
			response = Store.class,
			tags = "postStore",
			notes = "http://localhost:8081/rvy/v1/store"
			)
	@PostMapping("/store")
	public ResponseEntity<Store> addStore(@Valid @RequestBody Store store,
			BindingResult bindingResult) {
		try {
		if(bindingResult.hasErrors()) {
			throw new StoreException(bindingResult.getAllErrors().toString());
		}
	      return ResponseEntity.ok().body(storeService.addStore(store));	
	   } catch(StoreException e) {
		   throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE,
				   e.getMessage());
	   }
	}
	
	@ApiOperation(value = "Find All stores",			
			produces = "List of Store objects",
			response = Store.class,
			tags = "findAllStores",
			notes = "http://localhost:8081/rvy/v1/stores"
			)
	@GetMapping("/stores")
	public ResponseEntity<List<Store>> findAllStores() {
		try {
			return new ResponseEntity<>(storeService.getStores(),
					HttpStatus.OK);
		}catch(StoreException e) {
		   throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
	}
	
	@ApiOperation(value = "Update Store",
			consumes = "Store object",
			produces = "Store object",
			response = Store.class,
			tags = "updateStore",
			notes = "http://localhost:8081/rvy/v1/store"
			)
	@PutMapping("/store")
	public ResponseEntity<Store> updateStore(@Valid @RequestBody Store store,
			BindingResult bindingResult) throws StoreException{
		try {
		if(bindingResult.hasErrors()) {
			throw new StoreException(bindingResult.getAllErrors().toString());
		}
		 return ResponseEntity.ok(storeService.updateStore(store));
	  
		} catch(StoreException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT,e.getMessage());
		}
	}
	
	@ApiOperation(value = "Find All stores in a region",			
			produces = "List of store objects",
			response = Store.class,
			tags = "findAllStores",
			notes = "http://localhost:8081/rvy/v1/storesByRegion"
			)
	@GetMapping("/storesByRegion/{regionId}")
	public ResponseEntity<List<Store>> findAllStoresByRegion(
	                              @PathVariable("regionId") Integer regionId) {
		try {
			return new ResponseEntity<>(storeService.getByRegionId(regionId),
					HttpStatus.OK);
		}catch(StoreException e) {
		   throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
	}
	
	@ApiOperation(value = "Delete Store",			
			produces = "Boolean indication of deleted object",
			response = Boolean.class,
			tags = "deleteRestaurant",
			notes = "http://localhost:8081/rvy/v1/store/1"
			)
	@DeleteMapping("/store/{storeId}")
	public ResponseEntity<Boolean> deleteStore(@PathVariable("storeId")
	                                           Integer storeId){
		try {
			return new ResponseEntity<>(storeService.deleteStore(storeId),
					HttpStatus.OK);
		} catch(StoreException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					e.getMessage());
		}
	}
	
	
}
