package me.blvckbytes.utilitytypes;

@FunctionalInterface
public interface FUnsafeSupplier<T, E extends Throwable> {

  T get() throws E;

}
