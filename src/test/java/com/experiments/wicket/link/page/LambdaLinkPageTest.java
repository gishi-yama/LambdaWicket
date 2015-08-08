package com.experiments.wicket.link.page;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.experiments.wicket.WicketApplication;
import com.experiments.wicket.Link.page.FooPage;
import com.experiments.wicket.Link.page.LambdaLinkPage;

/**
 * Simple test using the WicketTester
 */
public class LambdaLinkPageTest
{
  private WicketTester tester;

  @Before
  public void setUp() {
    tester = new WicketTester(new WicketApplication());
  }

  @Test
  public void ページの表示に成功する() {
    tester.startPage(LambdaLinkPage.class);
    tester.assertRenderedPage(LambdaLinkPage.class);
  }

  @Test
  public void リンクを押すとFooPageに移動する() {
    tester.startPage(LambdaLinkPage.class);
    tester.clickLink("lambdaLink");
    tester.assertRenderedPage(FooPage.class);
  }
}
