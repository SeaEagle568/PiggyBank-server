package com.seaeagle.pbmicroservice.handlers;

import com.seaeagle.pbmicroservice.dto.events.Event;
import org.springframework.stereotype.Service;

@Service
public class ChangeHandler implements Handler{
    @Override
    public HandlingResult handle(Event event) {
        return null;
    }


}