package com.factory_method.samples.simple_factory;

public enum CarType {
    ELECTRIC("electric","전기차"),
    GASOLINE("gasoline","휘발유차");
    private final String en_name;
    private final String kr_name;
    CarType(String en_name,String kr_name){
        this.en_name = en_name;
        this.kr_name = kr_name;
    }

    public String getEn_name() {
        return en_name;
    }

    public String getKr_name() {
        return kr_name;
    }
}
