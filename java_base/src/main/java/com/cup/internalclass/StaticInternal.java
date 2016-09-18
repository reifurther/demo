package com.cup.internalclass;

/**
 * Created by reifurther on 16/9/18.
 */
public class StaticInternal {

    private String name = "face";

    static class InnClass {
        private String userId = "9000000";
        public String insIdCd = "00010000";

        private String getInsIdCd(){
            return this.insIdCd;
        }
    }

    public static void main(String[] args) {
        StaticInternal si = new StaticInternal();
        System.out.println(si.name);

        InnClass ic = new InnClass();
        System.out.println(ic.getInsIdCd());
    }
}
