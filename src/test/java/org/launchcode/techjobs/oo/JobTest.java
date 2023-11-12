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
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String employer = String.valueOf(job.getEmployer());
        String actualEmployer = "ACME";
        assertEquals(employer , actualEmployer);
        String name = String.valueOf(job.getName());
        String actualName = "Product tester";
        assertEquals(name , actualName);
        String location = String.valueOf(job.getLocation());
        String actualLocation = "Desert";
        assertEquals(location , actualLocation);
        String position = String.valueOf(job.getPositionType());
        String actualposition = "Quality control";
        assertEquals(position , actualposition);
        String competency = String.valueOf(job.getCoreCompetency());
        String actualCompetency = "Persistence";
        assertEquals(competency , actualCompetency);

    }

    @Test
    public void testJobsForEquality(){
        Job test3 = new Job();
        Job test4 = new Job();
        assertNotEquals(test3.getId(),test4.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = job.toString();
        String firstChar = String.valueOf(testString.charAt(0));
        String lastChar = String.valueOf(testString.charAt(testString.length()-1));
        String line = System.lineSeparator();
        assertEquals(line, firstChar);
        assertEquals(line, lastChar);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));  String employer = String.valueOf(job.getEmployer());
        String actualEmployer = "ACME";
        assertEquals(employer , actualEmployer);
        String name = String.valueOf(job.getName());
        String actualName = "Product tester";
        assertEquals(name , actualName);
        String location = String.valueOf(job.getLocation());
        String actualLocation = "Desert";
        assertEquals(location , actualLocation);
        String position = String.valueOf(job.getPositionType());
        String actualposition = "Quality control";
        assertEquals(position , actualposition);
        String competency = String.valueOf(job.getCoreCompetency());
        String actualCompetency = "Persistence";
        assertEquals(competency , actualCompetency);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("Product tester", job.getName());
//        assertEquals("ACME", job.getEmployer());
        String location = String.valueOf(job.getLocation());
        String actualLocation = "";
        assertEquals(location , actualLocation);
    }
}
