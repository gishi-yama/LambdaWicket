package com.experiments.wicket.Link.page;

import org.apache.wicket.markup.html.WebPage;

import com.experiments.wicket.Link.LambdaLink;

public class LambdaLinkPage extends WebPage {

  private static final long serialVersionUID = -5158423215891338365L;

  public LambdaLinkPage() {

    add(new LambdaLink<Void>(
        "lambdaLink", model -> setResponsePage(FooPage.class)));
  }
}