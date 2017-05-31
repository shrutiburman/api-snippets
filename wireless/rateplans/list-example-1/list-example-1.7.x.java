import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.wireless.v1.RatePlan;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        // Initialize the client
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        ResourceSet<RatePlan> ratePlans = RatePlan.reader().read();

        for (RatePlan ratePlan : ratePlans) {
            System.out.println(ratePlan);
        }
    }
}
