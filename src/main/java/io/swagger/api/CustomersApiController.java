package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Grouping;

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
public class CustomersApiController implements CustomersApi {



    public ResponseEntity<List<Grouping>> customersCustomerIdAccountsGet(@ApiParam(value = "Person Identifier",required=true ) @PathVariable("customerId") Long customerId) {
        // do some magic!
        return new ResponseEntity<List<Grouping>>(HttpStatus.OK);
    }

}
