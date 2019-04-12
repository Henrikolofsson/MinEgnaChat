package Client;

import java.io.Serializable;

public class Client implements Serializable {
    private static final long serialVersionUID = -15850404394466340L;
    private String ipAddress;
    private String username;

    public Client(String ipAddress, String username){
        this.ipAddress = ipAddress;
        this.username = username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
