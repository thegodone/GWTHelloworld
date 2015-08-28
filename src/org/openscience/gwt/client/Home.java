package org.openscience.gwt.client;

import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.exception.InvalidSmilesException;
import org.openscience.cdk.interfaces.IAtomContainer;
//import org.openscience.cdk.qsar.DescriptorEngine;
import org.openscience.cdk.smiles.SmilesParser;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootPanel.get().add(new Label("Hello, World!"));
	    SmilesParser smilesParser = new SmilesParser(DefaultChemObjectBuilder.getInstance());
	    String smiles = "c1cc(CC=CC#N)ccn1";
	    try {
			IAtomContainer molecule = smilesParser.parseSmiles(smiles);
			RootPanel.get().add(new Label("get Molecule"));
			
			// initialize the Molecule object
			//DescriptorEngine engine = new DescriptorEngine();
			//engine.process(molecule);

		} catch (InvalidSmilesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RootPanel.get().add(new Label("bug"));
		}
		
		
	}

}
