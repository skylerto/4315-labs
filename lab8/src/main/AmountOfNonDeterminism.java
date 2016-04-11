package main;

import java.io.PrintWriter;

import gov.nasa.jpf.report.Publisher;
import gov.nasa.jpf.report.PublisherExtension;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.search.SearchListener;
import gov.nasa.jpf.search.SearchListenerAdapter;
/**
 * @author Copyright (c) 2015 Skyler Layne All Rights Reserved.
 */
public class AmountOfNonDeterminism extends SearchListenerAdapter implements SearchListener, PublisherExtension {
	/**
	 * Class variables.
	 */
	private int amount;

	/**
	 * Constructor.
	 */
	public AmountOfNonDeterminism(Config c, JPF jpf) {
		this.amount = 0;
    jpf.addPublisherExtension(Publisher.class, this);
	}

  /**
   * [stateProcessed description]
   * @param search [description]
   */
	public void stateProcessed(Search search){
		this.amount++;
	}

	@Override
	public void publishConstraintHit(Publisher arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void publishFinished(Publisher arg0) {
	   arg0.getOut().println("======================================================\n"+ "maximum amount of nondeterminism: " + this.amount + " choice(s)");

	}


	@Override
	public void publishStart(Publisher arg0) {
			   arg0.getOut().println("======================================================\n"+ "maximum amount of nondeterminism: " + this.amount + " choice(s)");
         arg0.getOut().flush();

	}

	@Override
	public void publishTransition(Publisher arg0) {
		// TODO Auto-generated method stub

	}
}
