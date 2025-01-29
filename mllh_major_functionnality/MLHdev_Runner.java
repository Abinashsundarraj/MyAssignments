package mllh_major_functionnality;

import java.util.Collections;

import org.testng.TestNG;


public class MLHdev_Runner {
	static TestNG testobj;

	public static void main(String[] args) {
		testobj = new TestNG();

		// testobj.setTestSuites(List.of("./MLHAUTO.xml"));
//	String currentDirectory = System.getProperty("user.dir");
//	System.out.println(currentDirectory);
//   	testobj.setTestSuites(Collections.singletonList(currentDirectory+"/MLHAUTO.xml"));
	
	//testobj.setTestClasses(new Class[] { MLH_Auto.Solutationdashboard.class, MLH_Auto.Intakeonboarding.class,
				//MLH_Auto.Intakedelete.class, MLH_Auto.QNRDELETE.class});
	
	testobj.setTestClasses(new Class[] { MLH_dev.Mlhdev_Solutationdashboard.class,MLH_dev.Mlhdev_Intakeonboarding.class,
			MLH_dev.Mlhdev_QNRDELETE.class,MLH_dev.Mlhdev_Intakedelete.class});

		testobj.run();
	}
}