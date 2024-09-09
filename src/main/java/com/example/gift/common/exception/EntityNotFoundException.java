package com.example.gift.common.exception;

import com.example.gift.common.response.ErrorCode;

public class EntityNotFoundException extends BaseException {

    public EntityNotFoundException() {
        super(ErrorCode.COMMON_ENTITY_NOT_FOUND);
    }
    public EntityNotFoundException(String message) {
        super(message, ErrorCode.COMMON_ENTITY_NOT_FOUND);
    }
}
