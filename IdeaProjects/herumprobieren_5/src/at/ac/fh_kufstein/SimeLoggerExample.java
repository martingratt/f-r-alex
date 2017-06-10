package at.ac.fh_kufstein;


import org.omg.CORBA.Object;

import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.FileHandler;

class SimpleLoggerExample {

    private static final Logger log = Logger.getLogger(SimpleLoggerExample.class.getName());

    public static void main (String []args)throws IOException{
        try {
            ((Object)null).toString();
        }catch (Exception e){
            log.severe("An errror occured");
        }

    }





}
