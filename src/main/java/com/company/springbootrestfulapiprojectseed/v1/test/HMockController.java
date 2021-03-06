/*
 * Copyright (c) 2018.  kyyee All rights reserved.
 */

package com.company.springbootrestfulapiprojectseed.v1.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hMock")
@CrossOrigin
public class HMockController {
    private static final Logger logger = LoggerFactory.getLogger(HMockController.class);

}
