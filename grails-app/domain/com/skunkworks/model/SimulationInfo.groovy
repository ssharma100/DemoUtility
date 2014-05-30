package com.skunkworks.model

class SimulationInfo {
    String name
    String owner = "everone"
    Date created
    
    
    static constraints = {
        name(nullable: false, blank: false)
        create(nullable: false)
        
    }
    
}
