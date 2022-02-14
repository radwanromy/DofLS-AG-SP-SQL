package com.example.DrawerAllocation.Service.Impl;

import com.example.DrawerAllocation.DTO.LSDRWRRELDto;
import com.example.DrawerAllocation.Entity.CustomerReleaseEntity;
import com.example.DrawerAllocation.Entity.LSDRWRRELEntity;
import com.example.DrawerAllocation.Exception.ResourceNotFoundException;
import com.example.DrawerAllocation.Exception.ResourceNotFoundException2;
import com.example.DrawerAllocation.Repository.LSDRWRRELRepository;
import com.example.DrawerAllocation.Service.LSDRWRRELService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LSDRWRRELServiceImpl implements LSDRWRRELService {


    private LSDRWRRELRepository lsdrwrrelRepository;

    public LSDRWRRELServiceImpl(LSDRWRRELRepository lsdrwrrelRepository) {
        this.lsdrwrrelRepository = lsdrwrrelRepository;
    }

    @Override
    public List<LSDRWRRELDto> GetAllLSDRWRREL() {
        List<LSDRWRRELEntity> lsdrwrrelEntities= lsdrwrrelRepository.findAll();
        return lsdrwrrelEntities.stream().map
                (lsdrwrrelEntity -> mapToDTO(lsdrwrrelEntity)).collect(Collectors.toList());
    }

    @Override
    public LSDRWRRELDto getByRelId(long RELID) {
        LSDRWRRELEntity lsdrwrrelEntity= lsdrwrrelRepository.findById(RELID).orElseThrow(()->new ResourceNotFoundException("LSDRWRRELEntity","RELID",RELID));
        return mapToDTO(lsdrwrrelEntity);
    }

//    @Override
//    public LSDRWRRELDto getByAcType(String ACTYPE) {
////        String A="hyg";
////        String B="hyf";
////        Example<user> example = Example.of(new user(A,B));
////        LSDRWRRELEntity lsdrwrrelEntity= lsdrwrrelRepository.findBy().orElseThrow(()->new ResourceNotFoundException2("LSDRWRRELEntity","ACTYPE",ACTYPE));
//        LSDRWRRELEntity lsdrwrrelEntity= (LSDRWRRELEntity) lsdrwrrelRepository.findAll();
//        return mapToDTO(lsdrwrrelEntity);
//    }

    @Override
    public LSDRWRRELDto createLSDRWRREL(LSDRWRRELDto lsdrwrrelDto) {
        LSDRWRRELEntity lsdrwrrelEntity= mapToEntity(lsdrwrrelDto);
        LSDRWRRELEntity newlsdrwrrel=lsdrwrrelRepository.save(lsdrwrrelEntity);
        LSDRWRRELDto lsdrwrrelResponse = mapToDTO(newlsdrwrrel);
        return lsdrwrrelResponse;

    }

    @Override
    public LSDRWRRELDto updateLSDRWRREL(LSDRWRRELDto lsdrwrrelDto, long RELID) {
         LSDRWRRELEntity lsdrwrrelEntity= lsdrwrrelRepository.findById(RELID).orElseThrow(() ->new ResourceNotFoundException("LSDRWRRELEntity","RELID",RELID));

        lsdrwrrelEntity.setOPRBRANCD(lsdrwrrelDto.getOPRBRANCD());
        lsdrwrrelEntity.setCUSCOD(lsdrwrrelDto.getCUSCOD());
        lsdrwrrelEntity.setBRANCD(lsdrwrrelDto.getBRANCD());
        lsdrwrrelEntity.setACTYPE(lsdrwrrelDto.getACTYPE());
        lsdrwrrelEntity.setACTNUM(lsdrwrrelDto.getACTNUM());
        lsdrwrrelEntity.setLCKRID(lsdrwrrelDto.getLCKRID());
        lsdrwrrelEntity.setDRWRID(lsdrwrrelDto.getDRWRID());
        lsdrwrrelEntity.setRELDATE(lsdrwrrelDto.getRELDATE());
        lsdrwrrelEntity.setPAYSTAT(lsdrwrrelDto.getPAYSTAT());
        lsdrwrrelEntity.setREMARKS(lsdrwrrelDto.getREMARKS());
        lsdrwrrelEntity.setOPRSTAMP(lsdrwrrelDto.getOPRSTAMP());
        lsdrwrrelEntity.setOPRTIMSTAMP(lsdrwrrelDto.getOPRTIMSTAMP());
        lsdrwrrelEntity.setUPDATE_BY(lsdrwrrelDto.getUPDATE_BY());
        lsdrwrrelEntity.setUPDATE_DATE(lsdrwrrelDto.getUPDATE_DATE());
        lsdrwrrelEntity.setAPPFLG(lsdrwrrelDto.getAPPFLG());
        lsdrwrrelEntity.setAPPSTAMP(lsdrwrrelDto.getAPPSTAMP());
        lsdrwrrelEntity.setDOB(lsdrwrrelDto.getDOB());
        lsdrwrrelEntity.setAGE(lsdrwrrelDto.getAGE());
        lsdrwrrelEntity.setAPPTIMSTAMP(lsdrwrrelDto.getAPPTIMSTAMP());
        lsdrwrrelEntity.setADDONE(lsdrwrrelDto.getADDONE());
        lsdrwrrelEntity.setADDTWO(lsdrwrrelDto.getADDTWO());
        lsdrwrrelEntity.setHOUSE(lsdrwrrelDto.getHOUSE());
        lsdrwrrelEntity.setCITY(lsdrwrrelDto.getCITY());
        lsdrwrrelEntity.setPHONE(lsdrwrrelDto.getPHONE());


        lsdrwrrelEntity.setOCPATN(lsdrwrrelDto.getOCPATN());
        lsdrwrrelEntity.setEMAIL(lsdrwrrelDto.getEMAIL());
        lsdrwrrelEntity.setCNAME(lsdrwrrelDto.getCNAME());
         LSDRWRRELEntity updateLSDRWRREL = lsdrwrrelRepository.save(lsdrwrrelEntity);
         return mapToDTO(updateLSDRWRREL);

////        @Override
////        public PostDto updatePost(PostDto postDto, long id) {
////            // get Post by Id from the database
////            Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
////
////            post.setLckrid(postDto.getLckrid());
////            post.setLckrcod(postDto.getLckrcod());
////            post.setLckrnam(postDto.getLckrnam());
////            post.setVencod(postDto.getVencod());
////            post.setBrandcod(postDto.getBrandcod());
////            post.setNumofdrwr(postDto.getNumofdrwr());
////            post.setLckrdes(postDto.getLckrdes());
////            post.setRemarks(postDto.getRemarks());
////            post.setOprstamp(postDto.getOprstamp());
////            post.setOprtimstamp(postDto.getOprtimstamp());
////            post.setUpdstamp(postDto.getUpdstamp());
////            post.setUpdtimstamp(postDto.getUpdtimstamp());
////            post.setActflg(postDto.getActflg());
////            post.setBokflg(postDto.getBokflg());
////            post.setAppflg(postDto.getAppflg());
////            post.setAppstamp(postDto.getAppstamp());
////            post.setApptimstamp(postDto.getApptimstamp());
////
////            Post updatedPost = postRepository.save(post);
////            return mapToDTO(updatedPost);
////        }
    }

    @Override
    public void deleteLSDRWRRELById(long RELID) {
        LSDRWRRELEntity lsdrwrrelEntity= lsdrwrrelRepository.findById(RELID).orElseThrow(()->new ResourceNotFoundException("LSDRWRRELEntity","RELID",RELID));
        lsdrwrrelRepository.delete(lsdrwrrelEntity);
    }

    //convert Entity into Dto
    private LSDRWRRELDto mapToDTO(LSDRWRRELEntity lsdrwrrelEntity){
        LSDRWRRELDto lsdrwrrelDto=new LSDRWRRELDto();

        lsdrwrrelDto.setRELID(lsdrwrrelEntity.getRELID());
        lsdrwrrelDto.setOPRBRANCD(lsdrwrrelEntity.getOPRBRANCD());
        lsdrwrrelDto.setCUSCOD(lsdrwrrelEntity.getCUSCOD());
        lsdrwrrelDto.setBRANCD(lsdrwrrelEntity.getBRANCD());
        lsdrwrrelDto.setACTYPE(lsdrwrrelEntity.getACTYPE());
        lsdrwrrelDto.setACTNUM(lsdrwrrelEntity.getACTNUM());
        lsdrwrrelDto.setLCKRID(lsdrwrrelEntity.getLCKRID());
        lsdrwrrelDto.setDRWRID(lsdrwrrelEntity.getDRWRID());
        lsdrwrrelDto.setRELDATE(lsdrwrrelEntity.getRELDATE());
        lsdrwrrelDto.setPAYSTAT(lsdrwrrelEntity.getPAYSTAT());
        lsdrwrrelDto.setREMARKS(lsdrwrrelEntity.getREMARKS());
        lsdrwrrelDto.setOPRSTAMP(lsdrwrrelEntity.getOPRSTAMP());
        lsdrwrrelDto.setOPRTIMSTAMP(lsdrwrrelEntity.getOPRTIMSTAMP());
        lsdrwrrelDto.setUPDATE_BY(lsdrwrrelEntity.getUPDATE_BY());
        lsdrwrrelDto.setUPDATE_DATE(lsdrwrrelEntity.getUPDATE_DATE());
        lsdrwrrelDto.setAPPFLG(lsdrwrrelEntity.getAPPFLG());
        lsdrwrrelDto.setAPPSTAMP(lsdrwrrelEntity.getAPPSTAMP());
        lsdrwrrelDto.setDOB(lsdrwrrelEntity.getDOB());
        lsdrwrrelDto.setAGE(lsdrwrrelEntity.getAGE());
        lsdrwrrelDto.setAPPTIMSTAMP(lsdrwrrelEntity.getAPPTIMSTAMP());
        lsdrwrrelDto.setADDONE(lsdrwrrelEntity.getADDONE());
        lsdrwrrelDto.setADDTWO(lsdrwrrelEntity.getADDTWO());
        lsdrwrrelDto.setHOUSE(lsdrwrrelEntity.getHOUSE());
        lsdrwrrelDto.setCITY(lsdrwrrelEntity.getCITY());
        lsdrwrrelDto.setPHONE(lsdrwrrelEntity.getPHONE());


        lsdrwrrelDto.setOCPATN(lsdrwrrelEntity.getOCPATN());
        lsdrwrrelDto.setEMAIL(lsdrwrrelEntity.getEMAIL());
        lsdrwrrelDto.setCNAME(lsdrwrrelEntity.getCNAME());
        return lsdrwrrelDto;
    }


    private LSDRWRRELEntity mapToEntity(LSDRWRRELDto lsdrwrrelDto){

        LSDRWRRELEntity lsdrwrrelEntity=new LSDRWRRELEntity();
        lsdrwrrelEntity.setRELID(lsdrwrrelDto.getRELID());

        lsdrwrrelEntity.setOPRBRANCD(lsdrwrrelDto.getOPRBRANCD());
        lsdrwrrelEntity.setCUSCOD(lsdrwrrelDto.getCUSCOD());
        lsdrwrrelEntity.setBRANCD(lsdrwrrelDto.getBRANCD());
        lsdrwrrelEntity.setACTYPE(lsdrwrrelDto.getACTYPE());
        lsdrwrrelEntity.setACTNUM(lsdrwrrelDto.getACTNUM());
        lsdrwrrelEntity.setLCKRID(lsdrwrrelDto.getLCKRID());
        lsdrwrrelEntity.setDRWRID(lsdrwrrelDto.getDRWRID());
        lsdrwrrelEntity.setRELDATE(lsdrwrrelDto.getRELDATE());
        lsdrwrrelEntity.setPAYSTAT(lsdrwrrelDto.getPAYSTAT());
        lsdrwrrelEntity.setREMARKS(lsdrwrrelDto.getREMARKS());
        lsdrwrrelEntity.setOPRSTAMP(lsdrwrrelDto.getOPRSTAMP());
        lsdrwrrelEntity.setOPRTIMSTAMP(lsdrwrrelDto.getOPRTIMSTAMP());
        lsdrwrrelEntity.setUPDATE_BY(lsdrwrrelDto.getUPDATE_BY());
        lsdrwrrelEntity.setUPDATE_DATE(lsdrwrrelDto.getUPDATE_DATE());
        lsdrwrrelEntity.setAPPFLG(lsdrwrrelDto.getAPPFLG());
        lsdrwrrelEntity.setAPPSTAMP(lsdrwrrelDto.getAPPSTAMP());
        lsdrwrrelEntity.setDOB(lsdrwrrelDto.getDOB());
        lsdrwrrelEntity.setAGE(lsdrwrrelDto.getAGE());
        lsdrwrrelEntity.setAPPTIMSTAMP(lsdrwrrelDto.getAPPTIMSTAMP());
        lsdrwrrelEntity.setADDONE(lsdrwrrelDto.getADDONE());
        lsdrwrrelEntity.setADDTWO(lsdrwrrelDto.getADDTWO());
        lsdrwrrelEntity.setHOUSE(lsdrwrrelDto.getHOUSE());
        lsdrwrrelEntity.setCITY(lsdrwrrelDto.getCITY());
        lsdrwrrelEntity.setPHONE(lsdrwrrelDto.getPHONE());


        lsdrwrrelEntity.setOCPATN(lsdrwrrelDto.getOCPATN());
        lsdrwrrelEntity.setEMAIL(lsdrwrrelDto.getEMAIL());
        lsdrwrrelEntity.setCNAME(lsdrwrrelDto.getCNAME());

        return lsdrwrrelEntity;
    }

}
