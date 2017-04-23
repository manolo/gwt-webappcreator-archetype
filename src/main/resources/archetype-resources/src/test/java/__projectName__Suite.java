#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.client.${projectName}Test;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ${projectName}Suite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for Test");
    suite.addTestSuite(${projectName}Test.class);
    return suite;
  }
}
