package com.experiments.wicket.Link;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;

public class LambdaLink<T> extends Link<T>{
	
	private static final long serialVersionUID = -1L;

	private SerializableConsumer<T> consumer;
	
	public LambdaLink(String id) {
		super(id);
	}

	public LambdaLink(String id, IModel<T> model) {
		super(id, model);
	}

	public LambdaLink(String id, SerializableConsumer<T> consumer) {
		super(id);
		this.consumer = consumer;
	}
	
	@Override
	public void onClick() {

		try{
		  consumer.accept(getModelObject());
		}catch(NullPointerException e){
		}
	}

}
