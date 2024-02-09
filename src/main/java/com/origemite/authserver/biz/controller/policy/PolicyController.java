package com.origemite.authserver.biz.controller.policy;


import com.origemite.authserver.biz.controller.policy.vo.ReqPolicySave;
import com.origemite.authserver.biz.service.PolicyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/policy")
@CrossOrigin
public class PolicyController {

    private final PolicyService policyService;

    @PostMapping({"","/"})
    public ResponseEntity PolociSave(@RequestBody ReqPolicySave dto){

        policyService.PolociSave(dto);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
