package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.test.JbpmJUnitBaseTestCase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample file to launch a process.
 */
public class BPMNTest extends JbpmJUnitBaseTestCase{

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-process");
			Map<String, Object> inputParams = new HashMap<String, Object>();
			inputParams.put("decision", true);
			inputParams.put("role", 3);
			// start a new process instance
			kSession.startProcess("WebinarLight",inputParams);
			
			System.out.println("BPMN-Run has finished");
		
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
