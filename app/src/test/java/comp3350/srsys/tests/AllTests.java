package comp3350.srsys.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import comp3350.srsys.tests.business.AccessCoursesTest;
import comp3350.srsys.tests.business.AccessSCTest;
import comp3350.srsys.tests.business.AccessStudentsTest;
import comp3350.srsys.tests.objects.CourseTest;
import comp3350.srsys.tests.objects.SCTest;
import comp3350.srsys.tests.objects.StudentTest;
import comp3350.srsys.tests.business.CalculateGPATest;
import comp3350.srsys.tests.persistence.DataAccessTest;

public class AllTests
{
	public static TestSuite suite;

    public static Test suite()
    {
        suite = new TestSuite("All tests");
        testObjects();
        testBusiness();
        testPersistence();
        return suite;
    }

    private static void testObjects()
    {
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseTest.class);
        suite.addTestSuite(SCTest.class);
    }

    private static void testBusiness()
    {
        suite.addTestSuite(CalculateGPATest.class);
        suite.addTestSuite(AccessStudentsTest.class);
        suite.addTestSuite(AccessCoursesTest.class);
        suite.addTestSuite(AccessSCTest.class);
    }

    private static void testPersistence()
    {
        suite.addTestSuite(DataAccessTest.class);
    }
}
