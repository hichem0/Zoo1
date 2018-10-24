package main.java.com.fges.rizomm.m1.zoo.animals;

public enum Reproduction {

    Dog { public String prod() { return "mammal"; } },
    Cat { public String prod() { return "mammal"; } },
    Lion { public String prod() { return "mammal"; } },
    Horse { public String prod() { return "mammal"; } },
    Pig { public String prod() { return "mammal"; } },
    Hornet { public String prod() { return "ovpare"; } },
    Bee { public String prod() { return "ovipare"; } },
    Raven    { public String prod() { return "ovipare"; } };

    abstract public String prod();
}

