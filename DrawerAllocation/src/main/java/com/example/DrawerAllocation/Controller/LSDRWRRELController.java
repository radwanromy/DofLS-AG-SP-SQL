package com.example.DrawerAllocation.Controller;
import com.example.DrawerAllocation.DTO.LSDRWRRELDto;
import com.example.DrawerAllocation.Service.LSDRWRRELService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/posts")
public class LSDRWRRELController {

    private LSDRWRRELService lsdrwrrelService;

    public LSDRWRRELController(LSDRWRRELService lsdrwrrelService) {
        this.lsdrwrrelService = lsdrwrrelService;
    }
//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getRelease")
    public List<LSDRWRRELDto> GetAllRelease(){
        return lsdrwrrelService.GetAllLSDRWRREL();
    }


//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{RELID}")
    public ResponseEntity<LSDRWRRELDto> getLSDRWRRELById(@PathVariable(name = "RELID") long RELID){
        return ResponseEntity.ok(lsdrwrrelService.getByRelId(RELID));
    }

//    @GetMapping("/{ACTYPE}")
//    public ResponseEntity<LSDRWRRELDto>  getLSDRWRRELByString(@PathVariable(name = "ACTYPE") String ACTYPE){
//        return ResponseEntity.ok(lsdrwrrelService.getByAcType(ACTYPE));
//    }

//    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/post")
    public ResponseEntity<LSDRWRRELDto> createLSDRWRREL(@RequestBody LSDRWRRELDto lsdrwrrelDto){
        return new ResponseEntity<>(lsdrwrrelService.createLSDRWRREL(lsdrwrrelDto), HttpStatus.CREATED);

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{RELID}")
    public ResponseEntity<LSDRWRRELDto> updateLSDRWRREL(@RequestBody LSDRWRRELDto lsdrwrrelDto, @PathVariable(name = "RELID") long RELID){
        LSDRWRRELDto lsdrwrrelResponse = lsdrwrrelService.updateLSDRWRREL(lsdrwrrelDto, RELID);
        return new ResponseEntity<>(lsdrwrrelResponse, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{RELID}")
    public ResponseEntity<String> deleteLSDRWRREL(@PathVariable(name="RELID") long RELID){
        lsdrwrrelService.deleteLSDRWRRELById(RELID);
        return new ResponseEntity<>("Locker entity deleted successfully.", HttpStatus.OK);
    }
    //    //delete Post Rest Api
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
//        postService.deletePostById(id);
//        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
//
//    }

//Update
//    //Update Post By ID rest API
//    @PutMapping("/{id}")
//    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable(name = "id") long id) {
//        PostDto postResponse = postService.updatePost(postDto, id);
//        return new ResponseEntity<>(postResponse, HttpStatus.OK);
//
//    }

}
