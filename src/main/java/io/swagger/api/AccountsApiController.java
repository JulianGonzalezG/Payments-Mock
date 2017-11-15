package io.swagger.api;

import io.swagger.model.Account;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T15:17:16.485Z")

@Controller
public class AccountsApiController implements AccountsApi {



    public ResponseEntity<Account> accountsAccountIdGet(@ApiParam(value = "Account identifier",required=true ) @PathVariable("accountId") Long accountId) {
        // do some magic!
        return new ResponseEntity<Account>(HttpStatus.OK);
    }

}
