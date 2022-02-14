package com.example.DrawerAllocation.Controller;

import com.example.DrawerAllocation.DTO.CustomerReleaseDto;
import com.example.DrawerAllocation.DTO.LSDRWRRELDto;
import com.example.DrawerAllocation.Service.CustomerReleaseService;
import com.example.DrawerAllocation.Service.LSDRWRRELService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.spi.CurrencyNameProvider;

@RestController
@RequestMapping("/api/cr")
public class CustomerReleaseController {

    private CustomerReleaseService customerReleaseService;

    public CustomerReleaseController(CustomerReleaseService customerReleaseService) {
        this.customerReleaseService = customerReleaseService;
    }

    @GetMapping("/get")
    public String getPost(){
        return "Connect Successfully";
    }


    @GetMapping("/getAll")
    public List<CustomerReleaseDto> GetAllRelease(){
        return customerReleaseService.GetAllRelease();
    }


    @GetMapping("/{lckrid}")
    public ResponseEntity<CustomerReleaseDto> getCustomerById(@PathVariable(name = "lckrid") long lckrid){
        return ResponseEntity.ok(customerReleaseService.getBySomeColumn(lckrid));
    }

    @PostMapping
    public ResponseEntity<CustomerReleaseDto> createPost(@RequestBody CustomerReleaseDto customerReleaseDto){
        return new ResponseEntity<>(customerReleaseService.createCustomerRelease(customerReleaseDto), HttpStatus.CREATED);
    }

    @PutMapping("/{lckrid}")
    public ResponseEntity<CustomerReleaseDto> updateCustomerRelease(@RequestBody CustomerReleaseDto customerReleaseDto, @PathVariable(name = "lckrid") long lckrid){
        CustomerReleaseDto customerReleaseResponse = customerReleaseService.updateCustomerRelease(customerReleaseDto , lckrid);
        return new ResponseEntity<>(customerReleaseResponse,HttpStatus.OK);
    }

    @DeleteMapping("/{lckrid}")
    public  ResponseEntity<String> deleteCustomerRelease(@PathVariable(name = "lckrid") long lckrid){
        customerReleaseService.deleteCustomerReleaseById(lckrid);
        return new ResponseEntity<>("Locker entity deleted successfully.", HttpStatus.OK);
    }


//    @DeleteMapping("/{RELID}")
//    public ResponseEntity<String> deleteLSDRWRREL(@PathVariable(name="RELID") long RELID){
//        lsdrwrrelService.deleteLSDRWRRELById(RELID);
//        return new ResponseEntity<>("Locker entity deleted successfully.", HttpStatus.OK);
//    }

//    @PostMapping("/post")
//    public ResponseEntity<LSDRWRRELDto> createPost(@RequestBody LSDRWRRELDto lsdrwrrelDto){
//        return new ResponseEntity<>(lsdrwrrelService.createLSDRWRREL(lsdrwrrelDto), HttpStatus.CREATED);
//
//    }
}