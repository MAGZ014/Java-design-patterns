package org.magz014.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable{

    // Clonacion simple
    public T clone();

    // Clonacion profunda
    public T deepClone();
}
