package com.jc.state;

import com.jc.state.item.status.InProcessValidator;
import com.jc.state.item.status.ItemStateName;
import com.jc.state.item.status.TargetValidator;

public class Main {
    public static void main(String[] params) {
        TargetValidator validator = new InProcessValidator();
        System.out.println(validator.getItemStateNameValidate()+" Testing for:"
                + ItemStateName.WITHDRAWN + " is "+validator.isStateAllowed(ItemStateName.WITHDRAWN));

    }
}
