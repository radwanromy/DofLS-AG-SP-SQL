package com.example.DrawerAllocation.Service.Impl;

import com.example.DrawerAllocation.DTO.CustomerReleaseDto;
import com.example.DrawerAllocation.DTO.LSDRWRRELDto;
import com.example.DrawerAllocation.Entity.CustomerReleaseEntity;
import com.example.DrawerAllocation.Entity.LSDRWRRELEntity;
import com.example.DrawerAllocation.Exception.ResourceNotFoundException;
import com.example.DrawerAllocation.Repository.CustomerReleaseRepository;
import com.example.DrawerAllocation.Service.CustomerReleaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerReleaseServiceImpl implements CustomerReleaseService {

    private CustomerReleaseRepository customerReleaseRepository;

    public CustomerReleaseServiceImpl(CustomerReleaseRepository customerReleaseRepository) {
        this.customerReleaseRepository = customerReleaseRepository;
    }

    @Override
    public List<CustomerReleaseDto> GetAllRelease() {
        List<CustomerReleaseEntity> customerReleaseEntities = customerReleaseRepository.findAll();
        return customerReleaseEntities.stream().map(customerReleases1Entity -> mapToDTO(customerReleases1Entity)).collect(Collectors.toList());
    }

    @Override
    public CustomerReleaseDto getBySomeColumn(long lckrid) {

        CustomerReleaseEntity customerReleaseEntity= customerReleaseRepository.findById(lckrid).orElseThrow(()->new ResourceNotFoundException("CustomerReleaseEntity","lckrid",lckrid));

        return mapToDTO(customerReleaseEntity);
    }

    //Create Customer Release Info
    @Override
    public CustomerReleaseDto createCustomerRelease(CustomerReleaseDto customerReleaseDto) {

        CustomerReleaseEntity customerReleaseEntity = mapToEntity(customerReleaseDto);
        CustomerReleaseEntity newcustomerRelease = customerReleaseRepository.save(customerReleaseEntity);

        CustomerReleaseDto customerReleaseResponse = mapToDTO(newcustomerRelease);
        return customerReleaseResponse;

    }

    @Override
    public CustomerReleaseDto updateCustomerRelease(CustomerReleaseDto customerReleaseDto, long lckrid) {
        CustomerReleaseEntity customerReleaseEntity = customerReleaseRepository.findById(lckrid).orElseThrow(() ->new ResourceNotFoundException("CustomerReleaseEntity","LCKRID",lckrid));
        customerReleaseEntity.setLckrid(customerReleaseDto.getLckrid());
        customerReleaseEntity.setDrwerid(customerReleaseDto.getDrwerid());
        customerReleaseEntity.setAcnumber(customerReleaseDto.getAcnumber());
        customerReleaseEntity.setActitle(customerReleaseDto.getActitle());
        customerReleaseEntity.setDeproduct(customerReleaseDto.getDeproduct());
        customerReleaseEntity.setFcvalue(customerReleaseDto.getFcvalue());
        customerReleaseEntity.setMvalue(customerReleaseDto.getMvalue());
        customerReleaseEntity.setCvalue(customerReleaseDto.getCvalue());
        customerReleaseEntity.setCtype(customerReleaseDto.getCtype());
        customerReleaseEntity.setCtypedes(customerReleaseDto.getCtypedes());
        customerReleaseEntity.setCustomername(customerReleaseDto.getCustomername());
        customerReleaseEntity.setAddress1(customerReleaseDto.getAddress1());
        customerReleaseEntity.setAddress2(customerReleaseDto.getAddress2());
        customerReleaseEntity.setHouse(customerReleaseDto.getHouse());
        customerReleaseEntity.setCityno(customerReleaseDto.getCityno());
        customerReleaseEntity.setPhoneno(customerReleaseDto.getPhoneno());
        customerReleaseEntity.setAllotime(customerReleaseDto.getAllotime());
        customerReleaseEntity.setExpiretime(customerReleaseDto.getExpiretime());
        customerReleaseEntity.setStatus(customerReleaseDto.getStatus());
        CustomerReleaseEntity updateCustomerRelease = customerReleaseRepository.save(customerReleaseEntity);

        return  mapToDTO(updateCustomerRelease);
    }

    @Override
    public void deleteCustomerReleaseById(long lckrid) {
        CustomerReleaseEntity customerReleaseEntity=customerReleaseRepository.findById(lckrid).orElseThrow(()->new ResourceNotFoundException("CustomerRelease","LCKRID",lckrid));

        customerReleaseRepository.delete(customerReleaseEntity);

    }


    //Convert Entity into DTO
    private CustomerReleaseDto mapToDTO(CustomerReleaseEntity customerReleaseEntity){
        CustomerReleaseDto customerReleaseDto= new CustomerReleaseDto();

        customerReleaseDto.setLckrid(customerReleaseEntity.getLckrid());
        customerReleaseDto.setDrwerid(customerReleaseEntity.getDrwerid());
        customerReleaseDto.setAcnumber(customerReleaseEntity.getAcnumber());
        customerReleaseDto.setActitle(customerReleaseEntity.getActitle());
        customerReleaseDto.setDeproduct(customerReleaseEntity.getDeproduct());
        customerReleaseDto.setFcvalue(customerReleaseEntity.getFcvalue());
        customerReleaseDto.setMvalue(customerReleaseEntity.getMvalue());
        customerReleaseDto.setCvalue(customerReleaseEntity.getCvalue());
        customerReleaseDto.setCtype(customerReleaseEntity.getCtype());
        customerReleaseDto.setCtypedes(customerReleaseEntity.getCtypedes());
        customerReleaseDto.setCustomername(customerReleaseEntity.getCustomername());
        customerReleaseDto.setAddress1(customerReleaseEntity.getAddress1());
        customerReleaseDto.setAddress2(customerReleaseEntity.getAddress2());
        customerReleaseDto.setHouse(customerReleaseEntity.getHouse());
        customerReleaseDto.setCityno(customerReleaseEntity.getCityno());
        customerReleaseDto.setPhoneno(customerReleaseEntity.getPhoneno());
        customerReleaseDto.setAllotime(customerReleaseEntity.getAllotime());
        customerReleaseDto.setExpiretime(customerReleaseEntity.getExpiretime());
        customerReleaseDto.setStatus(customerReleaseEntity.getStatus());

        return customerReleaseDto;
    }

    //Converted DTO to Entity

    private CustomerReleaseEntity mapToEntity(CustomerReleaseDto customerReleaseDto){
        CustomerReleaseEntity customerReleaseEntity=new CustomerReleaseEntity();


        customerReleaseEntity.setLckrid(customerReleaseDto.getLckrid());
        customerReleaseEntity.setDrwerid(customerReleaseDto.getDrwerid());
        customerReleaseEntity.setAcnumber(customerReleaseDto.getAcnumber());
        customerReleaseEntity.setActitle(customerReleaseDto.getActitle());
        customerReleaseEntity.setDeproduct(customerReleaseDto.getDeproduct());
        customerReleaseEntity.setFcvalue(customerReleaseDto.getFcvalue());
        customerReleaseEntity.setMvalue(customerReleaseDto.getMvalue());
        customerReleaseEntity.setCvalue(customerReleaseDto.getCvalue());
        customerReleaseEntity.setCtype(customerReleaseDto.getCtype());
        customerReleaseEntity.setCtypedes(customerReleaseDto.getCtypedes());
        customerReleaseEntity.setCustomername(customerReleaseDto.getCustomername());
        customerReleaseEntity.setAddress1(customerReleaseDto.getAddress1());
        customerReleaseEntity.setAddress2(customerReleaseDto.getAddress2());
        customerReleaseEntity.setHouse(customerReleaseDto.getHouse());
        customerReleaseEntity.setCityno(customerReleaseDto.getCityno());
        customerReleaseEntity.setPhoneno(customerReleaseDto.getPhoneno());
        customerReleaseEntity.setAllotime(customerReleaseDto.getAllotime());
        customerReleaseEntity.setExpiretime(customerReleaseDto.getExpiretime());
        customerReleaseEntity.setStatus(customerReleaseDto.getStatus());

        return customerReleaseEntity;
    }

}
