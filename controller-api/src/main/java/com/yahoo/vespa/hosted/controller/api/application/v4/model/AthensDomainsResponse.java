// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.vespa.hosted.controller.api.application.v4.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.vespa.hosted.controller.api.identifiers.AthensDomain;

import java.util.List;

/**
 * @author gv
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AthensDomainsResponse extends JsonResponse<List<AthensDomain>> {
    public AthensDomainsResponse(List<AthensDomain> athensDomainList) {
        super(athensDomainList);
    }
}
