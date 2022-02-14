package com.example.DrawerAllocation.Controller;

import com.example.DrawerAllocation.DTO.LSDRWRRELDto;
import com.example.DrawerAllocation.Service.LSDRWRRELService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/posts")

public class SecurityController {}

//    private SecurityService securityService;
//    public SecurityController(SecurityService securityService){
//        this.securityService = securityService;
//    }
//

    
//}
//
//public class LSDRWRRELController {
//    @GetMapping("/getRelease")
//    public List<LSDRWRRELDto> GetAllRelease() {
//        return lsdrwrrelService.GetAllLSDRWRREL();
//    }
//
//
//    //    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/{RELID}")
//    public ResponseEntity<LSDRWRRELDto> getLSDRWRRELById(@PathVariable(name = "RELID") long RELID) {
//        return ResponseEntity.ok(lsdrwrrelService.getByRelId(RELID));
//    }
//
//}