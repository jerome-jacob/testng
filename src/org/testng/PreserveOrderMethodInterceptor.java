package org.testng;

import java.util.Collections;
import java.util.List;

import org.testng.internal.MethodInstance;

/**
 * A method interceptor that preserves the order in which test classes were found in
 * the &lt;test&gt; tag.
 * 
 * @author cbeust
 *
 */
public class PreserveOrderMethodInterceptor implements IMethodInterceptor {

  @Override
  public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
    Collections.sort(methods, MethodInstance.SORT_BY_INDEX);
    return methods;
  }

}
