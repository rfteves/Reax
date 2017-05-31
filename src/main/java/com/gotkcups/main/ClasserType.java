/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

/**
 *
 * @author rfteves
 */
@FunctionalInterface
public interface ClasserType {

    enum Types {
        RootType,
        ClassType,
        FieldType,
        DateType,
        BigIntegerType,
        StringType,
        BooleanType,
        BigDecimalType,
        CollectionType,
        UnknownType,
        NullType,
        MapType;

        public String typed() {
            Types value = this;
            if (value.equals(Types.DateType)) {
                return "Date";
            } else if (value.equals(Types.BigDecimalType)) {
                return "BigDecimal";
            } else if (value.equals(Types.BigIntegerType)) {
                return "BigInteger";
            } else if (value.equals(Types.BooleanType)) {
                return "boolean";
            } else if (value.equals(Types.StringType) ||
                    value.equals(Types.NullType)) {
                return "String";
            } else {
                return "Unknown";
            }
        }
    };

    boolean ok();
}
