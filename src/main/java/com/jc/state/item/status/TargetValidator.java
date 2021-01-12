package com.jc.state.item.status;

import java.util.EnumSet;

public abstract class TargetValidator {
    private ItemStateName itemStateNameValidate;
    private EnumSet<ItemStateName> ALLOWED_STATUSES;

    public TargetValidator(ItemStateName itemStateNameValidate, EnumSet<ItemStateName> ALLOWED_STATUSES) {
        this.itemStateNameValidate = itemStateNameValidate;
        this.ALLOWED_STATUSES = ALLOWED_STATUSES;
    }

    public ItemStateName getItemStateNameValidate() {
        return itemStateNameValidate;
    }
    public boolean isStateAllowed(ItemStateName name) {
        return  ALLOWED_STATUSES.contains(name);
    }

}
