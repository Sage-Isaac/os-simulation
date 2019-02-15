// Alec

import java.util.Date;
import java.util.Map;

public class User {
    private String username;              // 32-char limit, no spaces or special characters allowed.
    private String password;              // encrypt this info
    private String accountID;             // a unique 16-char long string
    private int permissionLevel;          // lookup how chmod works
    private long epochSessionStartTime;   // when the session began
    private Map<Date, Long> history  ;    // event history
    // ... more private data as you see fit.


}
