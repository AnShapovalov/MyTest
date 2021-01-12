package com.jc.state.item.status;

import static java.util.EnumSet.of;

public class InProcessValidator extends TargetValidator {
    public InProcessValidator() {
        super(ItemStateName.IN_PROCESS,
                of(ItemStateName.AVAILABLE,
                        ItemStateName.UNAVAILABLE,
                        ItemStateName.RESTRICTED));
    }
}
