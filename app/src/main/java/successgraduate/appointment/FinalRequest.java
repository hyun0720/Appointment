package successgraduate.appointment;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by owner on 2017-05-07.
 */

public class FinalRequest extends StringRequest {
    final static private String URL = "http://zzcandy.cafe24.com/Final2.php";
    private Map<String, String> parameters;

    public FinalRequest(String userID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }
    public  Map<String,String> getParams(){
        return parameters;
    }

}