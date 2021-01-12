package com.jc.state.item.status;

import java.util.Optional;

public class ItemStatusTargetValidatorFactory {
    private static ItemStatusTargetValidatorFactory instance = new ItemStatusTargetValidatorFactory();

    public static ItemStatusTargetValidatorFactory getInstance() {
        return instance;
    }

    private ItemStatusTargetValidatorFactory() {

    }

    public static Optional<TargetValidator> getTargetValidatorForItemStatusName (ItemStateName itemStateName) {
        Optional<TargetValidator> result = null;

        return result;
    }
}
