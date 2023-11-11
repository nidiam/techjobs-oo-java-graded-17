package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job test1 =new Job();
        Job test2 =new Job();
        assertNotEquals(test1.getId(),test2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job test3 = new Job();
        Job test4 = new Job();
        assertNotEquals(test3.getId(),test4.getId());
    }
}
