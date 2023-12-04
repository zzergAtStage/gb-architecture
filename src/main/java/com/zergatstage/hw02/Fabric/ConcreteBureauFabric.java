package com.zergatstage.hw02.Fabric;

public class ConcreteBureauFabric{
    private static ConcreteBureauFabric fabric;
    private ConcreteBureauFabric(){}
    public static ConcreteBureauFabric getInstance() {
        if (fabric == null) {
            synchronized (ConcreteBureauFabric.class){
                if (fabric == null) {
                    fabric = new ConcreteBureauFabric();
                }
            }
        }
        return fabric;
    }
    public BureauFabric getBureau(Class<? extends BureauFabric> bureauClass) {
        if (bureauClass.equals(EquiFax.class)) {
            return new EquiFax();
        } else if (bureauClass.equals(TransUnion.class)) {
            return new TransUnion();
        } else {
            throw new IllegalArgumentException("Не допустимый тип бюро!");
        }

    }
}
