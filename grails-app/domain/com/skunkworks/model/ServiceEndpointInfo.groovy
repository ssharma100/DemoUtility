package com.skunkworks.model

class ServiceEndpointInfo {
    String name
    String url
    String domain
    String user
    String passwd
    
    static constraints = {
        name (nullable: false)
        url  (nullable: false, blank)        
    }
}
