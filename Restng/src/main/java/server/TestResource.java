package server;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class TestResource extends ServerResource {
	private String testName;

    @Override
    public void doInit() {
    	super.doInit();
        this.testName = getAttribute("test");
    }

    @Get
    public Representation doGet() {
    	Representation response;
    	
    	if (testName == null) {
    		response = list();
    	} else {
    		response = getTestDetails();
    	}
    	
        return response;
    }
    
    private StringRepresentation list() {
    	return null;
    }
    
    private StringRepresentation getTestDetails() {
    	String jsonString;
		try {
			jsonString = new JSONObject().put("TestName", testName).toString();
		} catch (JSONException e) {
			jsonString = null;
		}
    	return new StringRepresentation(jsonString, MediaType.APPLICATION_JSON);
    }
}

