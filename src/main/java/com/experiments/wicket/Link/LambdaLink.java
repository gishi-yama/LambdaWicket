package com.experiments.wicket.Link;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;

public class LambdaLink<T> extends Link<T>{
	
	private static final long serialVersionUID = -1L;

	private Runnable clickEvent;
	
	public LambdaLink(String id) {
		super(id);
	}

	public LambdaLink(String id, IModel<T> model) {
		super(id, model);
	}

	public LambdaLink(String id, Runnable clickEvent) {
		super(id);
		this.clickEvent = clickEvent;
	}
	
	@Override
	public void onClick() {

		try{
			clickEvent.run();
		}catch(NullPointerException e){
		}
	}

}
