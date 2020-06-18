package com.corlett.coolstuff.controller;

import com.corlett.coolstuff.model.Node;
import com.corlett.coolstuff.service.IsUnique;
import com.corlett.coolstuff.service.Reverse;
import com.corlett.coolstuff.util.Utility;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Controller
@EnableSwagger2
public class CoolStuffController {

    @PostMapping("/v1/reverse")
    public ResponseEntity<String> reverseLinkedList(@RequestBody List<String> Nodes) {

        Node head = Reverse.reverseMe(Utility.buildLinkedList(Nodes));

        String res = Utility.stringify(head);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("v1/isunique")
    public ResponseEntity<Boolean> isUnique(@RequestBody String input) {

        return new ResponseEntity<>(IsUnique.isUnique(input), HttpStatus.OK);
    }
}
