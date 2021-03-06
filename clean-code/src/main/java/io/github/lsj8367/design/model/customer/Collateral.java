package io.github.lsj8367.design.model.customer;

/**
 * Collateral Model API.
 */
public interface Collateral {

    long getId();

    String getName();

    CollateralType getType();

}
