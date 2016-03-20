package io.weba.eventor.domain.event.payload;

import io.weba.eventor.domain.exception.EventorException;
import io.weba.eventor.infrastructure.event.mine.HttpContext;

public interface Factory {
    Payload createPayload(HttpContext httpContext) throws EventorException;
}