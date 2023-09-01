package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class TimedMsg {

    @JsonProperty(required = true)
    public Instant timestamp;
    @JsonProperty(required = true)
    public String msg;

}
