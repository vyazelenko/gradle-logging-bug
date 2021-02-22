package test;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class JavaUtilLoggingOutput
{
    @Test
    void test()
    {
        System.out.println("Standard out");

        final Logger logger = Logger.getLogger(getClass().getName());
        logger.info("You should not see me!");

        throw new RuntimeException("But this you should!");
    }
}
