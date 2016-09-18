package com.cup.internalclass;

/**
 * Created by reifurther on 16/9/18.
 */
public class NoStaticInternal {

    private String name = "face";

    class Internal{
        private String userId = "9000000";
        public String insIdCd = "00010000";

        private String getInsIdCd(){
            return this.insIdCd;
        }
    }

    public static void main(String[] args) {
        NoStaticInternal nsi = new NoStaticInternal();
        System.out.println(nsi.name);

        //need to instantiation out_class first.
        Internal in = nsi.new Internal();

        System.out.println(in.getInsIdCd());

    }
}
