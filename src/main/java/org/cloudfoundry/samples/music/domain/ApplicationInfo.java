package org.cloudfoundry.samples.music.domain;

public class ApplicationInfo {
    private String[] profiles;
    private String[] services;
    private String index;

    public ApplicationInfo(String[] profiles, String[] services, String index) {
        this.profiles = profiles;
        this.services = services;
        this.index = index;
    }

    public String[] getProfiles() {
        return profiles;
    }

    public void setProfiles(String[] profiles) {
        this.profiles = profiles;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
