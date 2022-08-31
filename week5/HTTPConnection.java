package aaa;
public class HTTPConnection {
    private String address;
    private String port;
    private String token;

    private static HTTPConnection connection;
    private HTTPConnection(Builder builder){
        this.address=builder.address;
        this.port=builder.port;
        this.token=builder.token;
    }
    public static HTTPConnection GetConnection(String address,String port,String token){
        if(connection==null){
            connection=HTTPConnection.builder().
                setAddress(address).
                setport(port).
                settoken(token).
                build();
            return connection;
        }
        return connection;
    }
    public String GetAddress(){
        return address;
    }
    public String Getport(){
        return port;
    }
    public String Gettoken(){
        return token;
    }
    public String toString(){
        return address+" "+port+" "+token;
    }
    private static Builder builder(){
        if(connection!=null){
            throw new IllegalStateException("Builder created!");
        }
        return new Builder();
    }
    public static class Builder{
        private String address;
        private String port;
        private String token;
        public Builder setAddress(String address){
            this.address=address;
            return this;
        }
        public Builder setport(String port){
            this.port=port;
            return this;
        }
        public Builder settoken(String token){
            this.token=token;
            return this;
        }
        public HTTPConnection build() {
			return new HTTPConnection(this);
		}
    }
}